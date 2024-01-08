package model;

/**
 * Represents graphical data in the system.
 */
public class Graphique {
    private int ID_Graphique;
    private int ID_Utilisateur;
    private String Type_Graphique;
    private int Donnee_X;
    private int Donnee_Y;

    // Constructors, getters, and setters go here

    // Example of a constructor
    public Graphique() {
        // Default constructor
    }

    // Example of getters and setters
    public int getID_Graphique() {
        return ID_Graphique;
    }

    public void setID_Graphique(int ID_Graphique) {
        this.ID_Graphique = ID_Graphique;
    }

    public int getID_Utilisateur() {
        return ID_Utilisateur;
    }

    public void setID_Utilisateur(int ID_Utilisateur) {
        this.ID_Utilisateur = ID_Utilisateur;
    }

    public String getType_Graphique() {
        return Type_Graphique;
    }

    public void setType_Graphique(String Type_Graphique) {
        this.Type_Graphique = Type_Graphique;
    }

    public int getDonnee_X() {
        return Donnee_X;
    }

    public void setDonnee_X(int Donnee_X) {
        this.Donnee_X = Donnee_X;
    }

    public int getDonnee_Y() {
        return Donnee_Y;
    }

    public void setDonnee_Y(int Donnee_Y) {
        this.Donnee_Y = Donnee_Y;
    }

    @Override
    public String toString() {
        return "Graphique{" +
                "ID_Graphique=" + ID_Graphique +
                ", ID_Utilisateur=" + ID_Utilisateur +
                ", Type_Graphique='" + Type_Graphique + '\'' +
                ", Donnee_X=" + Donnee_X +
                ", Donnee_Y=" + Donnee_Y +
                '}';
    }
}
