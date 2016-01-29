package ca.nait.yliu84.bean;

import java.util.Calendar;

import ca.nait.yliu84.R.string;

public class Ticket {
	String review;
	String reviewer;
	String nominee;
	String category;
	String password;
	Calendar date;

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReview() {
		return review;
	}

	public String getReviewer() {
		return reviewer;
	}

	public String getNominee() {
		return nominee;
	}

	public String getCategory() {
		return category;
	}

	public String getPassword() {
		return password;
	}

}
