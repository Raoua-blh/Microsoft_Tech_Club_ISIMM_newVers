package com.example.microsoft_tech_club_isimm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Team extends AppCompatActivity implements RecycleViewOnItemClick {
    TextView memberName , memberposition;
    ImageView memberImg ;
    RecyclerView memberRv ;
    TeamAdapter myAdapter ;
    ArrayList<TeamModel> MemeberModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        memberName =findViewById(R.id.memberName);
        memberposition = findViewById(R.id.position);
        memberRv = findViewById(R.id.memberRV);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        memberRv.setLayoutManager(gridLayoutManager);

        myAdapter = new TeamAdapter(this,getMyList(),this);
        memberRv.setAdapter(myAdapter);

    }

    private ArrayList<TeamModel> getMyList() {

        TeamModel anas =new TeamModel();
        anas.setMemberName("Anas Gara ");
        anas.setMemeberDescription("President");
        anas.setMemberImg(R.drawable.rawaa);
        MemeberModels.add(anas);

        TeamModel rawaa =new TeamModel();
        rawaa.setMemberName("Rawaà Bel Hadj Amor ");
        rawaa.setMemeberDescription("Trésoriére & VPF");
        rawaa.setMemberImg(R.drawable.rawaa);
        MemeberModels.add(rawaa);


        TeamModel fedi =new TeamModel();
        fedi.setMemberName("Fedi Abdouli");
        fedi.setMemeberDescription("VP Community Manager");
        fedi.setMemberImg(R.drawable.fedi);
        MemeberModels.add(fedi);

        TeamModel eya =new TeamModel();
        eya.setMemberName("Eya Saied");
        eya.setMemeberDescription("general secretary\n");
        eya.setMemberImg(R.drawable.eya);
        MemeberModels.add(eya);

        TeamModel oussema =new TeamModel();
        oussema.setMemberName("Oussema Omar");
        oussema.setMemeberDescription("VP Community Manager");
        oussema.setMemberImg(R.drawable.oussema);
        MemeberModels.add(oussema);

        TeamModel ons =new TeamModel();
        ons.setMemberName("Ons Bahri");
        ons.setMemeberDescription("general secretary........!");
        ons.setMemberImg(R.drawable.ons);
        MemeberModels.add(ons);

        TeamModel chaimaz =new TeamModel();
        chaimaz.setMemberName("Chaima Zebid");
        chaimaz.setMemeberDescription("VP Humain Resource");
        chaimaz.setMemberImg(R.drawable.rawaa);
        MemeberModels.add(chaimaz);

        TeamModel necim =new TeamModel();
        necim.setMemberName("Necim Ben Mhenni");
        necim.setMemeberDescription("VP Media and Marketing ");
        necim.setMemberImg(R.drawable.necim);
        MemeberModels.add(necim);

        TeamModel fares =new TeamModel();
        fares.setMemberName("Fares Hajlaoui");
        fares.setMemeberDescription("VP Sponsoring");
        fares.setMemberImg(R.drawable.fares);
        MemeberModels.add(fares);

        TeamModel houssem =new TeamModel();
        houssem.setMemberName("Slimi Houssem");
        houssem.setMemeberDescription("VP Sponsoring");
        houssem.setMemberImg(R.drawable.houssem);
        MemeberModels.add(houssem);

        TeamModel yassine =new TeamModel();
        yassine.setMemberName("Yassine Landari");
        yassine.setMemeberDescription("VP Technical Resources");
        yassine.setMemberImg(R.drawable.yassine);
        MemeberModels.add(yassine);

        TeamModel wessim =new TeamModel();
        wessim.setMemberName("Wessim Meddeb");
        wessim.setMemeberDescription("VP Event");
        wessim.setMemberImg(R.drawable.wess);
        MemeberModels.add(wessim);

        TeamModel samar =new TeamModel();
        samar.setMemberName("Al Abed Samar");
        samar.setMemeberDescription("Assitant");
        samar.setMemberImg(R.drawable.samar);
        MemeberModels.add(samar);

        TeamModel rahma =new TeamModel();
        rahma.setMemberName("Bouchnak Rahma ");
        rahma.setMemeberDescription("VP Event");
        rahma.setMemberImg(R.drawable.rahma);
        MemeberModels.add(rahma);

        TeamModel safa =new TeamModel();
        safa.setMemberName("Safa Ayechi");
        safa.setMemeberDescription("Assitant");
        safa.setMemberImg(R.drawable.safa);
        MemeberModels.add(safa);

        TeamModel assil =new TeamModel();
        assil.setMemberName("Mhadhbi Assil");
        assil.setMemeberDescription("Assitant");
        assil.setMemberImg(R.drawable.assil);
        MemeberModels.add(assil);

        TeamModel chaimabougie =new TeamModel();
        chaimabougie.setMemberName("Rinez Chaima");
        chaimabougie.setMemeberDescription("Assitant");
        chaimabougie.setMemberImg(R.drawable.bougie);
        MemeberModels.add(chaimabougie);

        TeamModel jihen =new TeamModel();
        jihen.setMemberName("Jihen Messaoud");
        jihen.setMemeberDescription("Assitant");
        jihen.setMemberImg(R.drawable.jihen);
        MemeberModels.add(jihen);

        TeamModel manel =new TeamModel();
        manel.setMemberName("Manel Mahmoudi");
        manel.setMemeberDescription("Assitant");
        manel.setMemberImg(R.drawable.manel);
        MemeberModels.add(manel);

        TeamModel saif =new TeamModel();
        saif.setMemberName("Manel Mahmoudi");
        saif.setMemeberDescription("Assitant");
        saif.setMemberImg(R.drawable.saif);
        MemeberModels.add(saif);

        TeamModel fatma =new TeamModel();
        fatma.setMemberName("Fatma Gharouel");
        fatma.setMemeberDescription("Assitant");
        fatma.setMemberImg(R.drawable.fatma);
        MemeberModels.add(fatma);

        TeamModel medamine =new TeamModel();
        medamine.setMemberName("Med Amine Boussaid");
        medamine.setMemeberDescription("Assitant");
        medamine.setMemberImg(R.drawable.medamine);
        MemeberModels.add(medamine);

        TeamModel saber =new TeamModel();
        saber.setMemberName("Saber Berriche");
        saber.setMemeberDescription("Assitant");
        saber.setMemberImg(R.drawable.saif);
        MemeberModels.add(saber);

        TeamModel mariem =new TeamModel();
        mariem.setMemberName("Mariem Ben Ali");
        mariem.setMemeberDescription("Assitant");
        mariem.setMemberImg(R.drawable.manel);
        MemeberModels.add(mariem);

        TeamModel rached =new TeamModel();
        rached.setMemberName("Ben Nasr Rached");
        rached.setMemeberDescription("Assitant");
        rached.setMemberImg(R.drawable.rached);
        MemeberModels.add(rached);

        return MemeberModels ;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}