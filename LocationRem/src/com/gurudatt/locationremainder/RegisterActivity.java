package com.gurudatt.locationremainder;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockActivity;

public class RegisterActivity extends SherlockActivity {
	private EditText edtFname,edtLname,edtEmail,edtPassword,edtCPassword;
	private Button btnRegister;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initialize();
	}
	private void initialize() {
		// TODO Auto-generated method stub
		edtFname=(EditText) findViewById(R.id.edtFName);
		edtLname=(EditText) findViewById(R.id.edtLName);
		edtEmail=(EditText) findViewById(R.id.edtEmail);
		edtPassword=(EditText) findViewById(R.id.edtPassword);
		edtCPassword=(EditText) findViewById(R.id.edtCPassword);
		btnRegister=(Button) findViewById(R.id.btnRegister);
		
	}

}
