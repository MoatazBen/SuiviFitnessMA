package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UtilisateurDAO;

/**
 * Servlet implementation class ListerUser
 */
@WebServlet("/ListerUser")
public class ListerUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE_LISTE_UTILISATEUR = "/WEB-INF/listerUser.jsp";
    /**
     * @see HttpServlet#HttpServlet()

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		getServletContext().getRequestDispatcher(VUE_LISTE_UTILISATEUR).forward(request,response);

	}

}
