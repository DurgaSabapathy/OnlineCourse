package chainsys.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import chainsys.com.model.State;
import chainsys.com.util.ConnectionUtil;

public class StateDAO {

	ArrayList<State> stateList = new ArrayList<>();

	public ArrayList<State> findStateID(int countryID) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();

			String sql4 = "select id,name from states where country_id=?";

			PreparedStatement preparedStatement = connection
					.prepareStatement(sql4);
			preparedStatement.setInt(1, countryID);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				State state = new State();
				state.setId(resultSet.getInt("id"));
				state.setName(resultSet.getString("name"));

				stateList.add(state);

			}
			System.out.println("Statelist"+stateList.size());

			return stateList;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("unable to search");
		}

	}
}
