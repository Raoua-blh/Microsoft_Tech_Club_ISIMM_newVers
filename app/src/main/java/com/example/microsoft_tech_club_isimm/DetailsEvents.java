package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_events);
        TextView titleEventDetailsTv=findViewById(R.id.eventTitle);
        TextView  descrpEventDetailsTv=findViewById(R.id.eventFulldescrp);
        ImageView eventdetailsImg=findViewById(R.id.eventImg);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("event_name");
            String descrp = extras.getString("event_description");
            int img = extras.getInt("event_images");
            titleEventDetailsTv.setText(name);
            descrpEventDetailsTv.setText(descrp);
            eventdetailsImg.setImageResource(img);
        }
    }
}