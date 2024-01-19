package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class SupprimerUser
 */
@WebServlet("/SupprimerUser")
public class SupprimerUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE_SUP_UTILISATEUR="/WEB-INF/ListerUser.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		int id =Integer.parseInt(request.getParameter("id")) ;
		if(UserDao.supprimer(id)) {
			 response.sendRedirect(request.getContextPath()+"/ListerUser");
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
