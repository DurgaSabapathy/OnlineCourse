package chainsys.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chainsys.com.dao.CountryDAO;
import chainsys.com.model.Country;

/**
 * Servlet implementation class ListCountryServlet
 */
@WebServlet(name = "ListCountryServlet", urlPatterns = { "perform" })
public class ListCountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListCountryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		Country country = new Country();
		CountryDAO dao = new CountryDAO();
		if (action.equals("insert")) {

			country.setName(request.getParameter("country"));
			try {
				dao.addCountry(country);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			request.setAttribute("oldTitle", "new tile for poll.jsp ");
			getServletConfig().getServletContext()
					.getRequestDispatcher("/poll.jsp")
					.forward(request, response);
		}

		// ArrayList<Country> list = new ArrayList<Country>();
		//
		// try {
		// CountryDAO dao = new CountryDAO();
		// list = dao.selectCountry();
		//
		// HttpSession session = request.getSession();
		// session.setAttribute("countries", list);
		//
		// RequestDispatcher rd1 = request
		// .getRequestDispatcher("userregister.jsp");
		// rd1.forward(request, response);
		//
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		//
		// }
		//
		// }

	// TODO Auto-generated method stub
}
}