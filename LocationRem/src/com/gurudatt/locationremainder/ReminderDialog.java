package com.gurudatt.locationremainder;

import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockDialogFragment;

public class ReminderDialog extends SherlockDialogFragment{
	private EditText edtName;
	private TextView txtLat,txtLong;
	private Button btnGetLoc,btnSet,btnCancel;
	private View v;
	
	static ReminderDialog newInstance(){
		return new ReminderDialog();
	}
	
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
		}try{
			v=inflater.inflate(R.layout.reminder_dialog, container, false);
			
		}catch (InflateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return v;
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		initialize();
		btnSet.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "Set Rem", Toast.LENGTH_SHORT).show();
				
			}
		});
		btnCancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ReminderDialog.this.dismiss();
			}
		});
	}
	private void initialize()
	{
		if(v!=null){
		edtName=(EditText) v.findViewById(R.id.edtName);
		txtLat=(TextView) v.findViewById(R.id.txtLatVal);
		txtLong=(TextView) v.findViewById(R.id.txtLongVal);
		btnSet=(Button) v.findViewById(R.id.btnSet);
		btnCancel=(Button) v.findViewById(R.id.btnCan);
		btnGetLoc=(Button) v.findViewById(R.id.btnGetLoc);
		}
	}
	
	
}
