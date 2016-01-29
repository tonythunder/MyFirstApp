package ca.nait.yliu84;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class ReviewListActivity extends AppCompatActivity {
	ListView mListView;
	Toolbar mToolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_reviews);

		mToolbar = (Toolbar) findViewById(R.id.toolbar);

		mListView = (ListView) findViewById(R.id.list_reviews);
		this.setSupportActionBar(mToolbar);
		setTitle(getString(R.string.review_list));
		
	}

}
