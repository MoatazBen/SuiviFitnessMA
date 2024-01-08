package model;

import java.util.Date;

/**
 * Represents a user's goal or objective in the system.
 */
public class Objectif {
    private int ID_Objectif;
    private String Libelle;
    private Date Date_Debut;
    private Date Date_Fin;
    private int ID_Utilisateur;

    // Constructors, getters, and setters go here

    // Example of a constructor
    public Objectif() {
        // Default constructor
    }

    // Example of getters and setters
    public int getID_Objectif() {
        return ID_Objectif;
    }

    public void setID_Objectif(int ID_Objectif) {
        this.ID_Objectif = ID_Objectif;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    // Repeat similar getter and setter methods for other attributes

    @Override
    public String toString() {
        return "Objectif{" +
                "ID_Objectif=" + ID_Objectif +
                ", Libelle='" + Libelle + '\'' +
                ", Date_Debut=" + Date_Debut +
                ", Date_Fin=" + Date_Fin +
                ", ID_Utilisateur=" + ID_Utilisateur +
                '}';
    }

	public Date getDate_Debut() {
		return Date_Debut;
	}

	public void setDate_Debut(Date date_Debut) {
		Date_Debut = date_Debut;
	}

	public Date getDate_Fin() {
		return Date_Fin;
	}

	public void setDate_Fin(Date date_Fin) {
		Date_Fin = date_Fin;
	}

	public int getID_Utilisateur() {
		return ID_Utilisateur;
	}

	public void setID_Utilisateur(int iD_Utilisateur) {
		ID_Utilisateur = iD_Utilisateur;
	}


	



}
