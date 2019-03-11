package chainsys.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import chainsys.com.dao.StaffDAO;

import chainsys.com.model.Staff;

/**
 * Servlet implementation class FindStaffNameServlet
 */
@WebServlet("/FindStaffNameServlet")
public class FindStaffNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindStaffNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		StaffDAO dao=new StaffDAO();
		ArrayList<Staff> staffs=new ArrayList<Staff>();
		
	StringBuilder stringBuilder=new StringBuilder();

			
			try {
				staffs=dao.findName();
				for (Staff staff2:staffs) {
					stringBuilder.append(staff2.getName()+",");
					
			
				
					         

			            /* send to the client the JSON string */
			
				}
				response.setContentType("text/plain");
				response.getWriter().write(stringBuilder.toString());
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
