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

public class GreekCuisine extends AppCompatActivity {

    public static int greek;
    ListView listView;
    String mTitle[]={"Souv Like", "Tzatziki", "Greek In The Village", "Alexandros", "Mezes", "Volos Greek"};
    String mDescription[] = {"708 Pape Ave, Toronto, ON M4K 3S7", "873 Pape Ave, East York, ON M4K 3T9", "664 Bloor St W, Toronto, ON M6G 1L2","377 Church St, Toronto, ON M5B 1Z9", "456 Danforth Ave, Toronto, ON M4K 1P3", "133 Richmond St W, Toronto, ON M5H 2L3"};
    int images[] = {R.drawable.souvlike,R.drawable.tzatziki,R.drawable.greeninthevillage,R.drawable.alexandros,R.drawable.mezes,R.drawable.volos};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greek_cuisine);

        listView = findViewById(R.id.greeklistView);

        MyAdapter adapter = new MyAdapter(this, mTitle,mDescription,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(GreekCuisine.this,"Souv Like",Toast.LENGTH_SHORT).show();
                    callit = 40;
                    Intent m1 = new Intent(GreekCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 1){
                    Toast.makeText(GreekCuisine.this,"Tzatziki",Toast.LENGTH_SHORT).show();
                    callit = 41;
                    Intent m1 = new Intent(GreekCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 2){
                    Toast.makeText(GreekCuisine.this,"Greek In the Village",Toast.LENGTH_SHORT).show();
                    callit = 42;
                    Intent m1 = new Intent(GreekCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 3){
                    Toast.makeText(GreekCuisine.this,"Alexandros",Toast.LENGTH_SHORT).show();
                    callit = 43;
                    Intent m1 = new Intent(GreekCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 4){
                    Toast.makeText(GreekCuisine.this,"Mezes",Toast.LENGTH_SHORT).show();
                    callit = 44;
                    Intent m1 = new Intent(GreekCuisine.this, MainActivity.class);
                    startActivity(m1);
                }
                if (position == 5){
                    Toast.makeText(GreekCuisine.this,"Volos",Toast.LENGTH_SHORT).show();
                    callit = 45;
                    Intent m1 = new Intent(GreekCuisine.this, MainActivity.class);
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
            super(c,R.layout.greekrow,R.id.greektextView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.greekrow, parent,false);
            ImageView images = row.findViewById(R.id.greekimage);
            TextView myTitle = row.findViewById(R.id.greektextView1);
            TextView myDescription = row.findViewById(R.id.greektextView2);


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