package com.etc.gondikeyboard.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Rajesh Kumar Dhuria on 6/21/2021.
 * BrightWay Developer Team
 * hinditutor@gmail.com
 * Copyright (c) BWIIT
 */
public class Prefereces {
    public static void setKeyboardLanguage(Context c, String token){
        final SharedPreferences sharedPreferences = c.getSharedPreferences("MyPrefs",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("language", token);
        myEdit.apply();
    }

    public static String getKeyboardLanguage(Context c){
        final SharedPreferences sharedPreferences = c.getSharedPreferences("MyPrefs",MODE_PRIVATE);
        return sharedPreferences.getString("language", "0");
    }
}
