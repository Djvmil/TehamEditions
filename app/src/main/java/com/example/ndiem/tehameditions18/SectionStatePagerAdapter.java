package com.example.ndiem.tehameditions18;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;
public class SectionStatePagerAdapter extends FragmentStatePagerAdapter{

    private  final List<Fragment> mfFragmentList = new ArrayList<>();

    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment){
        mfFragmentList.add(fragment);
    }

    @Override
    public Fragment getItem(int i) {
        return mfFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mfFragmentList.size();
    }
}
