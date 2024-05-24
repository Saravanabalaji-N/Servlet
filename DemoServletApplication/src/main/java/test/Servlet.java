package test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SignupPageDAO;
import model.SignupPojo;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SignupPageDAO signup=new SignupPageDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 doGet(request, response);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action=request.getServletPath();
		
		switch(action) {
		case "/insert":
			try {
				forminsert(request, response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/delete":
			try {
				formdelete(request,response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	
	}

	private void forminsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		String name=request.getParameter("txt");
		String  phone=request.getParameter("tel");
		String mail=request.getParameter("mail");
		
		SignupPojo pj=new SignupPojo(name, phone, mail);
		SignupPageDAO.insert(pj);
		response.sendRedirect("list");
	}
	
	private void formdelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		String name=request.getParameter("txt");
		SignupPageDAO.delete(name);
		response.sendRedirect("list");
	}
}
