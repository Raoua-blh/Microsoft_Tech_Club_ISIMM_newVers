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
import com.example.microsoft_tech_club_isimm.Fragements.RisingStar;

import java.util.ArrayList;
import java.util.List;

public class RisingStarAdapter extends RecyclerView.Adapter<RisingStarAdapter.ViewHolder> {

    @NonNull
    private Context context;
    private List<RisingStarModel> RSArray;

    public RisingStarAdapter(Context context, ArrayList<RisingStarModel> RSArray, RisingStar risingStar) {
        this.context = context;
        this.RSArray = RSArray;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.rising_star_model, parent, false);

        return (new ViewHolder(v));
    }

    @Override
    public void onBindViewHolder(@NonNull RisingStarAdapter.ViewHolder holder, int position) {
        holder.RSName.setText(RSArray.get(position).getRisingStarName());
        holder.RSmonth.setText(RSArray.get(position).getRSmonth());
        holder.RSImg.setImageResource(RSArray.get(position).getRsImg());

    }

    @Override
    public int getItemCount() {
        return RSArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView RSName, RSmonth;
        ImageView RSImg;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            RSName = itemView.findViewById(R.id.RsName);
            RSmonth = itemView.findViewById(R.id.monthrizingstar);
            RSImg = itemView.findViewById(R.id.risingStarImg);

        }


    }
}