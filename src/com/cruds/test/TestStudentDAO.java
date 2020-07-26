package com.cruds.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.cruds.db.StudentDAO;
import com.demo.Student;

public class TestStudentDAO {
	@Test
	public void get() {
		StudentDAO dao=new StudentDAO();
		Student s=dao.get(202);
		assertEquals("inch", s.getName());
	}
	
	@Test
	public void getdel() {
		StudentDAO dao=new StudentDAO();
		Student s=dao.get(202);
		assertEquals("inch", s.getName());
	}
	
	
	
	@Test
	public void getAll() {
		StudentDAO dao=new StudentDAO();
		assertTrue(dao.getAll().size()>0);
	}
	
	
	@Ignore
	@Test
	public void test() {
		StudentDAO dao=new StudentDAO();
		//assertTrue(dao.create(205, "inch"));
		assertTrue(dao.create(new Student(404, "nisu")));
	}

}
