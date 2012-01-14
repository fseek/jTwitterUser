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
import java.lang.reflect.Field;
import java.util.Date;

/**
 * This is the main class with alls informations, don't rename the field !
 * @author Thedeath<www.fseek.org>
 */
public class User implements HasFields
{
    private String lang;
    private String time_zone;
    // 00 99 99 R G B
    private Color profile_link_color;
    private String description;
    private Status status;
    private boolean default_profile_image;
    // ee ee ee R G B
    private Color profile_sidebar_border_color;
    private String location;
    private boolean show_all_inline_media;
    private boolean geo_enabled;
    private boolean default_profile;
    private boolean profile_use_background_image;
    private String url;
    private String follow_request_sent;
    private boolean verified;
    // 13 15 16 R G B
    private Color profile_background_color;
    private int statuses_count;
    private String following;
    private String notifications;
    private String profile_background_image_url;
    private String created_at;
    private boolean tprotected;
    private long id_str;
    private boolean is_translator;
    private boolean contributors_enabled;
    // 33 33 33 R G B
    private Color profile_text_color;
    private String profile_image_url;
    private String name;
    private int listed_count;
    private int favourites_count;
    // ef ef ef R G B
    private Color profile_sidebar_fill_color;
    private long id;
    private boolean profile_background_tile;
    private int friends_count;
    private int followers_count;
    private String screen_name;

    /**
     * 
     * @param lang
     * @param time_zone
     * @param profile_link_color
     * @param description
     * @param status
     * @param default_profile_image
     * @param profile_sidebar_border_color
     * @param location
     * @param show_all_inline_media
     * @param geo_enabled
     * @param default_profile
     * @param profile_use_background_image
     * @param url
     * @param follow_request_sent
     * @param verified
     * @param profile_background_color
     * @param statuses_count
     * @param following
     * @param notifications
     * @param profile_background_image_url
     * @param created_at
     * @param tprotected
     * @param id_str
     * @param is_translator
     * @param contributors_enabled
     * @param profile_text_color
     * @param profile_image_url
     * @param name
     * @param listed_count
     * @param favourites_count
     * @param profile_sidebar_fill_color
     * @param id
     * @param profile_background_tile
     * @param friends_count
     * @param followers_count
     * @param screen_name
     */
    public User(String lang, String time_zone, Color profile_link_color, String description, Status status, boolean default_profile_image, Color profile_sidebar_border_color, String location, boolean show_all_inline_media, boolean geo_enabled, boolean default_profile, boolean profile_use_background_image, String url, String follow_request_sent, boolean verified, Color profile_background_color, Integer statuses_count, String following, String notifications, String profile_background_image_url, String created_at, boolean tprotected, Long id_str, boolean is_translator, boolean contributors_enabled, Color profile_text_color, String profile_image_url, String name, Integer listed_count, Integer favourites_count, Color profile_sidebar_fill_color, Long id, boolean profile_background_tile, Integer friends_count, Integer followers_count, String screen_name)
    {
        this.lang = lang;
        this.time_zone = time_zone;
        this.profile_link_color = profile_link_color;
        this.description = description;
        this.status = status;
        this.default_profile_image = default_profile_image;
        this.profile_sidebar_border_color = profile_sidebar_border_color;
        this.location = location;
        this.show_all_inline_media = show_all_inline_media;
        this.geo_enabled = geo_enabled;
        this.default_profile = default_profile;
        this.profile_use_background_image = profile_use_background_image;
        this.url = url;
        this.follow_request_sent = follow_request_sent;
        this.verified = verified;
        this.profile_background_color = profile_background_color;
        this.statuses_count = statuses_count;
        this.following = following;
        this.notifications = notifications;
        this.profile_background_image_url = profile_background_image_url;
        this.created_at = created_at;
        this.tprotected = tprotected;
        this.id_str = id_str;
        this.is_translator = is_translator;
        this.contributors_enabled = contributors_enabled;
        this.profile_text_color = profile_text_color;
        this.profile_image_url = profile_image_url;
        this.name = name;
        this.listed_count = listed_count;
        this.favourites_count = favourites_count;
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
        this.id = id;
        this.profile_background_tile = profile_background_tile;
        this.friends_count = friends_count;
        this.followers_count = followers_count;
        this.screen_name = screen_name;
    }

