package com.example.michaelasafo_comp304_a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.maps.GoogleMap;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ItalianCuisine extends AppCompatActivity {

    public static int callit;
    ListView listView;
    String mTitle[]={"Blue Ristorante", "Carisma", "Terroni,Cucina Mauro", "Sugo", "Trattoria Nervosa"};
    String mDescription[] = {"90 Avenue Rd, Toronto, ON M5R 2H2", "15 Toronto St, Toronto, ON M5C 2E3", "57 Adelaide St E, Toronto, ON M5C 1K6","76 Densley Ave Unit 3, Toronto, ON M6M 2R3", "1279 Bloor St W, Toronto, Ontario M6H 1N7", "75 Yorkville Ave, Toronto, ON M5R 1B8"};
    int images[] = {R.drawable.bluristorante,R.drawable.carisma,R.drawable.terroni,R.drawable.cucinamaurocatering,R.drawable.sugo,R.drawable.trattorianervosa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_cuisine);

        listView = findViewById(R.id.italianlistView);

        MyAdapter adapter = new MyAdapter(this, mTitle,mDescription,images);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(ItalianCuisine.this,"Blue Ristorante",Toast.LENGTH_SHORT).show();
                    callit = 0;
                    Intent m1 = new Intent(ItalianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 1){
                    Toast.makeText(ItalianCuisine.this,"Carisma",Toast.LENGTH_SHORT).show();
                    callit = 1;
                    Intent m1 = new Intent(ItalianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 2){
                    Toast.makeText(ItalianCuisine.this,"Terroni",Toast.LENGTH_SHORT).show();
                    callit = 2;
                    Intent m1 = new Intent(ItalianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 3){
                    Toast.makeText(ItalianCuisine.this,"Cucina Mauro",Toast.LENGTH_SHORT).show();
                    callit = 3;
                    Intent m1 = new Intent(ItalianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 4){
                    Toast.makeText(ItalianCuisine.this,"Sugo",Toast.LENGTH_SHORT).show();
                    callit = 4;
                    Intent m1 = new Intent(ItalianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 5){
                    Toast.makeText(ItalianCuisine.this,"Trattoria Nervosa",Toast.LENGTH_SHORT).show();
                    callit = 5;
                    Intent m1 = new Intent(ItalianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
            }
        });
    }



    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[],String description[], int imgs[]){
            super(c,R.layout.row,R.id.italiantextView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.italianrow, parent,false);
            ImageView images = row.findViewById(R.id.italianimage);
            TextView myTitle = row.findViewById(R.id.italiantextView1);
            TextView myDescription = row.findViewById(R.id.italiantextView2);


            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
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