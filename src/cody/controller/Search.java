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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Account user = (Account) request.getSession().getAttribute("user");

		SnipetBoImplementacija bo = new SnipetBoImplementacija();
		
		List<Snipet> snippets = bo.searchSnippets(request.getParameter("search"));
		if (snippets.isEmpty()) {
			request.setAttribute("message", "Nema snipeta za prikaz!");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.getSession().setAttribute("snippets", snippets);
			response.sendRedirect("listsnipets.jsp");
		}
	}

}
