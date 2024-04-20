package JDBC_DEMO;
import java.sql.*;//directly use this
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;


//Import JDBC Packages: Import the JDBC packages required for database connectivity.
//These typically include java.sql and specific database driver packages.
//Load and Register the Driver: Use Class.forName() to dynamically load and register the JDBC driver
//for your database. This step is crucial for establishing a connection to the database.
//Establish Connection: Use DriverManager.getConnection() to establish a connection to the database.
//This method returns a Connection object which represents the database connection.
//Create Statement or PreparedStatement: Once the connection is established, you can create a Statement
//or PreparedStatement object for executing SQL queries. Statement is used for general SQL queries, while
//PreparedStatement is preferred for parameterized queries to prevent SQL injection attacks.
//Execute Query: Use the executeQuery() method of the Statement or PreparedStatement object to execute SQL
//SELECT queries that retrieve data from the database. For other types of SQL queries
//        (e.g., INSERT, UPDATE, DELETE), you can use executeUpdate().
//Process Results: If the SQL query returns a result set (e.g., SELECT query), iterate through the
//result set using methods like ResultSet.next() to access each row's data.
//Close Connections and Resources: After you have finished using the Connection, Statement,
//PreparedStatement, and ResultSet objects, make sure to close them explicitly to release
//database and JDBC resources. This helps in managing resources efficiently and avoiding memory leaks.
public class jdbc_demo {
    public static void main(String[] args) {
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;

                try {
                    // Step 3: Establish connection
                    connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password");

                    // Step 4: Create statement
                    statement = connection.createStatement();

                    // Step 5: Execute query
                    resultSet = statement.executeQuery("SELECT * FROM your_table");

                    // Step 6: Process results
                    while (resultSet.next()) {
                        // Retrieve data from the result set
                        // Example: String name = resultSet.getString("column_name");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    // Step 7: Close connections and resources
                    try {
                        if (resultSet != null) resultSet.close();
                        if (statement != null) statement.close();
                        if (connection != null) connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
}

