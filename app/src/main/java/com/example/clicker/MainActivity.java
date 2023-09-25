package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button clicker;
    Integer counter;
    Button reset;
    Switch fortnite;
    Integer dodawanie = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textView);
        clicker = findViewById(R.id.button);

        reset = findViewById(R.id.button2);
        fortnite = findViewById(R.id.switch1);
        counter = 0;


        clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter = counter + dodawanie;
                display.setText("Punkty: " + counter);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 counter = 0;
                display.setText("Punkty: " + counter);
            }
        });
        fortnite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(fortnite.isChecked()){
                    dodawanie = -1;
                    clicker.setText("Odejmij 1");

                }else{
                    dodawanie = 1;
                    clicker.setText("Dodaj 1");
                }
            }
        });
    }
}