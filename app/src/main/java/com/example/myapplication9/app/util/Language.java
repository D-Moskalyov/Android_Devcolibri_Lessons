package com.example.myapplication9.app.util;


public enum Language {

    ENGLISH("English"),
    RUSSIAN("Russian"),
    UKRAINIAN("Ukrainian");

    private String Language;

    Language(String language){
        this.Language = language;
    }

    public String getLanguage(){
        return  Language;
    }
}
