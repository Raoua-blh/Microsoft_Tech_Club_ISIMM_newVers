package com.example.microsoft_tech_club_isimm;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.microsoft_tech_club_isimm.Fragements.Memberofthemonth;
import com.example.microsoft_tech_club_isimm.Fragements.RisingStar;

public class  FragmentAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public FragmentAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Memberofthemonth tab1 = new Memberofthemonth();
               return tab1 ;
            case 1 :
                RisingStar tab2 = new RisingStar();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }


}
