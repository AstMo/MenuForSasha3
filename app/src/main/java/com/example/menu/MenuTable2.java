package com.example.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuTable2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_table2);
        ImageButton btnBack2 = (ImageButton) findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(MenuTable2.this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MenuTable2.this,MainActivity.class);
        startActivity(intent);
    }
}
