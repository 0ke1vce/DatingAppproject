package com.quintus.labs.datingapp.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.quintus.labs.datingapp.Main.MainActivity;
import com.quintus.labs.datingapp.Matched.Matched_Activity;
import com.quintus.labs.datingapp.Profile.Profile_Activity;
import com.yourpackage.name.R;



public class TopNavigationViewHelper {

    private static final String TAG = "TopNavigationViewHelper";

    public static void setupTopNavigationView(BottomNavigationViewEx tv) {
        Log.d(TAG, "setupTopNavigationView: setting up navigationview");

        // Example of customizing navigation items:
        tv.setIconSize(24, 24);  // Set icon size (width, height)
        tv.setTextSize(10); // Set text size if titles are used
        tv.setActiveItem(0); // Optionally set the default active item
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Use item.getItemId() to determine which item was selected
                switch (item.getItemId()) {
                    case R.id.ic_profile:
                        // Start Profile Activity
                        Intent intent2 = new Intent(context, Profile_Activity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_main:
                        // Start Main Activity and clear the stack
                        Intent intent1 = new Intent(context, MainActivity.class);
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clears back stack
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_matched:
                        // Start Matched Activity
                        Intent intent3 = new Intent(context, Matched_Activity.class);
                        context.startActivity(intent3);
                        break;
                }

                return true;  // Mark the item as selected
            }
        });
    }

}
