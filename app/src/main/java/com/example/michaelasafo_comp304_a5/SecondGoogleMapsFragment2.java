package com.example.michaelasafo_comp304_a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.michaelasafo_comp304_a5.ChineseCuisine.chinese;
import static com.example.michaelasafo_comp304_a5.GreekCuisine.greek;
import static com.example.michaelasafo_comp304_a5.IndianCuisine.indian;
import static com.example.michaelasafo_comp304_a5.ItalianCuisine.callit;

public class SecondGoogleMapsFragment2 extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(GoogleMap googleMap) {

            LatLng toronto = new LatLng(43.65310, -79.38327);
            if (callit == 0){//blue ristorante
                toronto = new LatLng(43.67270,-79.39590);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Blue Ristorante"));
            }
            if (callit == 1){  // carisma
                toronto = new LatLng(43.65059,-79.37598);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Carisma"));
            }
            if (callit == 2){//terroni
                toronto = new LatLng(43.65158,-79.37559);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Terroni"));
            }
            if (callit == 3){  // cucina
                toronto = new LatLng(43.70582,-79.47084);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Cucina"));
            }
            if (callit == 4){//sugo
                toronto = new LatLng(43.65845,-79.44206);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Sugo"));
            }
            if (callit == 5){  // trattoria
                toronto = new LatLng(43.65686,-79.41406);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Trattoria"));
            }
            if (callit == 20){  // fitoor
                toronto = new LatLng(43.61368,-79.69529);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Fitoor"));
                //"Fitoor Description", "Bombay Description", "Indian Description","Little India Description", "Bindia Indian Description", "Pukka Description"
            }
            if (callit == 21){  // bombay
                toronto = new LatLng(43.68743,-79.39394);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Bombay"));
                //"Fitoor Description", "Bombay Description", "Indian Description","Little India Description", "Bindia Indian Description", "Pukka Description"
            }
            if (callit == 22){  // indian
                toronto = new LatLng(43.67230,-79.69529);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Indian"));
                //"Fitoor Description", "Bombay Description", "Indian Description","Little India Description", "Bindia Indian Description", "Pukka Description"
            }
            if (callit == 23){  // little india
                toronto = new LatLng(43.65034,-79.38892);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Little India"));
                //"Fitoor Description", "Bombay Description", "Indian Description","Little India Description", "Bindia Indian Description", "Pukka Description"
            }
            if (callit == 24){  // bindia
                toronto = new LatLng(43.64859,-79.37199);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Bindia"));

                //"Fitoor Description", "Bombay Description", "Indian Description","Little India Description", "Bindia Indian Description", "Pukka Description"
            }
            if (callit == 25){  // pukka
                toronto = new LatLng(43.68704,-79.42905);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Pukka"));
                //"Fitoor Description", "Bombay Description", "Indian Description","Little India Description", "Bindia Indian Description", "Pukka Description"
            }
            if (callit == 30){  // momdimsum
                toronto = new LatLng(43.77382,-79.41450);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Momdimsum"));
            }
            if (callit == 31){  // tasteofchina
                toronto = new LatLng(43.65421,-79.39878);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Taste of China"));
            }
            if (callit == 32){  // hongshing
                toronto = new LatLng(43.65528,-79.38688);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Hong Shing"));
            }
            if (callit == 33){  // houseofgourmet
                toronto = new LatLng(43.65333,-79.39723);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("House of Gourmet"));
            }
            if (callit == 34){  // perfectchinese
                toronto = new LatLng(43.78783,-79.27024);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Perfect Chinese"));
            }
            //    String mTitle[]={"Souv Like", "Tzatziki", "Greek In The Village", "Alexandros", "Mezes", "Volos Greek"};
            if (callit == 40){  // SouvLike
                toronto = new LatLng(43.67957,-79.34542);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("SouvLike"));
            }

            if (callit == 41){  // Tzatziki
                toronto = new LatLng(43.68392,-79.34653);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Tzatziki"));
            }
            if (callit == 42){  // GreekInTheVillage
                toronto = new LatLng(43.66432,-79.41608);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Greek In The Village"));
            }
            if (callit == 43){  // Alexandros
                toronto = new LatLng(43.66273,-79.37902);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Alexandros"));
            }
            if (callit == 44){  // Mezes
                toronto = new LatLng(43.67796,-79.35029);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Mezes"));
            }
            if (callit == 45){  // Volos
                toronto = new LatLng(43.65052,-79.38475);
                googleMap.addMarker(new MarkerOptions().position(toronto).title("Volos"));
            }

            googleMap.moveCamera(CameraUpdateFactory.newLatLng(toronto));
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(toronto,10f));
            googleMap.setMapType(googleMap.MAP_TYPE_HYBRID);
            googleMap.getUiSettings().setZoomControlsEnabled(true);

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second_google_maps2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map2);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}