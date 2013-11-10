package com.gurudatt.locationremainder;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MainActivity extends SherlockFragmentActivity{
	private ActionBar bar;
	private ViewPager viewPager;
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_main);
		viewPager=(ViewPager) findViewById(R.id.pager);
		viewPager.setOnPageChangeListener(onPageChangeListener);
		viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
		addActionBarTabs();
		
	
	}
	
	private ViewPager.SimpleOnPageChangeListener onPageChangeListener=new SimpleOnPageChangeListener(){
		
		@Override
		public void onPageSelected(int position) {
			super.onPageSelected(position);
			bar.setSelectedNavigationItem(position);
		}
	};
	
	private void addActionBarTabs(){
		bar=getSupportActionBar();
		String[] tabs={"List","Map"};
		for(String tabTitle:tabs){
			ActionBar.Tab tab=bar.newTab().setText(tabTitle)
											.setTabListener(tabListener);
			bar.addTab(tab);
			
		}
		bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	}
	
	private ActionBar.TabListener tabListener=new TabListener() {
		
		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			viewPager.setCurrentItem(tab.getPosition());
		}
		
		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
	};
}
