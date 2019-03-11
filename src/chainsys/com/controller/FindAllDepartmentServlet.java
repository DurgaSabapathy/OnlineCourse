package chainsys.com.controller;

import java.io.IOException;


import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import chainsys.com.dao.DepartmentDAO;
import chainsys.com.model.Department;

/**
 * Servlet implementation class FindAllServlet
 */
@WebServlet("/FindAllServlet")
public class FindAllDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllDepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DepartmentDAO dao=new DepartmentDAO();
		ArrayList<Department> departments=new ArrayList<Department>();
		
	StringBuilder stringBuilder=new StringBuilder();

			
			try {
				departments=dao.findAll();
				for (Department department2 :departments) {
					stringBuilder.append(department2.getId()+",");
					
					
					         

			            /* send to the client the JSON string */
			
				}
				response.setContentType("text/plain");
				response.getWriter().write(stringBuilder.toString());
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
}
}