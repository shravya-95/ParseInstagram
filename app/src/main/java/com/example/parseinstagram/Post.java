package com.example.parseinstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "desc";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }
    public void setDescription(String decsription){
        put(KEY_DESCRIPTION,decsription);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }
    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE,parseFile);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }
}