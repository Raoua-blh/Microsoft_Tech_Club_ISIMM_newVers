package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class Home_Page extends AppCompatActivity {
ConstraintLayout aboutUsLayout , teamLayout ,eventsLayout ,formationLayout , memberofthemontLayout ;
ImageView facebookLayout,instaLayout ,
        twitterLayout , linkedinLayout ,websiteLayout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        TextView text = findViewById(R.id.ournames);
        text.setText("Rawaà Bel Hadj Amor & Anas Gara");


        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView date = findViewById(R.id.date);
        date.setText(currentDate);


        aboutUsLayout = findViewById(R.id.aboutUsLayout);
        aboutUsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AboutUs.class);
                startActivity(intent);
            }


        });
        teamLayout = findViewById(R.id.teamLayout);
        teamLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Team.class);
                startActivity(intent);
            }
        });
        eventsLayout = findViewById(R.id.eventsLayout);
        eventsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Events.class);
                startActivity(intent);
            }
        });
        formationLayout = findViewById(R.id.formationLayout);
        formationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Formations.class);
                startActivity(intent);
            }
        });
        memberofthemontLayout = findViewById(R.id.memberofthemontLayout);
        memberofthemontLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Member_of_the_month.class);
                startActivity(intent);
            }
        });
        instaLayout = findViewById(R.id.instaLayout);
        instaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/mtc.isimm/"));
                startActivity(intent);
            }
        });

        facebookLayout = findViewById(R.id.facebookLayout);
        facebookLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/MTC.ISIMM/"));
                startActivity(intent);
            }
        });

        twitterLayout = findViewById(R.id.twitterLayout);
        twitterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/TechIsim"));
                startActivity(intent);
            }
        });

        linkedinLayout = findViewById(R.id.linkedInLayout);
        linkedinLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/microsoft-tech-club-0855551ba"));
                startActivity(intent);
            }
        });

        websiteLayout = findViewById(R.id.websiteLayout);
        websiteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/mtc.isimm/"));
                startActivity(intent);
            }
        });


    }


}