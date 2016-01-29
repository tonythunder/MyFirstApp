package ca.nait.yliu84;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class ReceiveDataActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.receive_data);
		
		Bundle bundle = getIntent().getExtras();
		String prefix = bundle.getString("PREFIX");
		String data = bundle.getString("DATA");
		
		EditText textBox = (EditText)findViewById(R.id.textbox_receive_data);
		textBox.setText(prefix + data);
	}

}
