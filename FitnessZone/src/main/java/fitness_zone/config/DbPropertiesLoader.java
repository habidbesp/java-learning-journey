package fitness_zone.config;

import java.io.InputStream;
import java.util.Properties;

public class DbPropertiesLoader {

    // Method that loads and returns the properties from the file
    public static Properties loadProperties(){
        Properties props = new Properties();

        // Try-with-resources: This ensures that the InputStream resource is automatically closed
        // after the try block, even if an exception occurs.
        try(InputStream input = DbPropertiesLoader.class.getClassLoader().getResourceAsStream("dbconfig.properties")){

            // Check if the input stream is null (i.e., the file was not found).
            if (input == null) {
                System.out.println("Sorry, unable to find dbconfig.properties");
                return null;
            }

            // Load properties from the input stream.
            props.load(input);
        } catch (Exception e) {
            System.out.println("Error while loading property variables: " + e.getMessage());
        }

        // Return the loaded properties.
        return props;
    }

    // Method to get the database username
    public static String getDbUsername() {
        Properties props = DbPropertiesLoader.loadProperties();
        return props != null ? props.getProperty("DB_USERNAME") : null;
    }

    // Method to get the database password
    public static String getDbPassword() {
        Properties props = DbPropertiesLoader.loadProperties();
        return props != null ? props.getProperty("DB_PASSWORD") : null;
    }

    // Method to get the database name
    public static String getDbName() {
        Properties props = DbPropertiesLoader.loadProperties();
        return props != null ? props.getProperty("DB_NAME") : null;
    }

    // Method to get the database name
    public static String getDbUrl() {
        Properties props = DbPropertiesLoader.loadProperties();
        return props != null ? props.getProperty("DB_URL") : null;
    }
}


