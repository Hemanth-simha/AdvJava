package com.jspiders.spring.constructorinjections.properties;

public class MyDatabase {

	private String dbName;
	private String dbUsername;
	private String dbPassword;
	
	public MyDatabase(String dbName, String dbUsername, String dbPassword) {
		super();
		this.dbName = dbName;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "MyDatabase [dbName=" + dbName + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword + "]";
	}

}
