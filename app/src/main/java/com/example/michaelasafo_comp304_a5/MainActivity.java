package com.example.michaelasafo_comp304_a5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    fragmentManager = getSupportFragmentManager();
    FragmentTransaction trans = fragmentManager.beginTransaction();
    FragmentTransaction trans2 = fragmentManager.beginTransaction();

    mTextView = (TextView) findViewById(R.id.text);

    View status = findViewById(R.id.fragment_container);
    View status2 = findViewById(R.id.fragment_container2);

        if (status != null || status2 != null){
        if (savedInstanceState != null){
            return;
        }
        trans.replace(R.id.fragment_container, new SecondGoogleMapsFragment2(),"satelliteviewfragment").commit();
        trans2.replace(R.id.fragment_container2, new GoogleMapFragment1(),"normalviewfragment").commit();
    }

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.menu_home:
                Intent intent = new Intent(this,Navigator.class );
                startActivity(intent);
                return true;
            case R.id.menu_maps:
                Intent intent2 = new Intent(this,MainActivity.class );
                startActivity(intent2);
                return true;
            case R.id.menu_chinese:
                Intent intent3 = new Intent(this,ChineseCuisine.class );
                startActivity(intent3);
                return true;
            case R.id.menu_italian:
                Intent intent4 = new Intent(this,ItalianCuisine.class );
                startActivity(intent4);
                return true;
            case R.id.menu_greek:
                Intent intent5 = new Intent(this,GreekCuisine.class );
                startActivity(intent5);
                return true;
            case R.id.menu_indian:
                Intent intent6 = new Intent(this,IndianCuisine.class );
                startActivity(intent6);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
}
}