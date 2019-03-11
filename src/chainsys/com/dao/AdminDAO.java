package chainsys.com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import chainsys.com.util.ConnectionUtil;

public class AdminDAO {

	public boolean  validAdmin(String username,String password) throws Exception
	{
		try
		{
		Connection connection=ConnectionUtil.getConnection();
	
		String sql4 ="select username,password from admin_login where username=? and password=?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql4);

	preparedStatement.setString(1, username);
	preparedStatement.setString(2, password);
	
boolean status=false;
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()==false)
		{
		
			
			
			status=true;
			return status;
			
		}
		else
		{
			status=false;
			return status;
					
			
		}
			
		
	
							
						
}
	catch(Exception e)
	{
		e.printStackTrace();
		throw new Exception("unable to search");
	}

}}
