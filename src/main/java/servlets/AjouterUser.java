package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forms.AddUserForm;


/**
 * Servlet implementation class AjouterUser
 */
@WebServlet("/AjouterUser")
public class AjouterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_AJOUT_UTILISATEUR="/WEB-INF/ajouterUser.jsp" ;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher(VUE_AJOUT_UTILISATEUR).forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AddUserForm  form = new AddUserForm(request);
		form.ajouter(request);
		request.setAttribute("user", form.getUser());
		request.setAttribute("status", form.isStatus());
		request.setAttribute("statusMessage", form.getStatusMessage());
		request.setAttribute("erreurs", form.getErreurs());
		getServletContext().getRequestDispatcher(VUE_AJOUT_UTILISATEUR).forward(request, response);
	}

}
