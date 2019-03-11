package chainsys.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chainsys.com.dao.DepartmentDAO;
import chainsys.com.model.Department;

/**
 * Servlet implementation class AddDepartmentServlet
 */
@WebServlet("/AddDepartmentServlet")
public class AddDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDepartmentServlet() {
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
		Department department=new Department();
		department.setId(Integer.parseInt(request.getParameter("id")));
		department.setName(request.getParameter("name"));
		
		DepartmentDAO departmentDAO=new DepartmentDAO();
		try {
		String status=departmentDAO.addDepartment(department);
		request.setAttribute("status",status);
		RequestDispatcher dispatcher=request.getRequestDispatcher("managedepartment.jsp");
		dispatcher.forward(request,response);
		
		
		
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String status="Unable to insert";
			request.setAttribute("status",status);
			RequestDispatcher dispatcher=request.getRequestDispatcher("managedepartment.jsp");
			dispatcher.forward(request,response);
		}
		
		
		
	}

}
