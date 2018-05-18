package com.example.harshit.hi;

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

    public Button button;int clickcount=0;int number[]={1,2,3,4,5,6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
Random rand=new Random();
clickcount=rand.nextInt(6)+1;


{if (clickcount ==1) {
                    TextView text = (TextView) findViewById(R.id.textView);
                    text.setText("1.POWERSTONE");
                    button.setBackgroundColor(Color.parseColor("#A020F0"));
                } else if (clickcount ==2) {
                    TextView text2 = (TextView) findViewById(R.id.textView2);
                    text2.setText("2.SPACESTONE");
                    button.setBackgroundColor(Color.parseColor("#87CEEB"));
                } else if (clickcount ==3) {
                    TextView text3 = (TextView) findViewById(R.id.textView3);
                    text3.setText("3.TIMESTONE");
                    button.setBackgroundColor(Color.parseColor("#00FF7F"));
                } else if (clickcount == 4) {
                    TextView text4 = (TextView) findViewById(R.id.textView4);
                    text4.setText("4.REALITYSTONE");
                    button.setBackgroundColor(Color.parseColor("#FF0000"));
                } else if (clickcount ==5) {
                    TextView text5 = (TextView) findViewById(R.id.textView5);
                    text5.setText("5.SOULSTONE");
                    button.setBackgroundColor(Color.parseColor("#FFA500"));
                } else if (clickcount == 6) {
                    TextView text6 = (TextView) findViewById(R.id.textView6);
                    text6.setText("6.MINDSTONE");
                    button.setBackgroundColor(Color.parseColor("#ffff00"));
                }
}}



        });

}}