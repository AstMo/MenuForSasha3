package com.example.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

    public class MainActivity extends AppCompatActivity {
        GridView gridView;
        int[] foodImages = {R.drawable.apple,R.drawable.grechka,R.drawable.coffee,R.drawable.apple,R.drawable.baking,R.drawable.boiled,R.drawable.bread,R.drawable.cheese,
                R.drawable.classicbreakfast,R.drawable.cookies,R.drawable.cookieswithdarkchocolate,R.drawable.cucumber
                ,R.drawable.eggs,R.drawable.fish,R.drawable.friedegg,R.drawable.friedegg1,R.drawable.fruits,
                R.drawable.glassmilk,R.drawable.hotsoup,R.drawable.juicee,R.drawable.makarons,R.drawable.milk,
                R.drawable.pancake};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            gridView = findViewById(R.id.gridview);

            CustomAdapter customAdapter = new CustomAdapter();
            gridView.setAdapter(customAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getApplicationContext(),activity_grid_item.class);
                    intent.putExtra("image",foodImages[i]);
                    startActivity(intent);

                }
            });


        }

        private class CustomAdapter extends BaseAdapter {
            @Override
            public int getCount() {
                return foodImages.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
                //getting view in row_data
                ImageView image = view1.findViewById(R.id.images);

                image.setImageResource(foodImages[i]);
                return view1;

            }
        }
    }
