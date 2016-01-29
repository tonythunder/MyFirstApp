package ca.nait.yliu84;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class MyFirstAppActivity extends Activity implements OnClickListener 
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button sendButton = (Button) findViewById(R.id.buttons_send_data);
        sendButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		EditText textBox = (EditText)findViewById(R.id.edit_text_review);
		String data = textBox.getText().toString();
		
		Intent intent = new Intent(this, ReceiveDataActivity.class);
		Bundle bundle = new Bundle();
		bundle.putString("PREFIX","You typed: ");
		bundle.putString("DATA",data);
		intent.putExtras(bundle);
		
		this.startActivity(intent);
		
//		Toast.makeText(this, "You entered: " + data, Toast.LENGTH_LONG).show();
		
	}
}