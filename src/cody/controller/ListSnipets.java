package cody.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cody.model.bo.SnipetBoImplementacija;
import cody.model.dao.SnipetDao;
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
	Account account = (Account) request.getSession(false).getAttribute("account");

		SnipetBoImplementacija bo = new SnipetBoImplementacija();

	List<Snipet> snipets = bo.readAllUsersSnipets(account.getUsername());

	request.setAttribute("snipets", snipets);
		request.getSession().setAttribute("account", account);
		request.getRequestDispatcher("listsnipets.jsp").forward(request, response);
	}

}
