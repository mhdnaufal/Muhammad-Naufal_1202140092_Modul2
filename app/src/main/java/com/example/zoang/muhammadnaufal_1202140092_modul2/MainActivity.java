package com.example.zoang.muhammadnaufal_1202140092_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup terserah;
    RadioButton dineIn, takeAway;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        terserah = findViewById(R.id.radioGroup);
        dineIn = findViewById(R.id.dine_in);
        takeAway = findViewById(R.id.take_away);
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bebas = terserah.getCheckedRadioButtonId();
                if(bebas == dineIn.getId()){
                    Intent intent = new Intent(MainActivity.this, DineIn.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Dine In", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, TakeAway.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Take Away", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
