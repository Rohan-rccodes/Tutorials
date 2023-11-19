import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DatabaseOperationExample {

    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
              
                if (!insertData(connection, "John Doe", 25, "john@example.com")) {
                    throw new SQLExceptionCustom("Insert operation failed");
                }

               
                if (!updateData(connection, 1, "John Doe Updated")) {
                    throw new SQLExceptionCustom("Update operation failed");
                }

               
                if (!deleteData(connection, 1)) {
                    throw new SQLExceptionCustom("Delete operation failed");
                }
            }
        } catch (ClassNotFoundException | SQLException | SQLExceptionCustom e) {
            e.printStackTrace();
        }
    }

    
    private static boolean insertData(Connection connection, String name, int age, String email) throws SQLException {
        String insertQuery = "INSERT INTO your_table_name (name, age, email) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, email);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

  
    private static boolean updateData(Connection connection, int id, String newName) throws SQLException {
        String updateQuery = "UPDATE your_table_name SET name = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

    
    private static boolean deleteData(Connection connection, int id) throws SQLException {
        String deleteQuery = "DELETE FROM your_table_name WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }
}


class SQLExceptionCustom extends SQLException {
    public SQLExceptionCustom(String message) {
        super(message);
    }
}

