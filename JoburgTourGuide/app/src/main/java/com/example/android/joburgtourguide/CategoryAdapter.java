package com.example.android.joburgtourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TopAttractionFragment();
        } else if (position == 1) {
            return new ParkFragment();
        } else if (position == 2) {
            return new RestaurantFragment();

        }   else{
                return new MuseumFragment();

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.top_attraction);
        }else if(position == 1){
            return mContext.getString(R.string.parks);
        }else if (position == 2) {
            return mContext.getString(R.string.restaurants);
        }else{
            return mContext.getString(R.string.Museums);
        }

    }
}