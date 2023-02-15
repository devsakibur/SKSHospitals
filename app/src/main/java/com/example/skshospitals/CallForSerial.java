package com.example.skshospitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CallForSerial extends AppCompatActivity {

    String serialNum1 = "02589980132";
    String serialNum2 = "01324446291";
    String serialNum3 = "01730072575";

    int[] imgRes = {R.drawable.serialdin , R.drawable.ambulanceservices , R.drawable.services , R.drawable.farmesi};
    String[] titles ={"সিরিয়ালের জন্য কল করুন" , "জরুরী এম্বুল্যান্স সার্ভিস" , "তথ্য সেবা এবং পরামর্শ"};

    String num1 = "tel:02589980132";
    String num2 = "tel:01324446291";
    String num3 = "tel:01730072575";

    String serNum1 = "01713484568";
    String serNum2 = "01713484525";
    String serNum3 = "01730072579";

    ImageView imgToDisplay;
    TextView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_call_for_serial);
        int a = MainActivity.getValueTopass();


        TextView serial1 = (TextView) findViewById(R.id.serialNumOne);
        TextView serial2 = (TextView) findViewById(R.id.serialNumTwo);
        TextView serial3 = (TextView) findViewById(R.id.serialNumThree);
        LinearLayout dialerButtonOne = (LinearLayout) findViewById(R.id.dialerButton4);
        LinearLayout dialerButtonTwo = (LinearLayout) findViewById(R.id.dialerButton5);
        LinearLayout dialerButtonThree = (LinearLayout) findViewById(R.id.dialerButton6);

        titleView = (TextView) findViewById(R.id.titleView);
        imgToDisplay = (ImageView) findViewById(R.id.imageView13);

        if(a == 3){
            imgToDisplay.setImageResource(imgRes[0]);
            titleView.setText(titles[0]);
            serial1.setText(serialNum1);
            serial2.setText(serialNum2);
            serial3.setText(serialNum3);


            dialerButtonOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(num1));
                    startActivity(intent);
                }
            });
            dialerButtonTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(num2));
                    startActivity(intent);
                }
            });
            dialerButtonThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(num3));
                    startActivity(intent);
                }
            });



        }else if(a == 4){
            imgToDisplay.setImageResource(imgRes[1]);
            titleView.setText(titles[1]);
            serial1.setText(serialNum1);
            serial2.setText(serialNum2);
            serial3.setText(serialNum3);

            dialerButtonOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(num1));
                    startActivity(intent);
                }
            });
            dialerButtonTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(num2));
                    startActivity(intent);
                }
            });
            dialerButtonThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(num3));
                    startActivity(intent);
                }
            });

        }else if(a == 5){

            imgToDisplay.setImageResource(imgRes[2]);
            titleView.setText(titles[2]);
            serial1.setText(serNum1);
            serial2.setText(serNum2);
            serial3.setText(serNum3);

            dialerButtonOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + serNum1));
                    startActivity(intent);
                }
            });
            dialerButtonTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + serNum2));
                    startActivity(intent);
                }
            });
            dialerButtonThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + serNum3));
                    startActivity(intent);
                }
            });


        }
        else if(a == 6){

            imgToDisplay.setImageResource(imgRes[3]);
            titleView.setText(titles[2]);
            serial1.setText(serNum1);
            serial2.setText(serNum2);
            serial3.setText(serNum3);

            dialerButtonOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + serNum1));
                    startActivity(intent);
                }
            });
            dialerButtonTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + serNum2));
                    startActivity(intent);
                }
            });
            dialerButtonThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + serNum3));
                    startActivity(intent);
                }
            });


        }


    }
}