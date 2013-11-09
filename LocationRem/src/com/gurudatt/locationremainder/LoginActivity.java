package com.gurudatt.locationremainder;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockActivity;

public class LoginActivity extends SherlockActivity{
	
	private Button btnLogin,btnRegister;
	private EditText edtUserName,edtPassword;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		
		btnLogin=(Button) findViewById(R.id.btnLogin);
		btnRegister=(Button) findViewById(R.id.btnRegd);
		edtUserName=(EditText) findViewById(R.id.edtUserName);
		edtPassword=(EditText) findViewById(R.id.edtPass);
		
	}

}
