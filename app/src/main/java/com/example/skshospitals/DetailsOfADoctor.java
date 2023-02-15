package com.example.skshospitals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsOfADoctor extends AppCompatActivity {

    private static final int CALL = 1;

    private static String[] PERMISSIONS= {Manifest.permission.CALL_PHONE};


    int p = DoctorsList.getdoctorsDetailsArraysItemPosition();
    String serialNum1 = "02589980132";
    String serialNum2 = "01324446291";
    String serialNum3 = "01730072575";
    String num1 = "tel:02589980132";
    String num2 = "tel:01324446291";
    String num3 = "tel:01730072575";




    public static void verifyThatCanCallSomene(Activity activity){

        int permission = ActivityCompat.checkSelfPermission(activity , Manifest.permission.CALL_PHONE);

        if(permission != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS,
                    CALL
            );
        }

    }

public void callAction(String number){
    if(ContextCompat.checkSelfPermission(DetailsOfADoctor.this , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
        ActivityCompat.requestPermissions(DetailsOfADoctor.this , new String[] {Manifest.permission.CALL_PHONE},CALL);

    }else{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(number));
        startActivity(intent);
    }
}


    String[] doctorsNames = {"ডাঃ মোঃআব্দুল বাসেত","ডাঃ এ টি এম মোস্তাফিজুর রহমান","ডাঃ দেবাশীষ সরকার","ডাঃ খায়রুন নাহার","ডাঃ মোঃইউনুস আলী","ডাঃ মোঃ এম এ সালেহ","ডাঃ রাশিদা এ রহমান","ডাঃ হুমায়ুন কবীর সরকার","ডাঃ এসি সাহা","ডাঃ মিনহাজ ইবনে সৌমিক","ডাঃ মলয় কুমার রায়","ডঃ শিহাব মোঃ রেজওয়ানুর রহমান","ডাঃ মোঃ ইমাম-উজ-জামান(সোহাগ)","ডাঃ নারায়ন চৌধুরী (নিক্সন)","ডাঃ মোঃ আতিকুরজ্জামান","ডাঃ দেবাশীষ মন্ডল"};
    String[] doctorsSpeciality = {"মেডিসিন বিশেষজ্ঞ","জেনারেল, ল্যাপারোস্কোপিক ও কলোরেক্টাল বিশেষজ্ঞ ও সার্জন","গ্যাস্ট্রিক,লিভার ও পরিপাকতন্ত্র বিশেষজ্ঞ","শিশু, কিশোর ও নবজাতক  রোগ বিশেষজ্ঞ","হাড়- জোর, বাত-ব্যাথা বিশেষজ্ঞ ও ট্রমা সার্জন","হৃদরোগ,বাতজ্বর ও মেডিসিন বিশেষজ্ঞ","প্রসূতি ও স্ত্রীরোগ বিশেষজ্ঞ ও সার্জন","নিউরো মেডিসিন বিশেষজ্ঞ","সার্জারী গাইনি এন্ড অবস্","নাক,কান ও গলা রোগ বিশেষজ্ঞ এবং হেড নেক সার্জন","চর্ম, যৌন, এলার্জি ও কুষ্ঠ রোগ বিশেষজ্ঞ","ল্যাবরেটরি মেডিসিন বিশেষজ্ঞ ও ডায়াবেটিস প্রাকটিসনার","বাত-ব্যাথা, হাড়-জোড়, ট্রমা ও অর্থোপেডিক বিশেষজ্ঞ ও সার্জন","কিডনি,প্রষ্টেট,মুত্রথলি,মূত্রনালি, অন্ডকোষ, পুরুষ প্রজননতন্ত্র, যৌন অক্ষমতা,পুরুষ বন্ধ্যাত্ব সমস্যা জনিত রোগ বিশেষজ্ঞ ও সার্জন","ক্যান্সার বিশেষজ্ঞ","চর্ম, যৌন, এলার্জি ও কুষ্ঠ রোগ বিশেষজ্ঞ এবং ডার্মাটোসার্জন"};
    String[] doctorsDegree = {"এমবিবিএস, বিসিএস (স্বাস্থ্য ) এম.ডি (মেডিসিন)","এমবিবিএস, এফসিপিএস (সার্জারী)স্পেশাল ট্রেনিং ইন লেজার প্রোকটোলজ সহযোগী অধ্যাপক ও ইউনিট প্রধান সার্জারী বিভাগ (কমলা) ","এমবিবিএস, বিসিএস (স্বাস্থ্য)এমডি (গ্যাস্ট্রো এন্টারোলজী) এমএসিপি (আমেরিকা)","এমবিবিএস, এফসিপিএস (শিশু) কনসালটেন্ট (শিশু)","এমবিবিএস, বিসিএস (স্বাস্থ) এমএস (অর্থো-সার্জারী)","এমবিবিএস, ডি-কার্ড' (বিএসএমএমইউ) কনসালটেন্ট (কার্ডিওলজী)","এমবিবিএস, ডিজিও, ডিএমইউ, সিসিডি স্পেশাল ট্রেনিং ইন ল্যাপারোস্কোপি ও ইনফারটিলিটি এনালটেন্ট (এক্স)","এমবিবিএস, এমডি (নিউরোলজী) এমএসিপি (আমেরিকা) কনসালটেন্ট (নিউরোলজিস্ট)","এমবিবিএস, বিসিএস (স্বাস্থ্য) ডি.ডি.ভি. (বি.এস.এম.এম.ইউ), ঢাকা কনসালটেন্ট, ডার্মাটোলজি ","এমবিবিএস, বিসিএস (স্বাস্থ) এম.ডি (ল্যাবরেটরী মেডিসিন) - বি.এস.এম.এম.ইউ সি.সি.ডি (বারডেম), সি. কার্ড (ন্যাশনাল হার্ট ফাউন্ডেশন) প্যাথলজিষ্ট","এমবিবিএস, বিসিএস (স্বাস্থ্য), ডি-অর্থো ফেলোশিপ ইন ইলিজারেড এবং ডিকমিটি কারেকশন","এমবিবিএস, বিসিএস (স্বাস্থ্য) এমএস (ইউরোলজী) ইউরোলজী বিভাগ","এমবিবিএস, বিসিএস (স্বাস্থ্যএম ডি (মেডিকেল অনকোলজী) "," এমবিবিএস, ডিএমসি, এমডি (ডার্মাটোলজী) আই এম ও  চর্ম ও যৌন রোগ বিভাগ","এমবিবিএস, বিসিএস (স্বাস্থ্যএম ডি (মেডিকেল অনকোলজী) "," এমবিবিএস, ডিএমসি, এমডি (ডার্মাটোলজী) আই এম ও  চর্ম ও যৌন রোগ বিভাগ"};
   String[] doctorsTime = {"প্রতি শুক্রবার সকাল ৯ টা থেকে সন্ধ্যা ৬ টা পর্যন্ত ","প্রতি রবি মঙ্গল ও বৃহস্পতি বিকেল ৬ টা থেকে রাত ৯ টা এবং শুক্রবার সকাল ১০ টা থেকে বিকেল ৫ টা "," প্রতি শুক্রবার সকাল ৯ টা থেকে বিকেল ৫টা","শনি থেকে বৃহস্পতি বিকেল ৩ টা  থেকে রাত ৮ টা এবং শুক্রবার দুপুর ১২ টা থেকে সন্ধ্যা ৭ টা "," প্রতি শুক্রবার ১০ টা থেকে বিকেল ৫টা","শনি থেকে বৃহস্পতি বিকেল ৫ টা থেকে রাত ৮ টা এবং শুক্রবার ১১ টা থেকে বিকেল ৫টা "," প্রতি দিন বেলা ১০ টা থেকে সন্ধ্যা ৬ টা পর্যন্ত"," প্রতি মাসের দ্বিতীয় সোমবার সন্ধ্যা ৬ টা থেকে রাত ১০ টা   এবং প্রতি মাসের দ্বিতীয় মঙ্গলবার সকাল ৯ টা থেকে বিকেল ৫ টা ","প্রতিদিন সকাল ১০ টা থেকে দুপুর ২ টা এবং বিকেল ৪ টা থেকে রাত ১০ টা","প্রতি দিন বিকেল ৪ টা থেকে রাত ৮ টা এবং শুক্রবার ১০ টা থেকে বিকেল ৫ টা ","প্রতি শুক্রবার সকাল ৯ টা থেকে বিকেল ৫ টা ","প্রতি শনি থেকে বৃহস্পতি বিকেল ৫:৩০ থেকে রাত ৯ টা","শনি থেকে বৃহস্পতি বিকেল ৫ টা থেকে রাত ৮ টা পর্যন্ত ","প্রতি মঙ্গলবার বিকেল ৪ টা হইতে রাত ৮ টা ","প্রতি মাসের  চতুর্থ শনিবার সকাল ১০ টা থেকে বিকেল ৩ টা","প্রতি মঙ্গল বার বিকেল ৪টা হইতে রাত ৮ টা "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_adoctor);

        TextView name = (TextView) findViewById(R.id.detailDoctorName);
        TextView speciallity = (TextView) findViewById(R.id.detailDoctorSpeciality);
        TextView degree = (TextView) findViewById(R.id.detailDoctorDegree);
        TextView serial1 = (TextView) findViewById(R.id.serialNumOne);
        TextView serial2 = (TextView) findViewById(R.id.serialNumTwo);
        TextView serial3 = (TextView) findViewById(R.id.serialNumThree);
        TextView serialTime = (TextView) findViewById(R.id.detailDoctorTime) ;
        LinearLayout dialerButtonOne = (LinearLayout) findViewById(R.id.dialerButton1);
        LinearLayout dialerButtonTwo = (LinearLayout) findViewById(R.id.dialerButton2);
        LinearLayout dialerButtonThree = (LinearLayout) findViewById(R.id.dialerButton3);



        name.setText(doctorsNames[p]);
        speciallity.setText(doctorsSpeciality[p]);
        degree.setText(doctorsDegree[p]);
        serial1.setText(serialNum1);
        serial2.setText(serialNum2);
        serial3.setText(serialNum3);
        serialTime.setText(doctorsTime[p]);

        dialerButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAction(num1);
            }
        });

        dialerButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAction(num2);
            }
        });

        dialerButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAction(num3);
            }
        });


    }

}