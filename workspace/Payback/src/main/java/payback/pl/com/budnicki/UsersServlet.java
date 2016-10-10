package payback.pl.com.budnicki;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsersServlet
 */
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Users user = new Users();
	UsersDAO userDao = new UsersDAO();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersServlet() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("showUsers") != null) {
			List<Users> usersList = new ArrayList<Users>();
			usersList = userDao.showAllUsers();
			request.setAttribute("usersList", usersList);
			RequestDispatcher rd = request.getRequestDispatcher("showAll.jsp");
			rd.forward(request, response);
		}
	}

}
