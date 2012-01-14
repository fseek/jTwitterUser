/*
 * Copyright (C) 2011  Thedeath<www.fseek.org>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fseek.jtwitteruser;

import java.awt.Color;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Thedeath<www.fseek.org>
 */
public class JTwitterUser
{

    /**
     * 
     * @param screenName
     * @return
     * @throws MalformedURLException
     * @throws IOException
     * @throws JSONException
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    public static User parseProfil(String screenName) throws MalformedURLException, IOException, JSONException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        URL url = new URL("http://twitter.com/users/show.json?screen_name="+screenName);
        Scanner scan = new Scanner(url.openStream());
        User u = new User();
        while(scan.hasNext())
        {
            String nextLine = scan.nextLine();
            JSONObject ob = new JSONObject(nextLine);
            u = (User)parseJSONObject(ob, u);
            //System.out.println(ob.toString());
        }
        return u;
    }
    
    private static HasFields parseJSONObject(JSONObject ob, HasFields destOb) throws JSONException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        for(Field f : destOb.getFields())
        {
            String typeName = f.getType().getCanonicalName();
            String fieldName = f.getName();
            // fix for field "protected" because fields cant be named "protected"
            try
            {
                if(fieldName.equals("tprotected"))
                {
                    fieldName = "protected";
                }
                //System.out.println(typeName);
                if(typeName.equals("java.lang.String"))
                {
                    String string = ob.getString(fieldName);
                    Method invokeSetterMethod = invokeSetterMethod(fieldName, typeName, destOb, string);
                }
                else if(typeName.equals("java.awt.Color"))
                {
                    String string = "0x" + ob.getString(fieldName);
                    Color col = Color.decode(string);
                    Method invokeSetterMethod = invokeSetterMethod(fieldName, typeName, destOb, col);
                }
                else if(typeName.equals("boolean"))
                {
                    Boolean bol = ob.getBoolean(fieldName);
                    Method invokeSetterMethod = invokeSetterMethod(fieldName, typeName, destOb, bol);
                }
                else if(typeName.equals("long"))
                {
                    long l = ob.getLong(fieldName);
                    Method invokeSetterMethod = invokeSetterMethod(fieldName, typeName, destOb, l);
                }
                else if(typeName.equals("int"))
                {
                    int i = ob.getInt(fieldName);
                    Method invokeSetterMethod = invokeSetterMethod(fieldName, typeName, destOb, i);
                }
                else if(typeName.equals(Status.class.getCanonicalName()))
                {
                    JSONObject jSONObject = ob.getJSONObject(fieldName);
                    Status s = new Status();
                    s = (Status) parseJSONObject(jSONObject,s);
                    Method invokeSetterMethod = invokeSetterMethod(fieldName, typeName, destOb, s);
                }
                else
                {
                    // if it reach this line, means that the typeName isnt supported yet
                    System.out.println(typeName);
                }
            }catch(JSONException ex)
            {
                // means that the field wasnt found, dont worry about it ;)
            }
        }
        return destOb;
    }
    
    private static Method invokeSetterMethod(String fieldName, String typeName, HasFields object, Object val) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        String methodName = fieldName.substring(1, fieldName.length());
        methodName =  "set" + Character.toUpperCase(fieldName.charAt(0)) + methodName;
        Class<?> forName = null;
        if(typeName.equals("boolean"))
        {
            forName = Boolean.class;
        }
        else if(typeName.equals("int"))
        {
            forName = Integer.class;
        }
        else if(typeName.equals("long"))
        {
            forName = Long.class;
        }
        else
        {
            forName = Class.forName(typeName);
        }
        // fix for field "protected" because fields cant be named "protected"
        if(methodName.equals("setProtected"))
        {
            methodName = "setTprotected";
        }
        Method method = object.getClass().getDeclaredMethod(methodName, forName);
        method.invoke(object, val);
        return method;
    }
}
