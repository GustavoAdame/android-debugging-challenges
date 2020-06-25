package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {

    TextView tvDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);
        tvDay = (TextView) findViewById(R.id.tvDay);
        /* Figure it out by searching log message on Google */
        /* https://stackoverflow.com/questions/11189545/android-android-content-res-resourcesnotfoundexception-string-resource-id-0x */
        tvDay.setText(Integer.toString(getDayOfMonth()));
    }

    public int getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
