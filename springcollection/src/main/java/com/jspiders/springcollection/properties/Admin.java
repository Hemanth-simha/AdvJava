package com.jspiders.springcollection.properties;

import java.util.Properties;

public class Admin {
	
	private Properties databaseUsername;
	private Properties databasePassword;
	
	public Properties getDatabaseUsername() {
		return databaseUsername;
	}
	public void setDatabaseUsername(Properties databaseUsername) {
		this.databaseUsername = databaseUsername;
	}
	public Properties getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(Properties databasePassword) {
		this.databasePassword = databasePassword;
	}
	
	@Override
	public String toString() {
		return "Admin [databaseUsername=" + databaseUsername + ", databasePassword=" + databasePassword + "]";
	}
	
	
	
}
