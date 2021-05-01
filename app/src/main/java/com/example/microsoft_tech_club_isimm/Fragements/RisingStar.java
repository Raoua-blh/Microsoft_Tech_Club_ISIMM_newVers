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

    import com.example.microsoft_tech_club_isimm.MemberofthemonthAdapter;
    import com.example.microsoft_tech_club_isimm.MemberofthemonthModel;
    import com.example.microsoft_tech_club_isimm.R;
    import com.example.microsoft_tech_club_isimm.RisingStarAdapter;
    import com.example.microsoft_tech_club_isimm.RisingStarModel;

    import java.util.ArrayList;

    public class RisingStar extends Fragment {
        TextView RSName , RSmonth;
        ImageView RsImg ;
        RecyclerView risingstarRv ;
        RisingStarAdapter myAdapter ;
        ArrayList<RisingStarModel> RsModels = new ArrayList<>();


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment

                    View  view = inflater.inflate(R.layout.fragment_rising_star, container, false);

            RSName = view.findViewById(R.id.RsName);
            RsImg =view.findViewById(R.id.risingStarImg);
            RSmonth = view.findViewById(R.id.monthrizingstar);
            risingstarRv = view.findViewById(R.id.risingSatrRV);
            risingstarRv.setLayoutManager(new LinearLayoutManager(view.getContext()));
            myAdapter = new RisingStarAdapter(view.getContext(), getMyList(),this);
            risingstarRv.setAdapter(myAdapter);

                    return view ;
        }

        private ArrayList<RisingStarModel>  getMyList() {

            RisingStarModel anas =new RisingStarModel();
            anas.setRisingStarName("Anas Gara ");
            anas.setRSmonth("JANVIER");
            anas.setRsImg(R.drawable.rawaa);
            RsModels.add(anas);

            RisingStarModel RAWAA =new RisingStarModel();
            RAWAA.setRisingStarName("Anas Gara ");
            RAWAA.setRSmonth("fevrier");
            RAWAA.setRsImg(R.drawable.rawaa);
            RsModels.add(RAWAA);

            RisingStarModel fedi =new RisingStarModel();
            fedi.setRisingStarName("Anas Gara ");
            fedi.setRSmonth("Mars");
            fedi.setRsImg(R.drawable.eya);
            RsModels.add(fedi);
            RisingStarModel seif =new RisingStarModel();
            seif.setRisingStarName("Anas Gara ");
            seif.setRSmonth("Mars");
            seif.setRsImg(R.drawable.saif);
            RsModels.add(seif);

            return RsModels ;
        }

}