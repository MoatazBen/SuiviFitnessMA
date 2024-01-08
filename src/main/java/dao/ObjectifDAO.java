package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Objectif;

public class ObjectifDAO {

    private Connection connection;  // Assume that you have a database connection

    // Constructor that takes a connection (you need to set this connection in your DAO)
    public ObjectifDAO(Connection connection) {
        this.connection = connection;
    }

    // Method to save a goal to the database
    public void save(Objectif objectif) {
        String query = "INSERT INTO Objectif (Libelle, Date_Debut, Date_Fin, ID_Utilisateur) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
          
        }
    }

    // Method to retrieve all goals for a user from the database
    public List<Objectif> getAllGoalsForUser(int userID) {
        List<Objectif> goals = new ArrayList<>();
        String query = "SELECT * FROM Objectif WHERE ID_Utilisateur = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, userID);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Objectif objectif = new Objectif();
                    objectif.setID_Objectif(resultSet.getInt("ID_Objectif"));
                    objectif.setLibelle(resultSet.getString("Libelle"));
                    objectif.setDate_Debut(resultSet.getDate("Date_Debut"));
                    objectif.setDate_Fin(resultSet.getDate("Date_Fin"));
                    objectif.setID_Utilisateur(resultSet.getInt("ID_Utilisateur"));

                    goals.add(objectif);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
        return goals;
    }

    // Add more methods as needed for your application (update, delete, etc.)
}
