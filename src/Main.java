import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        try {
            // Establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computerinventorydb", "root", "к");

            // Prepare the SQL statement for insertion
            String sql = "INSERT INTO brands (name) VALUES (?)";

            // Create a PreparedStatement object
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set value for the parameter
            pstmt.setString(1, "Petko");

            // Execute the statement
            int rowsAffected = pstmt.executeUpdate();

            // Check if insertion was successful
            if(rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

            // Close the PreparedStatement and connection
            pstmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for detailed error information
        }
    }
}
