package com.example.skshospitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DoctorsListView extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;

    int doctorImg = R.drawable.doctorlogo;

    String[] doctorsNames = {"ডাঃ মোঃআব্দুল বাসেত","ডাঃ এ টি এম মোস্তাফিজুর রহমান","ডাঃ দেবাশীষ সরকার","ডাঃ খায়রুন নাহার","ডাঃ মোঃইউনুস আলী","ডাঃ মোঃ এম এ সালেহ","ডাঃ রাশিদা এ রহমান","ডাঃ হুমায়ুন কবীর সরকার","ডাঃ এসি সাহা","ডাঃ মিনহাজ ইবনে সৌমিক","ডাঃ মলয় কুমার রায়","ডঃ শিহাব মোঃ রেজওয়ানুর রহমান","ডাঃ মোঃ ইমাম-উজ-জামান(সোহাগ)","ডাঃ নারায়ন চৌধুরী (নিক্সন)","ডাঃ মোঃ আতিকুরজ্জামান","ডাঃ দেবাশীষ মন্ডল"};
    String[] doctorsSpeciality = {"মেডিসিন বিশেষজ্ঞ","জেনারেল, ল্যাপারোস্কোপিক ও কলোরেক্টাল বিশেষজ্ঞ ও সার্জন","গ্যাস্ট্রিক,লিভার ও পরিপাকতন্ত্র বিশেষজ্ঞ","শিশু, কিশোর ও নবজাতক  রোগ বিশেষজ্ঞ","হাড়- জোর, বাত-ব্যাথা বিশেষজ্ঞ ও ট্রমা সার্জন","হৃদরোগ,বাতজ্বর ও মেডিসিন বিশেষজ্ঞ","প্রসূতি ও স্ত্রীরোগ বিশেষজ্ঞ ও সার্জন","নিউরো মেডিসিন বিশেষজ্ঞ","সার্জারী গাইনি এন্ড অবস্","নাক,কান ও গলা রোগ বিশেষজ্ঞ এবং হেড নেক সার্জন","চর্ম, যৌন, এলার্জি ও কুষ্ঠ রোগ বিশেষজ্ঞ","ল্যাবরেটরি মেডিসিন বিশেষজ্ঞ ও ডায়াবেটিস প্রাকটিসনার","বাত-ব্যাথা, হাড়-জোড়, ট্রমা ও অর্থোপেডিক বিশেষজ্ঞ ও সার্জন","কিডনি,প্রষ্টেট,মুত্রথলি,মূত্রনালি, অন্ডকোষ, পুরুষ প্রজননতন্ত্র, যৌন অক্ষমতা,পুরুষ বন্ধ্যাত্ব সমস্যা জনিত রোগ বিশেষজ্ঞ ও সার্জন","ক্যান্সার বিশেষজ্ঞ","চর্ম, যৌন, এলার্জি ও কুষ্ঠ রোগ বিশেষজ্ঞ এবং ডার্মাটোসার্জন"};
    String[] doctorsDegree = {"এমবিবিএস, বিসিএস (স্বাস্থ্য ) এম.ডি (মেডিসিন)","এমবিবিএস, এফসিপিএস (সার্জারী)স্পেশাল ট্রেনিং ইন লেজার প্রোকটোলজ সহযোগী অধ্যাপক ও ইউনিট প্রধান সার্জারী বিভাগ (কমলা) ","এমবিবিএস, বিসিএস (স্বাস্থ্য)এমডি (গ্যাস্ট্রো এন্টারোলজী) এমএসিপি (আমেরিকা)","এমবিবিএস, এফসিপিএস (শিশু) কনসালটেন্ট (শিশু)","এমবিবিএস, বিসিএস (স্বাস্থ) এমএস (অর্থো-সার্জারী)","এমবিবিএস, ডি-কার্ড' (বিএসএমএমইউ) কনসালটেন্ট (কার্ডিওলজী)","এমবিবিএস, ডিজিও, ডিএমইউ, সিসিডি স্পেশাল ট্রেনিং ইন ল্যাপারোস্কোপি ও ইনফারটিলিটি এনালটেন্ট (এক্স)","এমবিবিএস, এমডি (নিউরোলজী) এমএসিপি (আমেরিকা) কনসালটেন্ট (নিউরোলজিস্ট)","এমবিবিএস, বিসিএস (স্বাস্থ্য) ডি.ডি.ভি. (বি.এস.এম.এম.ইউ), ঢাকা কনসালটেন্ট, ডার্মাটোলজি ","এমবিবিএস, বিসিএস (স্বাস্থ) এম.ডি (ল্যাবরেটরী মেডিসিন) - বি.এস.এম.এম.ইউ সি.সি.ডি (বারডেম), সি. কার্ড (ন্যাশনাল হার্ট ফাউন্ডেশন) প্যাথলজিষ্ট","এমবিবিএস, বিসিএস (স্বাস্থ্য), ডি-অর্থো ফেলোশিপ ইন ইলিজারেড এবং ডিকমিটি কারেকশন","এমবিবিএস, বিসিএস (স্বাস্থ্য) এমএস (ইউরোলজী) ইউরোলজী বিভাগ","এমবিবিএস, বিসিএস (স্বাস্থ্যএম ডি (মেডিকেল অনকোলজী) "," এমবিবিএস, ডিএমসি, এমডি (ডার্মাটোলজী) আই এম ও  চর্ম ও যৌন রোগ বিভাগ","এমবিবিএস, বিসিএস (স্বাস্থ্যএম ডি (মেডিকেল অনকোলজী) "," এমবিবিএস, ডিএমসি, এমডি (ডার্মাটোলজী) আই এম ও  চর্ম ও যৌন রোগ বিভাগ"};



    public DoctorsListView(Context context){
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return doctorsNames.length;
    }

    @Override
    public Object getItem(int position) {
        return doctorsNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }





    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view  =  layoutInflater.inflate(R.layout.activity_doctors_list_view , null);


        TextView doctorName = (TextView) view.findViewById(R.id.doctorName);
        TextView doctorCategory = (TextView) view.findViewById(R.id.doctorCategory);
        TextView doctorDegree = (TextView) view.findViewById(R.id.doctorDegree);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewDoctor);


        doctorName.setText(doctorsNames[position]);
        doctorCategory.setText(doctorsSpeciality[position]);
        doctorDegree.setText(doctorsDegree[position]);


        imageView.setImageBitmap(
                decodeSampledBitmapFromResource(context.getResources(), doctorImg, 65, 65));


        return view;


    }


    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }


    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }



}