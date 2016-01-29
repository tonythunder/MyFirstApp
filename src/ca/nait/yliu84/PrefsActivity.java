package ca.nait.yliu84;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.ListView;

public class PrefsActivity extends AppCompatActivity {
	Toolbar mToolbar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prefs);
		mToolbar = (Toolbar)findViewById(R.id.toolbar);
		this.setSupportActionBar(mToolbar);
		setTitle(getString(R.string.preferences));
	}

}
