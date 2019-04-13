package com.form.spring.model;


import java.util.Date;

import com.form.spring.model.User.LoginMedium;
import com.form.spring.model.User.LoginSource;


public class UserLogin {

	private LoginSource source;
	private LoginMedium medium;
	private Date time;
	private boolean loggedIn;

	public LoginSource getSource() {
		return source;
	}

	public void setSource(LoginSource source) {
		this.source = source;
	}

	public LoginMedium getMedium() {
		return medium;
	}

	public void setMedium(LoginMedium medium) {
		this.medium = medium;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

}

