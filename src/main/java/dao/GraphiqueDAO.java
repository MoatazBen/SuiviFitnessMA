package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Graphique;

public class GraphiqueDAO {

    private Connection connection;  // Assume that you have a database connection

    // Constructor that takes a connection (you need to set this connection in your DAO)
    public GraphiqueDAO(Connection connection) {
        this.connection = connection;
    }

    // Method to save a graph to the database
    public void save(Graphique graphique) {
        String query = "INSERT INTO Graphique (ID_Utilisateur, Type_Graphique, Donnee_X, Donnee_Y) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, graphique.getID_Utilisateur());
            preparedStatement.setString(2, graphique.getType_Graphique());
            preparedStatement.setInt(3, graphique.getDonnee_X());
            preparedStatement.setInt(4, graphique.getDonnee_Y());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
    }

    // Method to retrieve all graphs for a user from the database
    public List<Graphique> getAllGraphsForUser(int userID) {
        List<Graphique> graphs = new ArrayList<>();
        String query = "SELECT * FROM Graphique WHERE ID_Utilisateur = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, userID);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Graphique graphique = new Graphique();
                    graphique.setID_Graphique(resultSet.getInt("ID_Graphique"));
                    graphique.setID_Utilisateur(resultSet.getInt("ID_Utilisateur"));
                    graphique.setType_Graphique(resultSet.getString("Type_Graphique"));
                    graphique.setDonnee_X(resultSet.getInt("Donnee_X"));
                    graphique.setDonnee_Y(resultSet.getInt("Donnee_Y"));

                    graphs.add(graphique);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
        return graphs;
    }

    // Add more methods as needed for your application (update, delete, etc.)
}
