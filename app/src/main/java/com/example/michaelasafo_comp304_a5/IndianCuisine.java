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

public class IndianCuisine extends AppCompatActivity {

    public static int indian;
    ListView listView;
    String mTitle[]={"Fitoor", "Bombay Roti", "Indian Rasoi", "Little India Restaurant", "Bindia Indian Bistro","Pukka"};
    String mDescription[] = {" Heartland Town Centre, 6045 Mavis Rd, Mississauga, ON L5R 4G6", "1404 Yonge St, Toronto, ON M4T 1Y5", "1437 Gerrard St E, Toronto, ON M4L 1Z7","255 Queen St W, Toronto, ON M5V 1Z4", "16 Market St., Toronto, ON M5E 1M6", "778 St Clair Ave W, Toronto, ON M6C 1B6"};
    int images[] = {R.drawable.fitoor,R.drawable.bombayroti,R.drawable.indianrasoi,R.drawable.littleindiarestaurant,R.drawable.bindiaindianbistro,R.drawable.pukka};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_cuisine);

        listView = findViewById(R.id.indianlistView);

        MyAdapter adapter = new MyAdapter(this, mTitle,mDescription,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(IndianCuisine.this,"Blue Ristorante",Toast.LENGTH_SHORT).show();
                    callit = 20;
                    Intent m1 = new Intent(IndianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 1){
                    Toast.makeText(IndianCuisine.this,"Carisma",Toast.LENGTH_SHORT).show();
                    callit = 21;
                    Intent m1 = new Intent(IndianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 2){
                    Toast.makeText(IndianCuisine.this,"Terroni",Toast.LENGTH_SHORT).show();
                    callit = 22;
                    Intent m1 = new Intent(IndianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 3){
                    Toast.makeText(IndianCuisine.this,"Cucina Mauro",Toast.LENGTH_SHORT).show();
                    callit = 23;
                    Intent m1 = new Intent(IndianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 4){
                    Toast.makeText(IndianCuisine.this,"Sugo",Toast.LENGTH_SHORT).show();
                    callit = 24;
                    Intent m1 = new Intent(IndianCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 5){
                    Toast.makeText(IndianCuisine.this,"Trattoria Nervosa",Toast.LENGTH_SHORT).show();
                    callit = 25;
                    Intent m1 = new Intent(IndianCuisine.this, MainActivity.class);
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
            super(c,R.layout.indianrow,R.id.indiantextView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.indianrow, parent,false);
            ImageView images = row.findViewById(R.id.indianimage);
            TextView myTitle = row.findViewById(R.id.indiantextView1);
            TextView myDescription = row.findViewById(R.id.indiantextView2);


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