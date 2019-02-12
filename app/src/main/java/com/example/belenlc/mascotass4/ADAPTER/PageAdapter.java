package com.example.belenlc.mascotass4.ADAPTER;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class PageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;

    public PageAdapter (FragmentManager fr, ArrayList<Fragment> fragments){
        super(fr);
        this.fragments=fragments;
    }

    public Fragment getItem (int position){
        return fragments.get(position);
    }

    public int getCount(){
        return fragments.size();
    }
}
