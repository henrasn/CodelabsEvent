package com.icehousecorp.retrofitlogger.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by randiwaranugraha on 5/3/16.
 */
public class PreferenceHelper {

    private SharedPreferences sharedPreferences;

    public PreferenceHelper(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public PreferenceHelper(Context context, String preferences) {
        this(context, preferences, Context.MODE_PRIVATE);
    }

    public PreferenceHelper(Context context, String preferences, int mode) {
        sharedPreferences = context.getSharedPreferences(preferences, mode);
    }

    private SharedPreferences.Editor getEditor() {
        return sharedPreferences.edit();
    }

    public void putString(String key, String value) {
        getEditor().putString(key, value).commit();
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public void putInt(String key, int value) {
        getEditor().putInt(key, value).commit();
    }

    public int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public void putLong(String key, long value) {
        getEditor().putLong(key, value).commit();
    }

    public long getLong(String key) {
        return sharedPreferences.getLong(key, 0);
    }

    public void putBoolean(String key, boolean value) {
        getEditor().putBoolean(key, value).commit();
    }

    public boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public void putFloat(String key, float value) {
        getEditor().putFloat(key, value).commit();
    }

    public float getFloat(String key) {
        return sharedPreferences.getFloat(key, 0f);
    }

    public void remove(String key) {
        getEditor().remove(key).commit();
    }
}