package chainsys.com.dao;



import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import chainsys.com.model.Department;
import chainsys.com.util.ConnectionUtil;



public class DepartmentDAO {

	ArrayList<Department> department_List=new ArrayList<Department>();
	public String addDepartment(Department department) throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		System.out.println(connection);
		String sql = "insert into department(id,name)values(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setInt(1,department.getId());

		preparedStatement.setString(2, department.getName());
	

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

	public String updateDepartment(int id, String name) throws Exception {
		try
		{
			
		
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "update department set name=? where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql1);

		preparedStatement.setString(1, name);
		
		preparedStatement.setInt(2, id);
		
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

	public String deleteDepartment(String name) throws Exception {
		try
		{
			
		
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "delete from department where name=?";

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

	public ArrayList<Department> findAll() throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select id from department order by name asc";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

		ResultSet resultSet = preparedStatement.executeQuery();
		Department department;
		while (resultSet.next()) {
department =new Department();
		department.setId(resultSet.getInt("id"));
		
		department_List.add(department);
		System.out.println("size"+department_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return department_List;
		}
	
	public ArrayList<Department> findName() throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select name from department order by name asc";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

		ResultSet resultSet = preparedStatement.executeQuery();
		Department department;
		while (resultSet.next()) {
department =new Department();
		department.setName(resultSet.getString("name"));
		
		department_List.add(department);
		System.out.println("size"+department_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return department_List;
		}
	
	

	public Department findByName(Department department) throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		String sql3 = "select id from department where name=?";

		System.out.println(sql3);
		PreparedStatement preparedStatement = connection.prepareStatement(sql3);

		preparedStatement.setString(1, department.getName());
		ResultSet resultSet = preparedStatement.executeQuery();
department=null;
		if (resultSet.next()) {
			department=new Department();
			department.setId(resultSet.getInt("id"));
		
			
		
			System.out.println(resultSet.getInt("id") + "\t"
					+ resultSet.getString("name") + "\t"
					+ resultSet.getFloat("price")+"\t"+resultSet.getDate("publish_date").toLocalDate());
		} else {
			System.out.println("\nNo record found");
		}
		
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		
		
		
	}

		return department;
	
	
	
}}