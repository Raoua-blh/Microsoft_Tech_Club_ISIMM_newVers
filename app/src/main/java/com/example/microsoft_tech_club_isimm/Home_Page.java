package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Matrix;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Home_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        TextView text = findViewById(R.id.ournames);
        text.setText("Rawaà Bel Hadj Amor & Anas Gara");
//
//        RotateAnimation rotate= (RotateAnimation) AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
//        text.setAnimation(rotate);
    }
}