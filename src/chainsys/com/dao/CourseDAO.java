package chainsys.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import chainsys.com.model.Course;

import chainsys.com.util.ConnectionUtil;

public class CourseDAO {

	ArrayList<Course> course_List=new ArrayList<Course>();
	public String addCourse(Course course) throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		System.out.println(connection);
		String sql = "insert into courses(id,name,fees,department_id,staff_email)values(?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setString(1,course.getId());

		preparedStatement.setString(2, course.getName());
		
		preparedStatement.setFloat(3, course.getFees());
		preparedStatement.setInt(4, course.getDepartment().getId());
		preparedStatement.setString(5, course.getStaff().getEmail());
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

	public String updateCourse(Course course) throws Exception {
		try
		{
			
		
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "update courses set name=?,fees=?,department_id=?,staff_email=? where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql1);

		preparedStatement.setString(1, course.getName());

		preparedStatement.setFloat(2,  course.getFees());
		preparedStatement.setInt(3, course.getDepartment().getId());
		preparedStatement.setString(4, course.getStaff().getEmail());
		preparedStatement.setString(5, course.getId());
		
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
		String sql1 = "delete from courses where name=?";

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

	public ArrayList<Course> findAll() throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select id,name,fees from courses order by name asc";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

		ResultSet resultSet = preparedStatement.executeQuery();
		Course course;
		while (resultSet.next()) {
course =new Course();
course.setId(course.getId());

course.setName(course.getName());

course.setFees(course.getFees());

		course_List.add(course);
		System.out.println("size"+course_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return course_List;
		}
	
	public ArrayList<Course> findName() throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select name from course order by name asc";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

		ResultSet resultSet = preparedStatement.executeQuery();
		Course course;
		while (resultSet.next()) {
course =new Course();
		course.setName(resultSet.getString("name"));
		
		course_List.add(course);
		System.out.println("size"+course_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return course_List;
		}
	
//	
//
//	public Course findById(Course course) throws Exception {
//		try
//		{
//		Connection connection=ConnectionUtil.getConnection();
//		String sql3 = "select id,name,fees, Course where id=?";
//
//		System.out.println(sql3);
//		PreparedStatement preparedStatement = connection.prepareStatement(sql3);
//
//		preparedStatement.setInt(1, course.getId());
//		ResultSet resultSet = preparedStatement.executeQuery();
//course=null;
//		if (resultSet.next()) {
//			course=new Course();
//			course.setId(resultSet.getInt("id"));
//			course.setName(resultSet.getString("name"));
//			
//		
//			System.out.println(resultSet.getInt("id") + "\t"
//					+ resultSet.getString("name") + "\t"
//					+ resultSet.getFloat("price")+"\t"+resultSet.getDate("publish_date").toLocalDate());
//		} else {
//			System.out.println("\nNo record found");
//		}
//		
//		ConnectionUtil.close(connection, preparedStatement, resultSet);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			throw new Exception("unable to search");
//		
//		
//		
//	}
//
//		return course;
//	
//	
//	
//	
//}
}