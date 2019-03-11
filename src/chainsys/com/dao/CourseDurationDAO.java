package chainsys.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import chainsys.com.model.Course;
import chainsys.com.util.ConnectionUtil;

public class CourseDurationDAO {
	ArrayList<Course> course_List=new ArrayList<Course>();
	public String addCourseDuration(Course course) throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		System.out.println(connection);
		String sql = "insert into course_duration(id,start_date,end_date)values(?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setString(1,course.getId());

		preparedStatement.setDate(2, Date.valueOf(course.getStart_Date()));
		

		preparedStatement.setDate(3, Date.valueOf(course.getEnd_Date()));
		
		
		int rows1 = preparedStatement.executeUpdate();
		System.out.println(rows1 + " row affected");
		ConnectionUtil.close(connection, preparedStatement, null);
		return "Inserted Successfully";
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		throw new Exception("unable to insert");	
		
		
		
	
		}
	}

	public String updateCourseDuration(Course course) throws Exception {
		try
		{
			
		
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "update course_duration set start_date=?,end_date=? where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql1);

		preparedStatement.setDate(1, Date.valueOf(course.getStart_Date()));

		preparedStatement.setDate(2,  Date.valueOf(course.getEnd_Date()));
		preparedStatement.setString(3, course.getId());
		
		
		int rows1 = preparedStatement.executeUpdate();
		System.out.println(rows1 + "row updated");
		ConnectionUtil.close(connection, preparedStatement, null);
		return "Updated successfully";
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new Exception("unable to update");	
			
		}

	}

	public String deleteCourse(String name) throws Exception {
		try
		{
			
		
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "delete from course_duration where id=(select id from courses where name=?)";

		PreparedStatement preparedStatement = connection.prepareStatement(sql1);

		preparedStatement.setString(1, name);
		int rows1 = preparedStatement.executeUpdate();
		System.out.println(rows1 + "row updated");
		ConnectionUtil.close(connection, preparedStatement, null);
		return "Deleted Successfully";
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new Exception("unable to delete");
		}
	}

//	public ArrayList<Course> findAll() throws Exception {
//		try
//		{
//		Connection connection=ConnectionUtil.getConnection();
//		
//		String sql4 = "select start_date,end_date from courses order by name asc";
//
//		PreparedStatement preparedStatement = connection.prepareStatement(sql4);
//
//		ResultSet resultSet = preparedStatement.executeQuery();
//		Course course;
//		while (resultSet.next()) {
//course =new Course();
//course.setId(course.getId());
//
//course.setName(course.getName());
//
//course.setFees(course.getFees());
//
//		course_List.add(course);
//		System.out.println("size"+course_List.size());
//		}
//			ConnectionUtil.close(connection, preparedStatement, resultSet);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			throw new Exception("unable to search");
//		}
//		return course_List;
//		}
//	
//	public ArrayList<Course> findName() throws Exception {
//		try
//		{
//		Connection connection=ConnectionUtil.getConnection();
//		
//		String sql4 = "select name from course order by name asc";
//
//		PreparedStatement preparedStatement = connection.prepareStatement(sql4);
//
//		ResultSet resultSet = preparedStatement.executeQuery();
//		Course course;
//		while (resultSet.next()) {
//course =new Course();
//		course.setName(resultSet.getString("name"));
//		
//		course_List.add(course);
//		System.out.println("size"+course_List.size());
//		}
//			ConnectionUtil.close(connection, preparedStatement, resultSet);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			throw new Exception("unable to search");
//		}
//		return course_List;
//		}
	
}
