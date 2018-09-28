package com.example.mdls8.nacctt;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.mdls8.nacctt.models.Washroom;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class AddWashroomActivity extends AppCompatActivity implements OnMapReadyCallback {

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

        // get a handle to the fragment from layout and build the map
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map_toilet);

        mapFragment.getMapAsync(this);
    }

    public void saveWashroom(View view){

        // get location of dragged marker, etc. and store to firebase

        Intent result_intent = new Intent();
        result_intent.putExtra("test", 1);
        setResult(Activity.RESULT_OK,result_intent);
        finish();
    }

    @Override
    public void onMapReady(GoogleMap map) {

        // callback method to get a handle to the map object

        // set map type to hybrid to include satellite photograph data with road and feature labels
        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        // center map at user's location
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(washroomLat, washroomLong),15));

        // add draggable marker at current location for user to customize
        map.addMarker(new MarkerOptions()
                .position(new LatLng(washroomLat, washroomLong))
                .title("Pooper")
                .draggable(true));
    }
}

// present possible places user may be at as alternative to dragging marker