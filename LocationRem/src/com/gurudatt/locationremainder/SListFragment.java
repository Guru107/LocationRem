package com.gurudatt.locationremainder;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockDialogFragment;
import com.actionbarsherlock.app.SherlockFragment;

public class SListFragment extends SherlockFragment {
	private Button btnAddreminder;
	private ListView listRem;
	private View v;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		if(v!=null){
			ViewGroup parent=(ViewGroup) v.getParent();
			if(parent!=null){
				parent.removeView(v);
			}
		}

		try{
			
			v=inflater.inflate(R.layout.list_fragment, container, false);
		}catch (InflateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return v;
	}
	private void initialize()
	{
		if(v!=null){
		listRem=(ListView) v.findViewById(R.id.listRem);
		btnAddreminder=(Button) v.findViewById(R.id.btnAddRem);
		}
	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		initialize();
		btnAddreminder.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SListFragment.this.showDialog();
			}

			
		});
	}
	
	void showDialog()
	{
		FragmentTransaction ft=getFragmentManager().beginTransaction();
		SherlockFragment prev=(SherlockFragment) getFragmentManager().findFragmentById(R.layout.reminder_dialog);
		if(prev!=null){
			ft.remove(prev);
		}
		ft.addToBackStack(null);
		
		SherlockDialogFragment dialog=ReminderDialog.newInstance();
		dialog.show(ft,"dialog");
	}
	
}
