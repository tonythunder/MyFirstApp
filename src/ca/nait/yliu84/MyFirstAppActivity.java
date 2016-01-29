package ca.nait.yliu84;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MyFirstAppActivity extends AppCompatActivity implements OnClickListener {
	
	Toolbar mToolbar;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button sendButton = (Button) findViewById(R.id.button_send_data);
		mToolbar = (Toolbar)findViewById(R.id.toolbar);
		this.setSupportActionBar(mToolbar);
		
		sendButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		EditText textBox = (EditText) findViewById(R.id.edit_text_review);
		String data = textBox.getText().toString();

		Intent intent = new Intent(this, ReviewListActivity.class);
		Bundle bundle = new Bundle();
		bundle.putString("PREFIX", "You typed: ");
		bundle.putString("DATA", data);
		intent.putExtras(bundle);

		this.startActivity(intent);

		// Toast.makeText(this, "You entered: " + data,
		// Toast.LENGTH_LONG).show();

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		Intent intent;
		switch (item.getItemId()) {

		case R.id.menu_prefs:
			intent = new Intent(this, PrefsActivity.class);
			this.startActivity(intent);
			return true;
		case R.id.menu_list_reviews:
			intent = new Intent(this, ReviewListActivity.class);
			this.startActivity(intent);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}