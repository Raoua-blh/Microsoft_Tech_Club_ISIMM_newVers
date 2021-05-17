package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Events extends AppCompatActivity implements RecycleViewOnItemClick {

    ArrayList<EventModel> EventModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ConstraintLayout eventsLayout = findViewById(R.id.eventsLayout);

       RecyclerView EventRV = findViewById(R.id.eventsRV);
        EventRV.setLayoutManager(new LinearLayoutManager(this));
        EventAdapter EventAdapter = new EventAdapter(this, getMyList(),this);
        EventRV.setAdapter(EventAdapter);

        ViewPager viewPager = findViewById(R.id.eventsPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }

    private ArrayList<EventModel> getMyList() {

        EventModel valo = new EventModel();
        valo.setEventName("Valorant");
        valo.setEventDescription("balabaklhabkabebahzejhazheljazklehlakhze ");
        EventModels.add(valo);

        EventModel lol = new EventModel();
        lol.setEventName("LoL Tournement  ");
        lol.setEventDescription("sahit bb ");

        EventModels.add(lol);

        EventModel confirence = new EventModel();
        confirence.setEventName("Online Confirence ");
        confirence.setEventDescription("sahit bb ");

        EventModels.add(confirence);

        return EventModels ;

    }

    @Override
    public void onItemClick(View view, int position) {
        Log.d("hello", "wwwwwwwwwweeeew ");
        Intent intent = new Intent(this, DetailsEvents.class);
        intent.putExtra("event_name", EventModels.get(position).getEventName());
        intent.putExtra("event_description", EventModels.get(position).getEventDescription());
        startActivity(intent);
//        if (position==0)
//        {Intent intent=new Intent(getApplicationContext(),DetailsEvents.class);
//        startActivity(intent);}
//        else  {Intent intent=new Intent(getApplicationContext(),AboutUs.class);
//            startActivity(intent);}
    }
}