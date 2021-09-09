package com.example.michaelasafo_comp304_a5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Navigator extends AppCompatActivity {

    ListView listView;
    String mTitle[]={"ITALIAN","GREEK", "CHINESE","INDIAN"};
    String mDescription[] = {"CUISINE", "CUISINE", "CUISINE","CUISINE"};
    int images[] = {R.drawable.italiancuisine,R.drawable.greekcuisine,R.drawable.chinesecuisine,R.drawable.indiancuisine};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle,mDescription,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent a1 = new Intent(Navigator.this,ItalianCuisine.class);
                    startActivity(a1);
                }
                if (position == 1){
                    Intent a2 = new Intent(Navigator.this, GreekCuisine.class);
                    startActivity(a2);
                }
                if (position == 2){
                    Intent a3 = new Intent(Navigator.this,ChineseCuisine.class);
                    startActivity(a3);
                }
                if (position == 3){
                    Intent a4 = new Intent(Navigator.this,IndianCuisine.class);
                    startActivity(a4);
                }

            }
        });


    }

    class MyAdapter extends ArrayAdapter<String>{
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
            View row = layoutInflater.inflate(R.layout.row, parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);


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