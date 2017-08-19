package jdbctutorials;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    public static Customer findById(String id) throws SQLException {
        try {
            // Load the SQLServerDriver class, build the connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = Global.ConnectionString;
            
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                String SQL = "SELECT TOP 1 * FROM Customers WHERE Id = ?";
                PreparedStatement stmt = con.prepareStatement(SQL);
                stmt.setString(1, id);

                // Iterate through the data in the result set and display it.
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        Customer c = new Customer();
                        c.setId(rs.getString("Id"));
                        c.setFirstName(rs.getString("FirstName"));
                        c.setLastName(rs.getString("LastName"));
                        c.setPhoneNumber(rs.getString("PhoneNumber"));
                        c.setEmail(rs.getString("Email"));
                        c.setAddress(rs.getString("Address"));
                        c.setBirthday(rs.getDate("Birthday"));
                        c.setGender(rs.getString("Gender"));
                        return c;
                    } else {
                        return null;
                    }
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
        }
        return null;
    }

    public static List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        try {
            // Load the SQLServerDriver class, build the connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = Global.ConnectionString;

            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                String SQL = "SELECT * FROM Customers";
                Statement stmt = con.createStatement();
                // Iterate through the data in the result set and display it.
                try (ResultSet rs = stmt.executeQuery(SQL)) {
                    while (rs.next()) {
                        Customer c = new Customer();
                        c.setId(rs.getString("Id"));
                        c.setFirstName(rs.getString("FirstName"));
                        c.setLastName(rs.getString("LastName"));
                        c.setPhoneNumber(rs.getString("PhoneNumber"));
                        c.setEmail(rs.getString("Email"));
                        c.setAddress(rs.getString("Address"));
                        c.setBirthday(rs.getDate("Birthday"));
                        c.setGender(rs.getString("Gender"));
                        list.add(c);
                    }
                    return list;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
        }
        return list;
    }

    public static void updateCustomer(Customer customer) throws SQLException {
        try {
            // Load the SQLServerDriver class, build the connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = Global.ConnectionString;
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                String SQL = "UPDATE Customers SET FirstName = ?, LastName = ?, PhoneNumber = ?, Email = ?, Address = ?, Birthday = ?, Gender = ? WHERE Id = ?";
                PreparedStatement stmt = con.prepareStatement(SQL);
                stmt.setString(1, customer.getFirstName());
                stmt.setString(2, customer.getLastName());
                stmt.setString(3, customer.getPhoneNumber());
                stmt.setString(4, customer.getAddress());
                stmt.setString(5, customer.getEmail());
                stmt.setDate(6, new java.sql.Date(customer.getBirthday().getDate()));
                stmt.setString(7, customer.getGender());
                stmt.setString(8, customer.getId());
                int executeUpdate = stmt.executeUpdate();
                System.out.println("Success Trace: " + executeUpdate);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
        }
    }

    public static void addCustomer(Customer customer) throws SQLException {
        try {
            // Load the SQLServerDriver class, build the connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = Global.ConnectionString;
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                String SQL = "INSERT INTO Customers (Id, FirstName, LastName, PhoneNumber, Address, Email, Birthday, Gender) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(SQL);

                stmt.setString(1, customer.getId());
                stmt.setString(2, customer.getFirstName());
                stmt.setString(3, customer.getLastName());
                stmt.setString(4, customer.getPhoneNumber());
                stmt.setString(5, customer.getAddress());
                stmt.setString(6, customer.getEmail());
                stmt.setDate(7, new java.sql.Date(customer.getBirthday().getDate()));
                stmt.setString(8, customer.getGender());

                int executeUpdate = stmt.executeUpdate();
                System.out.println("Success Trace: " + executeUpdate);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
        }
    }

    public static void deleteCustomer(String id) throws SQLException {
        try {
            // Load the SQLServerDriver class, build the connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = Global.ConnectionString;
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                String SQL = "DELETE FROM Customers WHERE Id = ?";
                PreparedStatement stmt = con.prepareStatement(SQL);
                stmt.setString(1, id);

                int executeUpdate = stmt.executeUpdate();
                System.out.println("Success Trace: " + executeUpdate);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
        }
    }

    public static void displayAll() {
        try {
            // Load the SQLServerDriver class, build the connection string, and get a connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = Global.ConnectionString;
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                String SQL = "SELECT * FROM Customers";
                Statement stmt = con.createStatement();
                try (ResultSet rs = stmt.executeQuery(SQL)) {
                    System.out.println("CUSTOMER LIST:");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.format("%-20s | %-20s | %-20s | %-12s | %-30s | %-30s | %-20s | %s", "Id", "FirstName", "LastName", "PhoneNumber", "Email", "Address", "Birthday", "Gender");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    while (rs.next()) {
                        System.out.format("%-20s | %-20s | %-20s | %-12s | %-30s | %-30s | %-20s | %s",
                                rs.getString("Id"),
                                rs.getString("FirstName"),
                                rs.getString("LastName"),
                                rs.getString("PhoneNumber"),
                                rs.getString("Email"),
                                rs.getString("Address"),
                                rs.getDate("Birthday"),
                                rs.getString("Gender"));
                        System.out.println();
                    }
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
            System.exit(0);
        }
    }
}
