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

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    @NonNull
    private Context context;
    private List<TeamModel> MembArray;
    private RecycleViewOnItemClick clickListner;
    public TeamAdapter(Context context, ArrayList<TeamModel> MembArray , RecycleViewOnItemClick clickListner) {
        this.context=context;
        this.clickListner=clickListner ;
        this.MembArray=MembArray;
    }

    public TeamAdapter(Formations context, ArrayList<TrainingModel> myList, Formations formations) {
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.team_model, parent, false);

        return (new ViewHolder(v ,clickListner));    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.MemberName.setText(MembArray.get(position).getMemberName());
        holder.MemberDescrp.setText(MembArray.get(position).getMemeberDescription());
        holder.MemberImg.setImageResource(MembArray.get(position).getMemberImg());

    }

    @Override
    public int getItemCount() {
        return MembArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView MemberName , MemberDescrp;
        ImageView MemberImg ;
        private RecycleViewOnItemClick clickListener ;

        public ViewHolder(@NonNull View itemView , RecycleViewOnItemClick clickListner) {
            super(itemView);
            clickListener=clickListner;
            itemView.setOnClickListener(this);
            MemberName = itemView.findViewById(R.id.memberName);
            MemberDescrp = itemView.findViewById(R.id.position);
            MemberImg = itemView.findViewById(R.id.memberImg);
        }

        @Override
        public void onClick(View v) {
            clickListner.onItemClick(v , getAdapterPosition());
        }
    }

}