    /**
     * 
     */
    public User()
    {
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

    /**
     * @return the lang
     */
    public String getLang()
    {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(String lang)
    {
        this.lang = lang;
    }

    /**
     * @return the time_zone
     */
    public String getTime_zone()
    {
        return time_zone;
    }

    /**
     * @param time_zone the time_zone to set
     */
    public void setTime_zone(String time_zone)
    {
        this.time_zone = time_zone;
    }

    /**
     * @return the profile_link_color
     */
    public Color getProfile_link_color()
    {
        return profile_link_color;
    }

    /**
     * @param profile_link_color the profile_link_color to set
     */
    public void setProfile_link_color(Color profile_link_color)
    {
        this.profile_link_color = profile_link_color;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the status
     */
    public Status getStatus()
    {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status)
    {
        this.status = status;
    }

    /**
     * @return the default_profile_image
     */
    public boolean isDefault_profile_image()
    {
        return default_profile_image;
    }

    /**
     * @param default_profile_image the default_profile_image to set
     */
    public void setDefault_profile_image(Boolean default_profile_image)
    {
        this.default_profile_image = default_profile_image;
    }

    /**
     * @return the profile_sidebar_border_color
     */
    public Color getProfile_sidebar_border_color()
    {
        return profile_sidebar_border_color;
    }

    /**
     * @param profile_sidebar_border_color the profile_sidebar_border_color to set
     */
    public void setProfile_sidebar_border_color(Color profile_sidebar_border_color)
    {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    /**
     * @return the location
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    /**
     * @return the show_all_inline_media
     */
    public boolean isShow_all_inline_media()
    {
        return show_all_inline_media;
    }

    /**
     * @param show_all_inline_media the show_all_inline_media to set
     */
    public void setShow_all_inline_media(Boolean show_all_inline_media)
    {
        this.show_all_inline_media = show_all_inline_media;
    }

    /**
     * @return the geo_enabled
     */
    public boolean isGeo_enabled()
    {
        return geo_enabled;
    }

    /**
     * @param geo_enabled the geo_enabled to set
     */
    public void setGeo_enabled(Boolean geo_enabled)
    {
        this.geo_enabled = geo_enabled;
    }

    /**
     * @return the default_profile
     */
    public boolean isDefault_profile()
    {
        return default_profile;
    }

    /**
     * @param default_profile the default_profile to set
     */
    public void setDefault_profile(Boolean default_profile)
    {
        this.default_profile = default_profile;
    }

    /**
     * @return the profile_use_background_image
     */
    public boolean isProfile_use_background_image()
    {
        return profile_use_background_image;
    }

    /**
     * @param profile_use_background_image the profile_use_background_image to set
     */
    public void setProfile_use_background_image(Boolean profile_use_background_image)
    {
        this.profile_use_background_image = profile_use_background_image;
    }

    /**
     * @return the url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
     * @return the follow_request_sent
     */
    public String getFollow_request_sent()
    {
        return follow_request_sent;
    }

    /**
     * @param follow_request_sent the follow_request_sent to set
     */
    public void setFollow_request_sent(String follow_request_sent)
    {
        this.follow_request_sent = follow_request_sent;
    }

    /**
     * @return the verified
     */
    public boolean isVerified()
    {
        return verified;
    }

    /**
     * @param verified the verified to set
     */
    public void setVerified(Boolean verified)
    {
        this.verified = verified;
    }

    /**
     * @return the profile_background_color
     */
    public Color getProfile_background_color()
    {
        return profile_background_color;
    }

    /**
     * @param profile_background_color the profile_background_color to set
     */
    public void setProfile_background_color(Color profile_background_color)
    {
        this.profile_background_color = profile_background_color;
    }

    /**
     * @return the statuses_count
     */
    public Integer getStatuses_count()
    {
        return statuses_count;
    }

    /**
     * @param statuses_count the statuses_count to set
     */
    public void setStatuses_count(Integer statuses_count)
    {
        this.statuses_count = statuses_count;
    }

    /**
     * @return the following
     */
    public String getFollowing()
    {
        return following;
    }

    /**
     * @param following the following to set
     */
    public void setFollowing(String following)
    {
        this.following = following;
    }

    /**
     * @return the notifications
     */
    public String getNotifications()
    {
        return notifications;
    }

    /**
     * @param notifications the notifications to set
     */
    public void setNotifications(String notifications)
    {
        this.notifications = notifications;
    }

    /**
     * @return the profile_background_image_url
     */
    public String getProfile_background_image_url()
    {
        return profile_background_image_url;
    }

    /**
     * @param profile_background_image_url the profile_background_image_url to set
     */
    public void setProfile_background_image_url(String profile_background_image_url)
    {
        this.profile_background_image_url = profile_background_image_url;
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
     * @return the tprotected
     */
    public boolean isTprotected()
    {
        return tprotected;
    }

    /**
     * @param tprotected the tprotected to set
     */
    public void setTprotected(Boolean tprotected)
    {
        this.tprotected = tprotected;
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
     * @return the is_translator
     */
    public boolean isIs_translator()
    {
        return is_translator;
    }

    /**
     * @param is_translator the is_translator to set
     */
    public void setIs_translator(Boolean is_translator)
    {
        this.is_translator = is_translator;
    }

    /**
     * @return the contributors_enabled
     */
    public boolean isContributors_enabled()
    {
        return contributors_enabled;
    }

    /**
     * @param contributors_enabled the contributors_enabled to set
     */
    public void setContributors_enabled(Boolean contributors_enabled)
    {
        this.contributors_enabled = contributors_enabled;
    }

    /**
     * @return the profile_text_color
     */
    public Color getProfile_text_color()
    {
        return profile_text_color;
    }

    /**
     * @param profile_text_color the profile_text_color to set
     */
    public void setProfile_text_color(Color profile_text_color)
    {
        this.profile_text_color = profile_text_color;
    }

    /**
     * @return the profile_image_url
     */
    public String getProfile_image_url()
    {
        return profile_image_url;
    }

    /**
     * @param profile_image_url the profile_image_url to set
     */
    public void setProfile_image_url(String profile_image_url)
    {
        this.profile_image_url = profile_image_url;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the listed_count
     */
    public Integer getListed_count()
    {
        return listed_count;
    }

    /**
     * @param listed_count the listed_count to set
     */
    public void setListed_count(Integer listed_count)
    {
        this.listed_count = listed_count;
    }

    /**
     * @return the favourites_count
     */
    public Integer getFavourites_count()
    {
        return favourites_count;
    }

    /**
     * @param favourites_count the favourites_count to set
     */
    public void setFavourites_count(Integer favourites_count)
    {
        this.favourites_count = favourites_count;
    }

    /**
     * @return the profile_sidebar_fill_color
     */
    public Color getProfile_sidebar_fill_color()
    {
        return profile_sidebar_fill_color;
    }

    /**
     * @param profile_sidebar_fill_color the profile_sidebar_fill_color to set
     */
    public void setProfile_sidebar_fill_color(Color profile_sidebar_fill_color)
    {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
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
     * @return the profile_background_tile
     */
    public boolean isProfile_background_tile()
    {
        return profile_background_tile;
    }

    /**
     * @param profile_background_tile the profile_background_tile to set
     */
    public void setProfile_background_tile(Boolean profile_background_tile)
    {
        this.profile_background_tile = profile_background_tile;
    }

    /**
     * @return the friends_count
     */
    public Integer getFriends_count()
    {
        return friends_count;
    }

    /**
     * @param friends_count the friends_count to set
     */
    public void setFriends_count(Integer friends_count)
    {
        this.friends_count = friends_count;
    }

    /**
     * @return the followers_count
     */
    public Integer getFollowers_count()
    {
        return followers_count;
    }

    /**
     * @param followers_count the followers_count to set
     */
    public void setFollowers_count(Integer followers_count)
    {
        this.followers_count = followers_count;
    }

    /**
     * @return the screen_name
     */
    public String getScreen_name()
    {
        return screen_name;
    }

    /**
     * @param screen_name the screen_name to set
     */
    public void setScreen_name(String screen_name)
    {
        this.screen_name = screen_name;
    }

    
    
}
