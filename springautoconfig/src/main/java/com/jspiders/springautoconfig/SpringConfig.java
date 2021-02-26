package com.jspiders.springautoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/besm28");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
		DriverManagerDataSource dataSource = getDataSource();
		
		jdbcTemplate.setDataSource(dataSource);
		
		return jdbcTemplate;
	}
	
	@Bean
	public StudentDAOImpl getStudentDAOImpl()
	{
		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
		studentDAOImpl.setJdbcTemplate(getJdbcTemplate());
		
		return studentDAOImpl;
	}
	
	@Bean
	public Student getStudent() {
		
		Student student = new Student();
		return student;
	}
	
}
