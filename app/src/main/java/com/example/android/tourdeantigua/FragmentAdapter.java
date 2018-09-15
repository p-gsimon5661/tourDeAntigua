package com.example.android.tourdeantigua;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new SitesFragment();
            case 4:
                return new ActivitiesFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.item_about);
            case 1:
                return mContext.getString(R.string.item_food);
            case 2:
                return mContext.getString(R.string.item_hotels);
            case 3:
                return mContext.getString(R.string.item_sites);
            case 4:
                return mContext.getString(R.string.item_activities);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
