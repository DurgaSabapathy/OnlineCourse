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
 * Servlet implementation class UpdateDepartmentServlet
 */
@WebServlet("/UpdateDepartmentServlet")
public class UpdateDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDepartmentServlet() {
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
	DepartmentDAO dao=new DepartmentDAO();


	department.setId(Integer.parseInt(request.getParameter("departmentid")));
	department.setName(request.getParameter("name"));

	
	try {
		String status=dao.updateDepartment(department.getId(), department.getName());
		request.setAttribute("status",status);
		RequestDispatcher dispatcher=request.getRequestDispatcher("updatedepartment.jsp");
		dispatcher.forward(request,response);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		String status="Unable to update";
		request.setAttribute("status",status);
		RequestDispatcher dispatcher=request.getRequestDispatcher("updatedepartment.jsp");
		dispatcher.forward(request,response);
	}
	
			
		// TODO Auto-generated method stub
	}

}
