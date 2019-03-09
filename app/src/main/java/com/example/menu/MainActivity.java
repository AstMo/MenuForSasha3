package com.example.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnMonday = (ImageButton) findViewById(R.id.btnMonday);
        ImageButton btnTuesday = (ImageButton) findViewById(R.id.btnTuesday);
        ImageButton btnWednesday = (ImageButton) findViewById(R.id.btnWednesday);
        ImageButton btnThursday = (ImageButton) findViewById(R.id.btnThursday);
        ImageButton btnFriday = (ImageButton) findViewById(R.id.btnFriday);
        ImageButton btnSaturday = (ImageButton) findViewById(R.id.btnSaturday);
        ImageButton btnSunday = (ImageButton) findViewById(R.id.btnSunday);
        btnMonday.setOnClickListener(MainActivity.this);
        btnTuesday.setOnClickListener(MainActivity.this);
        btnWednesday.setOnClickListener(MainActivity.this);
        btnThursday.setOnClickListener(MainActivity.this);
        btnFriday.setOnClickListener(MainActivity.this);
        btnSaturday.setOnClickListener(MainActivity.this);
        btnSunday.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imageButton) {
        switch (imageButton.getId()){
            case R.id.btnMonday:
                Intent intent =new Intent (MainActivity.this,menuTable.class);
                intent.putExtra("DayOfWeek","Monday");
                startActivity(intent);

            /*case R.id.btnWednesday:
                intent =new Intent (MainActivity.this,menuTable.class);
                intent.putExtra("DayOfWeek","Wednesday");
                startActivity(intent);
            case R.id.btnThursday:
                intent =new Intent (MainActivity.this,menuTable.class);
                intent.putExtra("DayOfWeek","Thursday");
                startActivity(intent);
            case R.id.btnFriday:
                intent =new Intent (MainActivity.this,menuTable.class);
                intent.putExtra("DayOfWeek","Friday");
                startActivity(intent);
            case R.id.btnSaturday:
                intent =new Intent (MainActivity.this,menuTable.class);
                intent.putExtra("DayOfWeek","Saturday");
                startActivity(intent);
            case R.id.btnSunday:
                intent =new Intent (MainActivity.this,menuTable.class);
                intent.putExtra("DayOfWeek","Sunday");
                startActivity(intent);*/
        }

    }
}
