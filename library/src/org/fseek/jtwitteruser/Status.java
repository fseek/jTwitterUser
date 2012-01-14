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

import java.lang.reflect.Field;
import java.util.Date;

/**
 * 
 * @author Thedeath<www.fseek.org>
 */
public class Status implements  HasFields
{
    private String text;
    private String coordinates;
    private String in_reply_to_user_id;
    private String place;
    private String geo;
    private boolean favorited;
    private String source;
    private int retweet_count;
    private String in_reply_to_screen_name;
    private boolean truncated;
    private String created_at;
    private String in_reply_to_status_id_str;
    private long id_str;
    private String contributors;
    private boolean retweeted;
    private String in_reply_to_user_id_str;
    private long id;
    private Status retweeted_status;
    private String in_reply_to_status_id;

    /**
     * 
     */
    public Status()
    {
    }

    /**
     * 
     * @param text
     * @param coordinates
     * @param in_reply_to_user_id
     * @param place
     * @param geo
     * @param favorited
     * @param source
     * @param retweet_count
     * @param in_reply_to_screen_name
     * @param truncated
     * @param created_at
     * @param in_reply_to_status_id_str
     * @param id_str
     * @param contributors
     * @param retweeted
     * @param in_reply_to_user_id_str
     * @param id
     * @param retweeted_status
     * @param in_reply_to_status_id
     */
    public Status(String text, String coordinates, String in_reply_to_user_id, String place, String geo, Boolean favorited, String source, Integer retweet_count, String in_reply_to_screen_name, Boolean truncated, String created_at, String in_reply_to_status_id_str, Long id_str, String contributors, Boolean retweeted, String in_reply_to_user_id_str, Long id, Status retweeted_status, String in_reply_to_status_id)
    {
        this.text = text;
        this.coordinates = coordinates;
        this.in_reply_to_user_id = in_reply_to_user_id;
        this.place = place;
        this.geo = geo;
        this.favorited = favorited;
        this.source = source;
        this.retweet_count = retweet_count;
        this.in_reply_to_screen_name = in_reply_to_screen_name;
        this.truncated = truncated;
        this.created_at = created_at;
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        this.id_str = id_str;
        this.contributors = contributors;
        this.retweeted = retweeted;
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
        this.id = id;
        this.retweeted_status = retweeted_status;
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    /**
     * @return the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * @return the coordinates
     */
    public String getCoordinates()
    {
        return coordinates;
    }

    /**
     * @param coordinates the coordinates to set
     */
    public void setCoordinates(String coordinates)
    {
        this.coordinates = coordinates;
    }

    /**
     * @return the in_reply_to_user_id
     */
    public String getIn_reply_to_user_id()
    {
        return in_reply_to_user_id;
    }

    /**
     * @param in_reply_to_user_id the in_reply_to_user_id to set
     */
    public void setIn_reply_to_user_id(String in_reply_to_user_id)
    {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    /**
     * @return the place
     */
    public String getPlace()
    {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place)
    {
        this.place = place;
    }

    /**
     * @return the geo
     */
    public String getGeo()
    {
        return geo;
    }

    /**
     * @param geo the geo to set
     */
    public void setGeo(String geo)
    {
        this.geo = geo;
    }

    /**
     * @return the favorited
     */
    public Boolean isFavorited()
    {
        return favorited;
    }

    /**
     * @param favorited the favorited to set
     */
    public void setFavorited(Boolean favorited)
    {
        this.favorited = favorited;
    }

    /**
     * @return the source
     */
    public String getSource()
    {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source)
    {
        this.source = source;
    }

    /**
     * @return the retweet_count
     */
    public Integer getRetweet_count()
    {
        return retweet_count;
    }

    /**
     * @param retweet_count the retweet_count to set
     */
    public void setRetweet_count(Integer retweet_count)
    {
        this.retweet_count = retweet_count;
    }

    /**
     * @return the in_reply_to_screen_name
     */
    public String getIn_reply_to_screen_name()
    {
        return in_reply_to_screen_name;
    }

    /**
     * @param in_reply_to_screen_name the in_reply_to_screen_name to set
     */
    public void setIn_reply_to_screen_name(String in_reply_to_screen_name)
    {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    /**
     * @return the truncated
     */
    public Boolean isTruncated()
    {
        return truncated;
    }

    /**
     * @param truncated the truncated to set
     */
    public void setTruncated(Boolean truncated)
    {
        this.truncated = truncated;
    }

    /**
     * @return the created_at
     */
    public String getCreated_at()
    {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at)
    {
        this.created_at = created_at;
    }

    /**
     * @return the in_reply_to_status_id_str
     */
    public String getIn_reply_to_status_id_str()
    {
        return in_reply_to_status_id_str;
    }

    /**
     * @param in_reply_to_status_id_str the in_reply_to_status_id_str to set
     */
    public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str)
    {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    /**
     * @return the id_str
     */
    public Long getId_str()
    {
        return id_str;
    }

    /**
     * @param id_str the id_str to set
     */
    public void setId_str(Long id_str)
    {
        this.id_str = id_str;
    }

    /**
     * @return the contributors
     */
    public String getContributors()
    {
        return contributors;
    }

    /**
     * @param contributors the contributors to set
     */
    public void setContributors(String contributors)
    {
        this.contributors = contributors;
    }

    /**
     * @return the retweeted
     */
    public Boolean isRetweeted()
    {
        return retweeted;
    }

    /**
     * @param retweeted the retweeted to set
     */
    public void setRetweeted(Boolean retweeted)
    {
        this.retweeted = retweeted;
    }

    /**
     * @return the in_reply_to_user_id_str
     */
    public String getIn_reply_to_user_id_str()
    {
        return in_reply_to_user_id_str;
    }

    /**
     * @param in_reply_to_user_id_str the in_reply_to_user_id_str to set
     */
    public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str)
    {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * @return the retweeted_status
     */
    public Status getRetweeted_status()
    {
        return retweeted_status;
    }

    /**
     * @param retweeted_status the retweeted_status to set
     */
    public void setRetweeted_status(Status retweeted_status)
    {
        this.retweeted_status = retweeted_status;
    }

    /**
     * @return the in_reply_to_status_id
     */
    public String getIn_reply_to_status_id()
    {
        return in_reply_to_status_id;
    }

    /**
     * @param in_reply_to_status_id the in_reply_to_status_id to set
     */
    public void setIn_reply_to_status_id(String in_reply_to_status_id)
    {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }
    
    /**
     * 
     * @return
     */
    @Override
    public Field[] getFields()
    {
        Class<?> forName = this.getClass();
        return forName.getDeclaredFields();
    }
}
