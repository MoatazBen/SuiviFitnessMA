package forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;

public class AddUserForm {
	private static final String CHAMP_NOM = "nom";
	private static final String CHAMP_PRENOM = "prenom";
	private static final String CHAMP_LOGIN = "login";
	private static final String CHAMP_PASSWORD = "password";
	private static final String CHAMP_PASSWORD_BIS = "passwordBis";
	private static final String WRONG_PASSWORD_ERROR_MESSAGE ="Password invalid�";
	private boolean status;
	private String statusMessage;
	private HttpServletRequest request;
	private Map<String,String> erreurs;
	private User user;
	public AddUserForm(HttpServletRequest request) {
		this.request = request;
		this.erreurs = new HashMap<>();

	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Map<String, String> getErreurs() {
		return erreurs;
	}
	public void setErreurs(Map<String, String> erreurs) {
		this.erreurs = erreurs;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean ajouter(HttpServletRequest request) {
		String prenom = getParameter(CHAMP_PRENOM);
		String nom = getParameter(CHAMP_NOM);
		String login = getParameter(CHAMP_LOGIN);
		String password = getParameter(CHAMP_PASSWORD);
		this.user = new User(prenom,nom,login,password);
		validerChamps(CHAMP_NOM,CHAMP_PRENOM,CHAMP_LOGIN,CHAMP_PASSWORD,CHAMP_PASSWORD_BIS);
		validerPassword();
		if(erreurs.isEmpty()) {
			status = true;
			statusMessage = "Ajout effectu� avec succ�s ";
			UserDatabase.(this.user);
		}
		else {
			status = false;
			statusMessage = "Echec de l'ajout ";
		}
		return status;
	}

	public boolean modifier(HttpServletRequest request) {
		String prenom = getParameter(CHAMP_PRENOM);
		String nom = getParameter(CHAMP_NOM);
		String login = getParameter(CHAMP_LOGIN);
		String password = getParameter(CHAMP_PASSWORD);
		this.user = new User(prenom,nom,login,password);
		validerChamps(CHAMP_NOM,CHAMP_PRENOM,CHAMP_LOGIN,CHAMP_PASSWORD,CHAMP_PASSWORD_BIS);
		validerPassword();
		if(erreurs.isEmpty()) {
			status = true;
			statusMessage = "Modification effectu�e avec succ�s ";
			UserDao.modifier(Integer.parseInt(request.getParameter("id")),prenom,nom,login,password);
		}
		else {
			status = false;
			statusMessage = "Echec de la modification ! ";
		}
		return status;
	}
	public boolean login() {
		String login = getParameter(CHAMP_LOGIN);
		String password = getParameter(CHAMP_PASSWORD);
		User user = UserDao.getLogin(login);
		if(user != null && user.getPassword().equals(password)) {
			status = true;
			statusMessage ="Erreur de Connexion !";
			boolean isConnected ;
			HttpSession session = request.getSession();
			isConnected = true;
			session.setAttribute("isConnected",isConnected);
		}
		else {
			status = false;
		}
		return status;
	}
	public void logout() {
		HttpSession session = request.getSession();
		session.invalidate();
	}

	public String getParameter(String parametre) {
		String valeur = this.request.getParameter(parametre);
		return (valeur ==  null || valeur.trim().isEmpty() ? null :valeur.trim());
	}
	private void validerChamps(String...parametres) {
		for(String parametre : parametres) {
			if(this.getParameter(parametre) == null ) {
				erreurs.put(parametre, "Renseignez ce champs");
			}
		}
	}
	private void validerPassword() {
		String password = this.getParameter(CHAMP_PASSWORD);
		String passwordBis = this.getParameter(CHAMP_PASSWORD_BIS);
		if(password != null && !password.equals(passwordBis)) {
			erreurs.put(CHAMP_PASSWORD, WRONG_PASSWORD_ERROR_MESSAGE);
			erreurs.put(CHAMP_PASSWORD_BIS, WRONG_PASSWORD_ERROR_MESSAGE);
		}
	}


}
