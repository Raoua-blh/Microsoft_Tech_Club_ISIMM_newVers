package com.example.microsoft_tech_club_isimm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    @NonNull
    private Context context;

    private RecycleViewOnItemClick mListner;

    private List<EventModel> EventArray;

    public EventAdapter(Context context, ArrayList<EventModel> EventArray, RecycleViewOnItemClick Listner) {
        this.context=context;
        this.mListner=Listner;
        this.EventArray=EventArray;
    }

    public EventAdapter(Events events, ArrayList<EventModel> myList) {

    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.event_model, parent, false);

        return (new ViewHolder(v , mListner));    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.EventName.setText(EventArray.get(position).getEventName());
        holder.EventDescrp.setText(EventArray.get(position).getEventDescription());





    }

    @Override
    public int getItemCount() {
        return EventArray.size();
    }





    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView EventName , EventDescrp ;
        private RecycleViewOnItemClick mListener ;

        public ViewHolder(@NonNull View itemView ,RecycleViewOnItemClick Listener) {
            super(itemView);
            mListener=Listener;
            itemView.setOnClickListener(this);

            EventName = itemView.findViewById(R.id.eventName);
            EventDescrp = itemView.findViewById(R.id.eventDescp);


        }

        @Override
        public void onClick(View v) {

            mListener.onItemClick(v , getAdapterPosition());

        }
    }



}
