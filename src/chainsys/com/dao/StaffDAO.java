package chainsys.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.*;

import chainsys.com.model.Staff;
import chainsys.com.util.ConnectionUtil;

public class StaffDAO {

	
	ArrayList<Staff> staff_List=new ArrayList<Staff>();
	public String addStaff(Staff staff) throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		System.out.println(connection);
		String sql = "insert into staffs(email,password,name,date_of_birth,gender,mobile,address,qualification,designation,working_place,working_place_address,status_of_staff)values(?,?,?,?,?,?,?,?,?,?,?,0)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setString(1,staff.getEmail());
		preparedStatement.setString(2,staff.getPassword());
		preparedStatement.setString(3, staff.getName());
		preparedStatement.setDate(4, Date.valueOf(staff.getDateOfBirth()));
		
		preparedStatement.setString(5,staff.getGender());

		preparedStatement.setLong(6, staff.getMobile());
		preparedStatement.setString(7,staff.getAddress());

		preparedStatement.setString(8, staff.getQualification());
		
		preparedStatement.setString(9,staff.getDesignation());

		preparedStatement.setString(10, staff.getWorkingPlace());
		preparedStatement.setString(11, staff.getWorkingAddress());
		
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

	public String updateStaff(String email) throws Exception {
		Staff staff=new Staff();
		try
		{
			
	
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "update staffs set name=?,date_of_birth=?,gender=?,mobile=?,address=?,qualification=?,designation=?,working_place=?,working_place_address=? where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql1);

	

		preparedStatement.setString(1, staff.getName());
		preparedStatement.setDate(2, Date.valueOf(staff.getDateOfBirth()));
		
		preparedStatement.setString(3,staff.getGender());

		preparedStatement.setLong(4, staff.getMobile());
		preparedStatement.setString(5,staff.getAddress());

		preparedStatement.setString(6, staff.getQualification());
		
		preparedStatement.setString(7,staff.getDesignation());

		preparedStatement.setString(8, staff.getWorkingPlace());
		preparedStatement.setString(9, staff.getWorkingAddress());
		preparedStatement.setString(10,email);
		
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

	public String deleteStaff(String email) throws Exception {
		try
		{
			
		
		Connection connection=ConnectionUtil.getConnection();
		String sql1 = "delete from staffs where email=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql1);

		preparedStatement.setString(1, email);
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

	public ArrayList<Staff> findAll() throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select email,name,gender,date_of_birth,address,qualification,designation,working_place,working_place_address from staffs order by name asc";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

		ResultSet resultSet = preparedStatement.executeQuery();
	Staff staff;
		while (resultSet.next()) {
staff =new Staff();
		staff.setName(resultSet.getString("name"));
		
		staff_List.add(staff);
		System.out.println("size"+staff_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return staff_List;
		}
	
	
	public ArrayList<Staff> findName() throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select name from staffs order by name asc";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

		ResultSet resultSet = preparedStatement.executeQuery();
	Staff staff;
		while (resultSet.next()) {
staff =new Staff();
		staff.setName(resultSet.getString("name"));
		
		staff_List.add(staff);
		System.out.println("size"+staff_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return staff_List;
		}
	
	
	
	public Staff findByName(Staff staff) throws Exception {
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		
		String sql4 = "select email from staffs where name=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);
		preparedStatement.setString(1, staff.getName());
		ResultSet resultSet = preparedStatement.executeQuery();
	Staff staff2=null;
		while (resultSet.next()) {
staff2 =new Staff();
		staff2.setEmail(resultSet.getString("email"));
		
		staff_List.add(staff2);
		System.out.println("size"+staff_List.size());
		}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("unable to search");
		}
		return staff;
		}
	
	
}
	
	
	
	

