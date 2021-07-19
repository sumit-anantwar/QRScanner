package com.sumitanantwar.qrscanner_poc;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.SyncStateContract;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

/**
 * Provides a themed instance of AppCompatActivity.
 */
public class ThemedAppCompatActivity extends AppCompatActivity {

    private static final String FOLLOW_SYSTEM = "-1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Load theme.
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //For api level below 28, Follow system fall backs to light mode
        Integer prefAppTheme = Integer.parseInt(prefs.getString(Constants.PREF_APP_THEME, FOLLOW_SYSTEM));
        AppCompatDelegate.setDefaultNightMode(prefAppTheme);
        super.onCreate(savedInstanceState);
    }

}
