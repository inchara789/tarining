package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.Student;

public class StudentDAO {
	public boolean update(Student s)
	{
		String sql="update student set name=? where rollno=? ";
		int rows=0;
		try(Connection conn=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(2, s.getRollno());
			ps.setString(1, s.getName());
			rows=ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows>0;
		
		
	}
	
	
	public boolean delete(int rollNo)
	{
		String sql="delete from student where rollno=? ";
		int rows=0;
		try(Connection conn=DBConnectionManager.getConnection())
		{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, rollNo);
		rows=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return rows>0;
	}
	
	
	
	public Student get(int rollNo)
	{
		String sql="select rollno,name from student where rollno=?";
		Student s=null;
		try(Connection conn=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, rollNo);
			ResultSet rs=ps.executeQuery();
			if(rs!=null && rs.next())
			{
				s=new Student(rs.getInt(1),rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	
	public List<Student> getAll()
	{
		String sql="select rollno,name from student";
		Student s=null;
		List<Student> list=new ArrayList<>();
		try(Connection conn=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs != null && rs.next())
			{
				s=new Student(rs.getInt(1),rs.getString(2));
				list.add(s);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

		
	}
	
	
	
	
	
	//public boolean create(int rollno,String name)
	public boolean create(Student student)
	{
	String sql="insert into student(rollno,name) values(?,?)";
	int rows=0;
	try(Connection conn=DBConnectionManager.getConnection())
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		/*ps.setInt(1, rollno);
		ps.setString(2, name);*/
		
		ps.setInt(1, student.getRollno());
		ps.setString(2, student.getName());
		
		rows=ps.executeUpdate();
		System.out.println("student creatred successfully");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rows > 0;
	}

}

