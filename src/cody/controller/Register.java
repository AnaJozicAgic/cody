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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		
		UserBoImplementacija userBo = new UserBoImplementacija();
		boolean result = userBo.addUser(user);
		
		if(result) {
			request.setAttribute("message", "Registracija uspjesna!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			if(userBo.readUser(user.getUsername(), user.getPassword()) != null)
				request.setAttribute("message", "Korisnicko ime vec postoji!");
			else 
				request.setAttribute("message", "Doslo je do greske! Pokusajte ponovo!");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}

}
