package com.example.skshospitals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class PriceList extends AppCompatActivity {


    ImageView imgToDisplay;
    int[] imgResources = {R.drawable.price , R.drawable.phesio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_price_list);

        imgToDisplay = (ImageView) findViewById(R.id.imgToDisplay);

        int a = MainActivity.getValueTopass();

        if (a == 0){
            imgToDisplay.setImageResource(imgResources[0]);
        }else if( a == 1){
            imgToDisplay.setImageResource(imgResources[1]);
        }







    }

}