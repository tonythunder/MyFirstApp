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
import android.widget.RadioGroup;
import ca.nait.yliu84.R.string;
import ca.nait.yliu84.bean.Ticket;

public class MyFirstAppActivity extends AppCompatActivity implements OnClickListener {

	Toolbar mToolbar;
	EditText mEditReview;
	EditText mEditReviewer;
	EditText mEditNominee;
	RadioGroup mRadioCategory;
	EditText mEditPassword;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button sendButton = (Button) findViewById(R.id.button_send_data);

		// Map views, should use butterknife in future
		mToolbar = (Toolbar) findViewById(R.id.toolbar);
		mEditReview = (EditText) findViewById(R.id.edit_text_review);
		mEditReviewer = (EditText) findViewById(R.id.edit_text_reviewer);
		mEditNominee = (EditText) findViewById(R.id.edit_text_nominee);
		mEditPassword = (EditText) findViewById(R.id.edit_text_password);
		mRadioCategory = (RadioGroup) findViewById(R.id.radio_group_category);

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
		
		Ticket ticket = generateTicket();
		//TODO:send ticket to server
		Intent intent = new Intent(this, ReviewListActivity.class);

		this.startActivity(intent);

	}

	private Ticket generateTicket() {
		Ticket ticket = new Ticket();
		ticket.setNominee(mEditNominee.getText().toString());
		ticket.setReview(mEditReview.getText().toString());
		ticket.setReviewer(mEditReviewer.getText().toString());
		ticket.setPassword(mEditPassword.getText().toString());
		String category;
		switch (mRadioCategory.getCheckedRadioButtonId()) {
		case R.id.radio_actor:
			category = "actor";
			break;
		case R.id.radio_actress:
			category = "actress";
			break;
		case R.id.radio_editing:
			category = "editing";
			break;
		case R.id.radio_effects:
			category = "effects";
			break;
		case R.id.radio_picture:
			category = "picture";
			break;
		default:
			category = "picture";
			break;
		}

		ticket.setCategory(category);
		return ticket;
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