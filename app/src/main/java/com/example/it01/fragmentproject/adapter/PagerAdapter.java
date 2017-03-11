package com.example.it01.fragmentproject.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.it01.fragmentproject.fragment.FragmentKedua;
import com.example.it01.fragmentproject.fragment.FragmentPertama;

/**
 * Created by IT01 on 3/11/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int num;
    public PagerAdapter(FragmentManager fm, int num) {
        super(fm);
        this.num = num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentPertama fragmentPertama = new FragmentPertama();
                return fragmentPertama;
            case 1:
                FragmentKedua fragmentKedua = new FragmentKedua();
                return fragmentKedua;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
