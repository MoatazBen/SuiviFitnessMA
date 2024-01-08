package model;

import java.util.Date;

/**
 * Represents an activity in the system.
 */
public class Activite {
    private int ID_Activite;
    private String Type;
    private Date Date;
    private int Duree;
    private float Distance;
    private int Calories;
    private String Commentaire;
    private int ID_Utilisateur;

    // Constructors, getters, and setters go here

    // Example of a constructor
    public Activite() {
        // Default constructor
    }

    // Example of getters and setters
    public int getID_Activite() {
        return ID_Activite;
    }

    public void setID_Activite(int ID_Activite) {
        this.ID_Activite = ID_Activite;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getDuree() {
        return Duree;
    }

    public void setDuree(int Duree) {
        this.Duree = Duree;
    }

    public float getDistance() {
        return Distance;
    }

    public void setDistance(float Distance) {
        this.Distance = Distance;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    public String getCommentaire() {
        return Commentaire;
    }

    public void setCommentaire(String Commentaire) {
        this.Commentaire = Commentaire;
    }

    public int getID_Utilisateur() {
        return ID_Utilisateur;
    }

    public void setID_Utilisateur(int ID_Utilisateur) {
        this.ID_Utilisateur = ID_Utilisateur;
    }

    @Override
    public String toString() {
        return "Activite{" +
                "ID_Activite=" + ID_Activite +
                ", Type='" + Type + '\'' +
                ", Date=" + Date +
                ", Duree=" + Duree +
                ", Distance=" + Distance +
                ", Calories=" + Calories +
                ", Commentaire='" + Commentaire + '\'' +
                ", ID_Utilisateur=" + ID_Utilisateur +
                '}';
    }
}
