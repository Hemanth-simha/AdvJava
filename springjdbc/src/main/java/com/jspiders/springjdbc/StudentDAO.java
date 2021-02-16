package com.jspiders.springjdbc;

import java.util.List;

public interface StudentDAO {
	
	public int create(Student student);
	public Student read(int id);
	public List<Student> readAll();
	public int delete(int id);
	public int update(Student student);
}
