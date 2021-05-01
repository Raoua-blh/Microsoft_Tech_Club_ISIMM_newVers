package com.example.microsoft_tech_club_isimm.Fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.microsoft_tech_club_isimm.FragmentAdapter;
import com.example.microsoft_tech_club_isimm.MemberofthemonthAdapter;
import com.example.microsoft_tech_club_isimm.MemberofthemonthModel;
import com.example.microsoft_tech_club_isimm.R;
import com.example.microsoft_tech_club_isimm.RecycleViewOnItemClick;

import java.util.ArrayList;

public class Memberofthemonth extends Fragment  {
    TextView memberofthemonthName , month;
    ImageView memberofthemonthImg ;
    RecyclerView memberofthemonthRv ;
    MemberofthemonthAdapter myAdapter ;
    ArrayList<MemberofthemonthModel> MemeberofthemonthModels = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_memberofthemonth, container, false);


        memberofthemonthName =view.findViewById(R.id.mmName);
        memberofthemonthImg =view.findViewById(R.id.memberImg);
        month = view.findViewById(R.id.month);
        memberofthemonthRv = view.findViewById(R.id.memberofthemonthRV);
        memberofthemonthRv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myAdapter = new MemberofthemonthAdapter(view.getContext(), getMyList(),this);
        memberofthemonthRv.setAdapter(myAdapter);


        return view ;
    }
    private ArrayList<MemberofthemonthModel> getMyList() {


        MemberofthemonthModel anas =new MemberofthemonthModel();
        anas.setMemberofthemonthName("Anas Gara ");
        anas.setMonth("JANVIER");
        anas.setMemberImg(R.drawable.rawaa);
        MemeberofthemonthModels.add(anas);

        MemberofthemonthModel RAWAA =new MemberofthemonthModel();
        RAWAA.setMemberofthemonthName("Anas Gara ");
        RAWAA.setMonth("fevrier");
        RAWAA.setMemberImg(R.drawable.rawaa);
        MemeberofthemonthModels.add(RAWAA);

        MemberofthemonthModel fedi =new MemberofthemonthModel();
        fedi.setMemberofthemonthName("Anas Gara ");
        fedi.setMonth("Mars");
        fedi.setMemberImg(R.drawable.eya);
        MemeberofthemonthModels.add(fedi);
        MemberofthemonthModel seif =new MemberofthemonthModel();
        seif.setMemberofthemonthName("Anas Gara ");
        seif.setMonth("Mars");
        seif.setMemberImg(R.drawable.saif);
        MemeberofthemonthModels.add(seif);



        return MemeberofthemonthModels ; }

}