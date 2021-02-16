package com.jspiders.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Student student) {

		String sql = "insert into student " + " values(?,?) ";

		int res = getJdbcTemplate().update(sql, student.getId(), student.getName());

		return res;
	}

	@Override
	public Student read(int id) {

		String sql = " select * from student where id = ?";

		StudentRowMapper rowMapper = new StudentRowMapper();
		
		Student student = jdbcTemplate.
				       queryForObject(sql, rowMapper, id);
		
		return student;
	}

	@Override
	public List<Student> readAll() {
		
		String sql = "select * from student";
		
		StudentRowMapper rowMapper = new StudentRowMapper();
		
		List<Student> students= jdbcTemplate.query(sql, rowMapper);
		
		return students;
	}

	@Override
	public int delete(int id) {
		
		String sql = " delete from student "
				+ " where id = ?";
		
		int res= jdbcTemplate.update(sql, id);
		
		return res;
	}

	@Override
	public int update(Student student) {
		
		String sql = " update student "
				+ " set name = ? "
				+ " where id = ? ";
		
		int res = jdbcTemplate.update(sql, student.getName(),student.getId());
		
		return res;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
