package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forms.AddUserForm;

/**
 * Servlet implementation class Authentification
 */
@WebServlet({"","/Authentification"})
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_AUT_UTILISATEUR="/WEB-INF/authentification.jsp" ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher(VUE_AUT_UTILISATEUR).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AddUserForm form = new AddUserForm(request);
		if(form.login()) {

			response.sendRedirect(request.getContextPath()+"/ListerUser");

		}
		else {
			request.setAttribute("statusMessage", form.getStatusMessage());
			response.sendRedirect(request.getContextPath()+"/Authentification");

		}

	}

}
