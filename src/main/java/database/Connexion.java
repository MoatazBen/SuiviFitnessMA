package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connexion {

    private static Connection con = null;

    static
    {
        String url = "jdbc:mysql://localhost:3306/usermanagement";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn()
    {
        return con;
    }
}