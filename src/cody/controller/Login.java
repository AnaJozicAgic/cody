package cody.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cody.model.bo.SnipetBoImplementacija;
import cody.model.bo.UserBoImplementacija;
import cody.model.dto.Account;
import cody.model.dto.Snipet;

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
		Account user = userBo.readUser(username, password);
		
		SnipetBoImplementacija snipetBo = new SnipetBoImplementacija();
		List<Snipet> snippets = snipetBo.readLatestSnipets();
		
		if(user != null) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("snippets", snippets);
			response.sendRedirect("welcome.jsp");
		} else {
			request.setAttribute("message", "Pokusajte ponovo!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
