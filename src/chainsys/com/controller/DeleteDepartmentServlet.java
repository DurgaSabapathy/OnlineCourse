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
 * Servlet implementation class DeleteDepartmentServlet
 */
@WebServlet("/DeleteDepartmentServlet")
public class DeleteDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepartmentServlet() {
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

		Department department=new Department();
		DepartmentDAO dao=new DepartmentDAO();


		department.setName(request.getParameter("departmentid"));
	

		
		try {
			String status=dao.deleteDepartment(department.getName());
			
			request.setAttribute("status",status);
			RequestDispatcher dispatcher=request.getRequestDispatcher("deletedepartment.jsp");
			dispatcher.forward(request,response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String status="Unable to delete";
			request.setAttribute("status",status);
			RequestDispatcher dispatcher=request.getRequestDispatcher("deletedepartment.jsp");
			dispatcher.forward(request,response);
		}
		
				
			// TODO Auto-generated method stub
		}
	}


