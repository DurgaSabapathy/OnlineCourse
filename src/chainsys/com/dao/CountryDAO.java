package chainsys.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import chainsys.com.model.Country;
import chainsys.com.util.ConnectionUtil;

public class CountryDAO {

	ArrayList<Country> countrylist = new ArrayList<Country>();

	public String addCountry(Country country) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();

			System.out.println(connection);
			String sql = "insert into country(id,name)values(stud_seq.NEXTVAL(),?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, country.getName());

			int rows1 = preparedStatement.executeUpdate();
			System.out.println(rows1 + " row affected");

			return "Inserted Successfully";

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");

		}

		finally {
			ConnectionUtil.close(connection, preparedStatement, null);

		}
	}

	public String updateCountry(Country country) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();

			System.out.println(connection);
			String sql = "update country set name=? where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, country.getName());
			preparedStatement.setLong(2, country.getId());
			int rows1 = preparedStatement.executeUpdate();
			System.out.println(rows1 + " row affected");

			return "Updated Successfully";

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to update");

		}

		finally {
			ConnectionUtil.close(connection, preparedStatement, null);

		}
	}

	public String deleteCountry(Country country) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionUtil.getConnection();

			System.out.println(connection);
			String sql = "delete country where name=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, country.getName());

			int rows1 = preparedStatement.executeUpdate();
			System.out.println(rows1 + " row affected");

			return "Deleted Successfully";

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to update");

		}

		finally {
			ConnectionUtil.close(connection, preparedStatement, null);

		}
	}

	public ArrayList<Country> selectCountry() throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();

			String sql4 = "select id,name from country";

			PreparedStatement preparedStatement = connection
					.prepareStatement(sql4);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Country country = new Country();

				country.setName(resultSet.getString("name"));

				countrylist.add(country);

			}
			System.out.println(countrylist.size());

			return countrylist;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("unable to search");
		}

	}



}
