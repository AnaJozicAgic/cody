package cody.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cody.model.bo.UserBoImplementacija;
import cody.model.dto.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginHendler")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserBoImplementacija userBo = new UserBoImplementacija();
		User user = userBo.readUser(username, password);
		
		if(user != null) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("welcome.jsp");
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
