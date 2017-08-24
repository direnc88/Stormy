package com.treehouse.android.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;

import com.treehouse.android.stormy.R;
import com.treehouse.android.stormy.adapters.DayAdapter;
import com.treehouse.android.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        DayAdapter adapter = new DayAdapter(this, mDays);


        //String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        //this is an object that deals with generic types. The string is the type of objects the array handles.
        //adapters are required to display data to lists and grids from an api or similar data source.
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                //android.R.layout.simple_list_item_1,
                //daysOfTheWeek);
        //setting adapter as the default adapter for DailyForecastActivity
        //setListAdapter(adapter);
    }

}
