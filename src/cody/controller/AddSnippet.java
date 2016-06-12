package cody.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cody.model.bo.SnipetBoImplementacija;
import cody.model.dto.Account;
import cody.model.dto.Snipet;

/**
 * Servlet implementation class AddSnippet
 */
@WebServlet("/AddSnippet")
public class AddSnippet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSnippet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Account user = (Account) request.getSession().getAttribute("user");
		String textSnipet = request.getParameter("textSnipet");
		
		Snipet snipet = new Snipet();
		snipet.setTextSnipet(textSnipet);
		snipet.setUsernameId(user.getUsername());
		
		SnipetBoImplementacija snipetBo = new SnipetBoImplementacija();
		boolean result = snipetBo.addSnipet(snipet);
		
		if(result) {
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
	}

}
