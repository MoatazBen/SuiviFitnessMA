package model;

import java.util.Date;

/**
 * Represents a user in the system.
 */
public class Utilisateur {
    private int ID_Utilisateur;
    private String Nom;
    private String Prenom;
    private Date Date_de_Naissance;
    private String Email;
    public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public Date getDate_de_Naissance() {
		return Date_de_Naissance;
	}

	public void setDate_de_Naissance(Date date_de_Naissance) {
		Date_de_Naissance = date_de_Naissance;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMot_de_passe() {
		return Mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		Mot_de_passe = mot_de_passe;
	}

	public float getTaille() {
		return Taille;
	}

	public void setTaille(float taille) {
		Taille = taille;
	}

	public float getPoids() {
		return Poids;
	}

	public void setPoids(float poids) {
		Poids = poids;
	}

	public String getNom_Role() {
		return Nom_Role;
	}

	public void setNom_Role(String nom_Role) {
		Nom_Role = nom_Role;
	}

	private String Mot_de_passe;
    private float Taille;
    private float Poids;
    private String Nom_Role;

    // Constructors, getters, and setters go here

    // Example of a constructor
    public Utilisateur() {
        // Default constructor
    }

    // Example of getters and setters
    public int getID_Utilisateur() {
        return ID_Utilisateur;
    }

    public void setID_Utilisateur(int ID_Utilisateur) {
        this.ID_Utilisateur = ID_Utilisateur;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    // Repeat similar getter and setter methods for other attributes

    @Override
    public String toString() {
        return "Utilisateur{" +
                "ID_Utilisateur=" + ID_Utilisateur +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Date_de_Naissance=" + Date_de_Naissance +
                ", Email='" + Email + '\'' +
                ", Mot_de_passe='" + Mot_de_passe + '\'' +
                ", Taille=" + Taille +
                ", Poids=" + Poids +
                ", Nom_Role='" + Nom_Role + '\'' +
                '}';
    }
}
