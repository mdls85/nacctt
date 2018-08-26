package com.example.mdls8.nacctt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AddWashroomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_washroom);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Double lat = intent.getDoubleExtra(MainActivity.USER_LAT,MainActivity.mDefaultLocation.latitude);
        double longi = intent.getDoubleExtra(MainActivity.USER_LONG,MainActivity.mDefaultLocation.longitude);

        Toast.makeText(this, lat.toString(), Toast.LENGTH_LONG).show();
    }
}
