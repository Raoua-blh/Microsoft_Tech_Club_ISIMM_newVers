package com.example.microsoft_tech_club_isimm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.microsoft_tech_club_isimm.Fragements.Memberofthemonth;

import java.util.ArrayList;
import java.util.List;

public class MemberofthemonthAdapter extends RecyclerView.Adapter<MemberofthemonthAdapter.ViewHolder> {

    @NonNull
    private Context context;
    private List<MemberofthemonthModel> MembofthemonthArray;

    public MemberofthemonthAdapter(Context context, ArrayList<MemberofthemonthModel> MembofthemonthArray, Memberofthemonth memberofthemonth) {
        this.context = context;
        this.MembofthemonthArray = MembofthemonthArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.memeberof_the_month_model, parent, false);

        return (new ViewHolder(v));
    }

    @Override
    public void onBindViewHolder(@NonNull MemberofthemonthAdapter.ViewHolder holder, int position) {
        holder.MemberofthemonthName.setText(MembofthemonthArray.get(position).getMemberofthemonthName());
        holder.month.setText(MembofthemonthArray.get(position).getMonth());
        holder.MemberImg.setImageResource(MembofthemonthArray.get(position).getMemberImg());

    }

    @Override
    public int getItemCount() {
        return MembofthemonthArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView MemberofthemonthName, month;
        ImageView MemberImg;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            MemberofthemonthName = itemView.findViewById(R.id.mmName);
            month = itemView.findViewById(R.id.month);
            MemberImg = itemView.findViewById(R.id.memberImg);

        }


    }
}