package com.example.mdls8.nacctt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

public class AddWashroomActivity extends AppCompatActivity {

    private double washroomLat;
    private double washroomLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_washroom);

        // Get the Intent that started this activity and extract the washroom location data
        Intent intent = getIntent();
        washroomLat = intent.getDoubleExtra(MainActivity.USER_LAT,MainActivity.mDefaultLocation.latitude);
        washroomLong = intent.getDoubleExtra(MainActivity.USER_LONG,MainActivity.mDefaultLocation.longitude);

        // initialize view with location data
        populateView();
    }

    private void populateView(){
        TextView latView = findViewById(R.id.latView);
        latView.setText((Double.toString(washroomLat)));

        TextView longView = findViewById(R.id.longView);
        longView.setText((Double.toString(washroomLong)));
    }

    public void saveWashroom(View view){
        Intent result_intent = new Intent();
        result_intent.putExtra("test", 1);
        setResult(MainActivity.ADD_TOILET_ACTIVITY,result_intent);
        finish();
    }
}
