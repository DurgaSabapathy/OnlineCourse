package chainsys.com.controller;

import java.io.IOException;



import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chainsys.com.dao.StaffDAO;
import chainsys.com.model.Staff;

/**
 * Servlet implementation class AddStaffServlet
 */
@WebServlet("/AddStaffServlet")
public class AddStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStaffServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StaffDAO staffDAO = new StaffDAO();
	Staff staff=new Staff();
	staff.setEmail(request.getParameter("email"));
	staff.setName(request.getParameter("name"));
	staff.setDateOfBirth(LocalDate.parse(request.getParameter("dateofbirth")));
	staff.setGender(request.getParameter("gender"));
	staff.setPassword(request.getParameter("password"));
	staff.setAddress(request.getParameter("address"));
	staff.setMobile(Long.parseLong(request.getParameter("mobile")));
	
	staff.setQualification(request.getParameter("qualification"));
	staff.setDesignation(request.getParameter("profession"));
	staff.setWorkingPlace(request.getParameter("workingplace"));
	staff.setWorkingAddress(request.getParameter("addressoffice"));
	
	try
	{
		String status=staffDAO.addStaff(staff);
		request.setAttribute("status",status);
		RequestDispatcher dispatcher=request.getRequestDispatcher("approve.jsp");
		dispatcher.forward(request,response);
		
	}
	catch(Exception e)
	
	{
		e.printStackTrace();
		String status="Unable to register";
		request.setAttribute("status",status);
		RequestDispatcher dispatcher=request.getRequestDispatcher("addstaff.jsp");
		dispatcher.forward(request,response);
	}
		
		
	}

}
