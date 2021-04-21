package com.example.microsoft_tech_club_isimm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TrainingAdapter extends RecyclerView.Adapter<TrainingAdapter.ViewHolder> {

@NonNull
private Context context;

    private RecycleViewOnItemClick mListner;
    private List<TrainingModel> trainingArray ;
public TrainingAdapter(Context context, ArrayList<TrainingModel> trainingArray,RecycleViewOnItemClick Listner) {
        this.context=context;
        this.mListner=Listner;
        this.trainingArray=trainingArray;
        }

    public TrainingAdapter(Formations formations, ArrayList<TrainingModel> myList) {

    }


    @Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.training_model, parent, false);
            return (new ViewHolder(v,mListner));
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.TrainingTitle.setText(trainingArray.get(position).getTrainingTitle());
    holder.TrainingDescrip.setText(trainingArray.get(position).getDateTraining());
        holder.TrainingDescrip.setText(trainingArray.get(position).getTriningDescription());
        holder.TrainingImg.setImageResource(trainingArray.get(position).getTrainingImg());

        }

@Override
public int getItemCount() {
        return trainingArray.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView TrainingTitle, TrainingDescrip , dateTraining;
    ImageView TrainingImg;
    private RecycleViewOnItemClick mListener ;

    public ViewHolder(@NonNull View itemView ,RecycleViewOnItemClick Listener)  {
        super(itemView);
        mListener=Listener;
        itemView.setOnClickListener(this);
        TrainingTitle = itemView.findViewById(R.id.trainingTitle);
        TrainingDescrip = itemView.findViewById(R.id.trainingDescrp);
        dateTraining = itemView.findViewById(R.id.dateTraining);
        TrainingImg = itemView.findViewById(R.id.trainingImg);
    }



    @Override
    public void onClick(View v) {
        mListener.onItemClick(v , getAdapterPosition());
    }
}
}
