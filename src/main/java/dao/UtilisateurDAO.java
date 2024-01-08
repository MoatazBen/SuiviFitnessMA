package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Utilisateur;

public class UtilisateurDAO {

    private Connection connection;  // Assume that you have a database connection

    // Constructor that takes a connection (you need to set this connection in your DAO)
    public UtilisateurDAO(Connection connection) {
        this.connection = connection;
    }

    // Method to save a user to the database
    public void save(Utilisateur utilisateur) {
        String query = "INSERT INTO Utilisateur (Nom, Prenom, Date_de_Naissance, Email, Mot_de_passe, Taille, Poids, Nom_Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            // Convert Date to LocalDate
//            LocalDate dateDeNaissance = utilisateur.getDate_de_Naissance()
//                    .toInstant()
//                    .atZone(ZoneId.systemDefault())
//                    .toLocalDate();
//
//            preparedStatement.setDate(3, java.sql.Date.valueOf(dateDeNaissance));
        preparedStatement.setDate(3, new java.sql.Date(utilisateur.getDate_de_Naissance().getTime()));

            preparedStatement.setString(4, utilisateur.getEmail());
            preparedStatement.setString(5, utilisateur.getMot_de_passe());
            preparedStatement.setFloat(6, utilisateur.getTaille());
            preparedStatement.setFloat(7, utilisateur.getPoids());
            preparedStatement.setString(8, utilisateur.getNom_Role());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
    }

    // Method to retrieve a user by ID from the database
    public Utilisateur getUserByID(int userID) {
        Utilisateur utilisateur = null;
        String query = "SELECT * FROM Utilisateur WHERE ID_Utilisateur = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, userID);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    utilisateur = new Utilisateur();
                    utilisateur.setID_Utilisateur(resultSet.getInt("ID_Utilisateur"));
                    utilisateur.setNom(resultSet.getString("Nom"));
                    utilisateur.setPrenom(resultSet.getString("Prenom"));
                    utilisateur.setDate_de_Naissance(resultSet.getDate("Date_de_Naissance"));
                    utilisateur.setEmail(resultSet.getString("Email"));
                    utilisateur.setMot_de_passe(resultSet.getString("Mot_de_passe"));
                    utilisateur.setTaille(resultSet.getFloat("Taille"));
                    utilisateur.setPoids(resultSet.getFloat("Poids"));
                    utilisateur.setNom_Role(resultSet.getString("Nom_Role"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
        return utilisateur;
    }

    // Add more methods as needed for your application (update, delete, etc.)
}
