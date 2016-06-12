package cody.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cody.model.bo.SnipetBoImplementacija;
import cody.model.dto.Account;
import cody.model.dto.Snipet;

/**
 * Servlet implementation class ListSnipets
 */
@WebServlet("/listsnipets")
public class ListSnipets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSnipets() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the user from the session
		Account user = (Account) request.getSession().getAttribute("user");

		SnipetBoImplementacija bo = new SnipetBoImplementacija();

		
		if(request.getParameter("submit").equals("list")){
			List<Snipet> snipets = bo.readLatestSnipets();

			if(snipets.isEmpty()) {
				request.setAttribute("message", "Nema snipeta za prikaz!");
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			} else {
				request.getSession().setAttribute("snipets", snipets );
				response.sendRedirect("listsnipets.jsp");
			}
		} else if(request.getParameter("submit").equals("search")){
			List<Snipet> snipets = bo.readAllUsersSnipets(request.getParameter("search"));
			if(snipets.isEmpty()) {
				request.setAttribute("message", "Nema snipeta za prikaz!");
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			} else {
				request.getSession().setAttribute("snipets", snipets );
				response.sendRedirect("listsnipets.jsp");
			}	
		}
	}

}
