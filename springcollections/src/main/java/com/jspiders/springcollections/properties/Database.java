package com.jspiders.springcollections.properties;

import java.util.Properties;

public class Database {

	private Properties dbUsername;
	private Properties dbPassword;

	public Properties getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(Properties dbUsername) {
		this.dbUsername = dbUsername;
	}

	public Properties getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(Properties dbPassword) {
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "Database [dbUsername=" + dbUsername + ", dbPassword=" + dbPassword + "]";
	}

}
