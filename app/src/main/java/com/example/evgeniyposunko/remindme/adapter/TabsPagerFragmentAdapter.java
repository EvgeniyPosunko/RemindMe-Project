package com.example.evgeniyposunko.remindme.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.evgeniyposunko.remindme.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab1 1",
                "Напоминания",
                "Tab1 1"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragment.getInstans();

            case 1:
                return ExampleFragment.getInstans();

            case 2:
                return ExampleFragment.getInstans();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}