package com.example.michaelasafo_comp304_a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import static com.example.michaelasafo_comp304_a5.ItalianCuisine.callit;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

public class ChineseCuisine extends AppCompatActivity {

    public static int chinese;
    ListView listView;
    String mTitle[]={"Mom's Dim Sum", "Taste of China Seafood", "Hong Shing Chinese", "House of Gourmet", "Perfect Chinese"};
    String mDescription[] = {"5336 Yonge St, North York, ON M2N 5P9", "338 Spadina Ave., Toronto, ON M5T 2G2", "195 Dundas St W, Toronto, ON M5G 1C7","484 Dundas St W, Toronto, ON M5T 1G9", "4386 Sheppard Ave E, Toronto, ON M1S 1T8"};
    int images[] = {R.drawable.momdimsum,R.drawable.tasteofchina,R.drawable.hongshing,R.drawable.houseofgourmet,R.drawable.perfectchineserestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_cuisine);

        listView = findViewById(R.id.chineselistView);

        MyAdapter adapter = new MyAdapter(this, mTitle,mDescription,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(ChineseCuisine.this,"Mom's Dim Sum",Toast.LENGTH_SHORT).show();
                    callit = 30;
                    Intent m1 = new Intent(ChineseCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 1){
                    Toast.makeText(ChineseCuisine.this,"Taste of China Seafood",Toast.LENGTH_SHORT).show();
                    callit = 31;
                    Intent m1 = new Intent(ChineseCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 2){
                    Toast.makeText(ChineseCuisine.this,"Hong Shing Chinese",Toast.LENGTH_SHORT).show();
                    callit = 32;
                    Intent m1 = new Intent(ChineseCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 3){
                    Toast.makeText(ChineseCuisine.this,"House of Gourmet",Toast.LENGTH_SHORT).show();
                    callit = 33;
                    Intent m1 = new Intent(ChineseCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 4){
                    Toast.makeText(ChineseCuisine.this,"Perfect Chinese",Toast.LENGTH_SHORT).show();
                    callit = 34;
                    Intent m1 = new Intent(ChineseCuisine.this, MainActivity.class);
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
            super(c,R.layout.row,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.chineserow, parent,false);
            ImageView images = row.findViewById(R.id.chineseimage);
            TextView myTitle = row.findViewById(R.id.chinesetextView1);
            TextView myDescription = row.findViewById(R.id.chinesetextView2);


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