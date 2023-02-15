package com.example.skshospitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

public class DoctorsList extends AppCompatActivity {

    ListView listView;

    public static int doctorsDetailsArraysItemPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_doctors_list);

        listView = (ListView) findViewById(R.id.listView);


        DoctorsListView adapter = new DoctorsListView(DoctorsList.this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(DoctorsList.this , DetailsOfADoctor.class);
                    startActivity(intent);
                    doctorsDetailsArraysItemPosition = position;

            }
        });






    }

    public static int getdoctorsDetailsArraysItemPosition(){
        return doctorsDetailsArraysItemPosition;
    }
}