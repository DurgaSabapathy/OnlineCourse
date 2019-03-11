package chainsys.com.controller;


import java.io.IOException;
import java.sql.Date;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.proxy.annotation.GetDelegate;
import chainsys.com.dao.CourseDAO;
import chainsys.com.dao.CourseDurationDAO;
import chainsys.com.dao.DepartmentDAO;
import chainsys.com.dao.StaffDAO;
import chainsys.com.model.Course;
import chainsys.com.model.Department;
import chainsys.com.model.Staff;

/**
 * Servlet implementation class AddCourseServlet
 */
@WebServlet("/AddCourseServlet")
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Course course=new Course();

		course.setId(request.getParameter("idd"));
		course.setName(request.getParameter("name"));
		Department department=new Department();
		department.setName(request.getParameter("departmentid"));
DepartmentDAO dao=new DepartmentDAO();
StaffDAO dao2=new StaffDAO();
		Staff staff=new Staff();
		staff.setName(request.getParameter("staffid"));
		
		
	
		try {
			department=dao.findByName(department);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		course.setDepartment(department);
		try {
			staff=dao2.findByName(staff);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		course.setStaff(staff);
		
	
		course.setFees(Float.parseFloat(request.getParameter("fees")));
		course.setStart_Date(LocalDate.parse(request.getParameter("startdate")));
		course.setEnd_Date(LocalDate.parse(request.getParameter("enddate")));
		CourseDAO courseDAO=new CourseDAO();
		CourseDurationDAO courseDurationDAO=new CourseDurationDAO();
		try {
		String status=courseDAO.addCourse(course);
		String status2=courseDurationDAO.addCourseDuration(course);
		System.out.println(status2);
		request.setAttribute("status",status);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("addcourse.jsp");
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
