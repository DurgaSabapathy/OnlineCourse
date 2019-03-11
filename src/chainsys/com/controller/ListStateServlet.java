package chainsys.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chainsys.com.dao.CountryDAO;
import chainsys.com.dao.StateDAO;
import chainsys.com.model.Country;
import chainsys.com.model.State;

/**
 * Servlet implementation class ListStateServlet
 */
@WebServlet("/ListStateServlet")
public class ListStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int countryID;
		String name=request.getParameter("country");

ArrayList<Country> list=new ArrayList<>();

		ArrayList<State> stateList=new ArrayList<>();
		try {
			CountryDAO dao=new CountryDAO();

			// list=dao.findCountryID(name);
System.out.println("List"+list.size());
StateDAO stateDAO=new StateDAO();
for(Country country:list)
{
				// countryID=country.getId();
				// stateList=stateDAO.findStateID(countryID);
}




	System.out.println("Size:"+stateList.size());
	request.setAttribute("States", stateList);
RequestDispatcher rd1=request.getRequestDispatcher("userregister.jsp");
rd1.forward(request, response);


		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

		}



		// TODO Auto-generated method stub
	}


