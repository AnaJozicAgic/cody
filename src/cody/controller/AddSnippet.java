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
		String textSnipet = request.getParameter("snippetCode");
		String nameSnipet = request.getParameter("snippetName");
		
		Snipet snipet = new Snipet();
		snipet.setTextSnipet(textSnipet);
		snipet.setName(nameSnipet);
		snipet.setUsernameId(user.getUsername());
		
		SnipetBoImplementacija snipetBo = new SnipetBoImplementacija();
		boolean result = snipetBo.addSnipet(snipet);
		boolean exists = snipetBo.isNameAlredyExists(snipet.getName());
		
		
		if(result && !exists) {
			request.setAttribute("message", "Snippet added successfully!");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			if(exists)
				request.setAttribute("message", "Snippet name allready exists!");
			else
				request.setAttribute("message", "An error has occurred!");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
	}

}
