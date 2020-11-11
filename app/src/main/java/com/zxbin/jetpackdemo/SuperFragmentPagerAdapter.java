package com.zxbin.jetpackdemo;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述：
 * <p>
 * Created by audienl@qq.com on 2017/9/5.
 */
public class SuperFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments = new ArrayList<>();

    public SuperFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public SuperFragmentPagerAdapter(FragmentManager fm, Fragment... fragments) {
        super(fm);
        if (fragments != null) {
            mFragments = Arrays.asList(fragments);
        }
    }

    public SuperFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        if (fragments != null) {
            mFragments = fragments;
        }
    }

    public void setFragments(Fragment... fragments) {
        mFragments = Arrays.asList(fragments);
    }

    public void setFragments(List<Fragment> fragments) {
        if (fragments != null) {
            mFragments = fragments;
        }
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
