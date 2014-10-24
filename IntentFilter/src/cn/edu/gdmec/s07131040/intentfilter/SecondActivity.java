package cn.edu.gdmec.s07131040.intentfilter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {
	EditText myEt2;
	Button myBtn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		myEt2=(EditText) findViewById(R.id.editText2);
		myBtn2=(Button) findViewById(R.id.button2);
		
		myBtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent myIt2 = getIntent();
				String str="http://"+myIt2.getData().getHost();
				myEt2.setText(str);
				Uri myUri=Uri.parse(myEt2.getText().toString());
				Intent myIt3=new Intent(Intent.ACTION_VIEW,myUri);
				startActivity(myIt3);
			}
		});
	}

}
