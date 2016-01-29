package ca.nait.yliu84;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ca.nait.yliu84.bean.Ticket;

public class ReviewListAdapter extends ArrayAdapter<Ticket> {

	Context mContext;
	int layoutResourceId;
	List<Ticket> data;

	public ReviewListAdapter(Context context, int resource, List<Ticket> objects) {
		super(context, resource, objects);
		mContext = context;
		layoutResourceId = R.layout.list_ticket_item;
		data = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {

			LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
			convertView = inflater.inflate(layoutResourceId, parent, false);
		}

		Ticket dataTicket = data.get(position);

		TextView txtCategory = (TextView) convertView.findViewById(R.id.txt_category);
		TextView txtReviewer = (TextView) convertView.findViewById(R.id.txt_reviewer);
		TextView txtTime = (TextView) convertView.findViewById(R.id.txt_time);
		TextView txtNominee = (TextView) convertView.findViewById(R.id.txt_nominee);
		TextView txtReview = (TextView) convertView.findViewById(R.id.txt_review);

		txtCategory.setText(dataTicket.getCategory());
		txtReview.setText(dataTicket.getReview());
		txtReviewer.setText(dataTicket.getReviewer());
		txtNominee.setText(dataTicket.getNominee());
		txtTime.setText(dataTicket.getDate().toString());

		return convertView;

	}

}