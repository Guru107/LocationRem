package com.gurudatt.locationremainder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

	private final int PAGES=2; 
	public ViewPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0:
				return new SListFragment();
			
		case 1: return new SMapFragment();

		default:
			  throw new IllegalArgumentException("The Item position should be less than : "+PAGES);
			
		}
	
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGES;
	}

}
