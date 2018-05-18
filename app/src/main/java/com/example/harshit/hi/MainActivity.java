package com.example.harshit.hi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;           // for Arrays and Random


public class MainActivity extends AppCompatActivity {

    public Button button2,button;int clickcount;int a[]={0,0,0,0,0,0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2); final SharedPreferences settings = getSharedPreferences("Preferences", 0);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                for(int j=1;j>0;j++) { Random r= new Random();
                    clickcount    = r.nextInt(6);

                 if (a[clickcount] == 0) {

                         if (clickcount == 1) {
                             TextView text = (TextView) findViewById(R.id.textView);
                             text.setText("1.POWERSTONE");
                             button.setBackgroundColor(Color.parseColor("#A020F0"));
                         } else if (clickcount == 2) {
                             TextView text2 = (TextView) findViewById(R.id.textView2);
                             text2.setText("2.SPACESTONE");
                             button.setBackgroundColor(Color.parseColor("#87CEEB"));
                         } else if (clickcount == 3) {
                             TextView text3 = (TextView) findViewById(R.id.textView3);
                             text3.setText("3.TIMESTONE");
                             button.setBackgroundColor(Color.parseColor("#00FF7F"));
                         } else if (clickcount == 4) {
                             TextView text4 = (TextView) findViewById(R.id.textView4);
                             text4.setText("4.REALITYSTONE");
                             button.setBackgroundColor(Color.parseColor("#FF0000"));
                         } else if (clickcount == 5) {
                             TextView text5 = (TextView) findViewById(R.id.textView5);
                             text5.setText("5.SOULSTONE");
                             button.setBackgroundColor(Color.parseColor("#FFA500"));
                         } else if (clickcount == 0) {
                             TextView text6 = (TextView) findViewById(R.id.textView6);
                             text6.setText("6.MINDSTONE");
                             button.setBackgroundColor(Color.parseColor("#ffff00"));
                         }}
                         a[clickcount] = 1;
                         break;
                     }


            if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1 && a[5] == 1) {
            Toast.makeText(MainActivity.this, "! You have collected all stones !", Toast.LENGTH_LONG).show();
           }}
        });
       button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { button.setEnabled(true);
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText(" ");
                TextView text2 = (TextView) findViewById(R.id.textView2);
                text2.setText("");
                TextView text3 = (TextView) findViewById(R.id.textView3);
                text3.setText("");
                TextView text4 = (TextView) findViewById(R.id.textView4);
                text4.setText("");
                TextView text5 = (TextView) findViewById(R.id.textView5);
                text5.setText("");
                TextView text6 = (TextView) findViewById(R.id.textView6);
                text6.setText(""); if(v==button2){finish();startActivity(new Intent(MainActivity.this,MainActivity.class));}
            }
            });
}}