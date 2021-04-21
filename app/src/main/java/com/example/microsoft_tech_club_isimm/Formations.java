package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Formations extends AppCompatActivity implements RecycleViewOnItemClick {
    TextView trainingTitle , trainingDescrp , trainingDate;
    ImageView trainingImg ;
    RecyclerView trainingRv ;
    TrainingAdapter myAdapter ;
    ArrayList<TrainingModel> trainingModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formations);
        trainingTitle =findViewById(R.id.trainingTitle);
        trainingDescrp = findViewById(R.id.trainingDescrp);
        trainingDate = findViewById(R.id.dateTraining);
        trainingImg = findViewById(R.id.trainingImg);

        trainingRv = findViewById(R.id.trainingRV);
        trainingRv.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new TrainingAdapter(this,getMyList(),this);
        trainingRv.setAdapter(myAdapter);

    }

    private ArrayList<TrainingModel> getMyList() {

        TrainingModel Angular =new TrainingModel();
        Angular.setTrainingTitle("Anas Gara ");
        Angular.setTriningDescription("President");
        Angular.setDateTraining("12/02/02256");
        Angular.setTrainingImg(R.drawable.rawaa);

        trainingModels.add(Angular);

        TrainingModel NodeJs =new TrainingModel();
        NodeJs.setTrainingTitle("Anas Gara ");
        NodeJs.setTriningDescription("President");
        NodeJs.setTrainingImg(R.drawable.rawaa);
        trainingModels.add(NodeJs);

        TrainingModel Flutter =new TrainingModel();
        Flutter.setTrainingTitle("Anas Gara ");
        Flutter.setTriningDescription("President");
        Flutter.setTrainingImg(R.drawable.rawaa);
        trainingModels.add(Flutter);

        TrainingModel aspet =new TrainingModel();
        aspet.setTrainingTitle("Anas Gara ");
        aspet.setTriningDescription("President");
        aspet.setTrainingImg(R.drawable.rawaa);
        trainingModels.add(Angular);

        TrainingModel expressJs =new TrainingModel();
        expressJs.setTrainingTitle("Anas Gara ");
        expressJs.setTriningDescription("President");
        expressJs.setTrainingImg(R.drawable.rawaa);
        trainingModels.add(Angular);



        return trainingModels ;
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.d("hello", "wwwwwwwwwweeeew ");
        Intent intent = new Intent(this, DetailsTraining.class);
        intent.putExtra("training_name", trainingModels.get(position).getTrainingTitle());
        intent.putExtra("training_description", trainingModels.get(position).getTriningDescription());
        intent.putExtra("training_date", trainingModels.get(position).getDateTraining());
        intent.putExtra("training_Img", trainingModels.get(position).getTrainingImg());
        startActivity(intent);
    }
}