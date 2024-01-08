package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Activite;

public class ActiviteDAO {

    private Connection connection;  // Assume that you have a database connection

    // Constructor that takes a connection (you need to set this connection in your DAO)
    public ActiviteDAO(Connection connection) {
        this.connection = connection;
    }

    // Method to save an activity to the database
    public void save(Activite activite) {
        String query = "INSERT INTO Activite (Type, Date, Duree, Distance, Calories, Commentaire, ID_Utilisateur) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, activite.getType());
            preparedStatement.setDate(2, new java.sql.Date(activite.getDate().getTime()));
            preparedStatement.setInt(3, activite.getDuree());
            preparedStatement.setFloat(4, activite.getDistance());
            preparedStatement.setInt(5, activite.getCalories());
            preparedStatement.setString(6, activite.getCommentaire());
            preparedStatement.setInt(7, activite.getID_Utilisateur());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
    }

    // Method to retrieve all activities for a user from the database
    public List<Activite> getAllActivitiesForUser(int userID) {
        List<Activite> activities = new ArrayList<>();
        String query = "SELECT * FROM Activite WHERE ID_Utilisateur = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, userID);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Activite activite = new Activite();
                    activite.setID_Activite(resultSet.getInt("ID_Activite"));
                    activite.setType(resultSet.getString("Type"));
                    activite.setDate(resultSet.getDate("Date"));
                    activite.setDuree(resultSet.getInt("Duree"));
                    activite.setDistance(resultSet.getFloat("Distance"));
                    activite.setCalories(resultSet.getInt("Calories"));
                    activite.setCommentaire(resultSet.getString("Commentaire"));
                    activite.setID_Utilisateur(resultSet.getInt("ID_Utilisateur"));

                    activities.add(activite);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
        return activities;
    } }

    // Add more methods as needed for your application (update, delete, et
