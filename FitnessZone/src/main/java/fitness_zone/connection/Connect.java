package fitness_zone.connection;

import fitness_zone.config.DbPropertiesLoader;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public static Connection getConnection(){
        Connection connection = null;
        var db = DbPropertiesLoader.getDbName();
        var url = DbPropertiesLoader.getDbUrl() + db;
        var user = DbPropertiesLoader.getDbUsername();
        var password = DbPropertiesLoader.getDbPassword();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Error while connecting to the DB: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        var connection = Connect.getConnection();

        if(connection != null)
            System.out.println("Successfully connected to db: " + connection);
        else
            System.out.println("Error while connecting to db");
    }
}
