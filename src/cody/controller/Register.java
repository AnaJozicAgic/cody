package cody.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cody.model.bo.UserBoImplementacija;
import cody.model.bo.validate.ValidateException;
import cody.model.dto.Account;

@WebServlet("/Register")
public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

	UserBoImplementacija bo;

	public Register() {

	}
	@Override
	public void init() throws ServletException {
		super.init();
		bo = new UserBoImplementacija();

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Account user = new Account();

		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));

		try {
			bo.addUser(user);
			request.setAttribute("message", "Registracija uspjesna!");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} catch (ValidateException e) {
			request.setAttribute("message", e.getMessage());
		}

	}

}
