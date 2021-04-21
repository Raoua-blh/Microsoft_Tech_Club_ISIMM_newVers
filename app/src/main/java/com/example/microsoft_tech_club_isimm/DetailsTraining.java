package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsTraining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_training);

        TextView detailTrainingTilte=findViewById(R.id.detailTrainingTilte);
        TextView  detailTrainingDescrp=findViewById(R.id.descrpDetailTraining);
        TextView  dateDetailTraining=findViewById(R.id.dateDetailTraining);
        ImageView detailTrainingImg=findViewById(R.id.detailsTrainingImage);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("training_name");
            String descrp = extras.getString("training_description");
            String date = (String) extras.get("training_date");
            int img = extras.getInt("training_Img");
            detailTrainingTilte.setText(name);
            detailTrainingDescrp.setText(descrp);
            detailTrainingImg.setImageResource(img);
            dateDetailTraining.setText(date);
        }
    }
}