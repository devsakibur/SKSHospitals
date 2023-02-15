package com.example.skshospitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout findDoctor , serialDin , hospitalLogo , priceList , physiotherapyICon , ambulancecall , infoServiceHelp , farmesy;
    public static int valueToPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();//to hide the action bar
        setContentView(R.layout.activity_main);


        findDoctor = (RelativeLayout) findViewById(R.id.findDoctor);
        serialDin = (RelativeLayout) findViewById(R.id.serialDin);
        priceList = (RelativeLayout) findViewById(R.id.pricelist);
        physiotherapyICon = (RelativeLayout) findViewById(R.id.physiotherapyICon);
        ambulancecall = (RelativeLayout) findViewById(R.id.ambulancecall);
        infoServiceHelp = (RelativeLayout) findViewById(R.id.infoServiceHelp);
        farmesy = (RelativeLayout) findViewById(R.id.farmesy);








//intents

        findDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findDoctorIntent();

            }
        });




        serialDin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSerialDinIntent();
                valueToPass = 3;
            }
        });


        priceList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPriceList();
                valueToPass = 0 ;
            }
        });

        physiotherapyICon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPriceList();
                valueToPass = 1;

            }
        });

        ambulancecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSerialDinIntent();
                valueToPass =4 ;
            }
        });
        infoServiceHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSerialDinIntent();
                valueToPass = 5;
            }
        });

        farmesy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSerialDinIntent();
                valueToPass = 6;
            }
        });

















    }


    public void findDoctorIntent(){
        Intent intent = new Intent(MainActivity.this, DoctorsList.class);
        startActivity(intent);
    }
    public void setSerialDinIntent(){
        Intent intent = new Intent(MainActivity.this, CallForSerial.class);
        startActivity(intent);

    }
    public void setPriceList(){
        Intent intent= new Intent(MainActivity.this ,PriceList.class);
        startActivity(intent);

    }




    public static int getValueTopass(){
        return valueToPass;
    }






}