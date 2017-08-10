/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctutorials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MyPC
 */
public class Customer {

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(String _id) {
        this._id = _id;
    }

    /**
     * @return the _firtsName
     */
    public String getFirtsName() {
        return _firtsName;
    }

    /**
     * @param _firtsName the _firtsName to set
     */
    public void setFirtsName(String _firtsName) {
        this._firtsName = _firtsName;
    }

    /**
     * @return the _lastName
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * @param _lastName the _lastName to set
     */
    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    /**
     * @return the _phoneNumber
     */
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    /**
     * @param _phoneNumber the _phoneNumber to set
     */
    public void setPhoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    /**
     * @return the _address
     */
    public String getAddress() {
        return _address;
    }

    /**
     * @param _address the _address to set
     */
    public void setAddress(String _address) {
        this._address = _address;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }

    /**
     * @return the _birthday
     */
    public String getBirthday() {
        return _birthday;
    }

    /**
     * @param _birthday the _birthday to set
     */
    public void setBirthday(String _birthday) {
        this._birthday = _birthday;
    }

    /**
     * @return the _gender
     */
    public String getGender() {
        return _gender;
    }

    /**
     * @param _gender the _gender to set
     */
    public void setGender(String _gender) {
        this._gender = _gender;
    }
    private String _id;
    private String _firtsName;
    private String _lastName;
    private String _phoneNumber;
    private String _address;
    private String _email;
    private String _birthday;
    private String _gender;

    public void insert() throws SQLException {
        try {
            // Load the SQLServerDriver class, build the 
            // connection string, and get a connection 

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://198.71.226.6;database=aptech_onlineshop;user=aptech;password=123456789";

            // Create and execute an SQL statement that returns some data.
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                // Create and execute an SQL statement that returns some data.
                String SQL = "INSERT INTO Customers (Id, FirstName, LastName, PhoneNumber, Address, Email, Birthday, Gender) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(SQL);

                stmt.setString(1, this._id);
                stmt.setString(2, this._firtsName);
                stmt.setString(3, this._lastName);
                stmt.setString(4, this._phoneNumber);
                stmt.setString(5, this._address);
                stmt.setString(6, this._email);
                stmt.setString(7, this._birthday);
                stmt.setString(8, this._gender);

                int executeUpdate = stmt.executeUpdate();
                System.out.println("Success Trace: " + executeUpdate);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void delete(String id) {
        try {
            // Load the SQLServerDriver class, build the 
            // connection string, and get a connection 

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://198.71.226.6;database=aptech_onlineshop;user=aptech;password=123456789";

            // Create and execute an SQL statement that returns some data.
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                // Create and execute an SQL statement that returns some data.
                String SQL = "DELETE FROM Customers WHERE Id = ?";
                PreparedStatement stmt = con.prepareStatement(SQL);
                stmt.setString(1, id);
                int executeUpdate = stmt.executeUpdate();
                System.out.println("Success Trace: " + executeUpdate);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void displayAll() {
        try {
            // Load the SQLServerDriver class, build the 
            // connection string, and get a connection 

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://198.71.226.6;database=aptech_onlineshop;user=aptech;password=123456789";

            // Create and execute an SQL statement that returns some data.
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                // Create and execute an SQL statement that returns some data.
                String SQL = "SELECT * FROM Customers";
                Statement stmt = con.createStatement();
                // Iterate through the data in the result set and display it.
                try (ResultSet rs = stmt.executeQuery(SQL)) {
                    // Iterate through the data in the result set and display it.
                    System.out.format("%-20s | %-20s | %-20s | %-12s | %-30s | %-20s | %-20s", "Id", "FirstName", "LastName", "PhoneNumber", "Email", "Address", "Birthday");
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                    while (rs.next()) {
                        System.out.format("%-20s | %-20s | %-20s | %-12s | %-30s | %-20s | %-20s",
                                rs.getString("Id"),
                                rs.getString("FirstName"),
                                rs.getString("LastName"),
                                rs.getString("PhoneNumber"),
                                rs.getString("Email"),
                                rs.getString("Address"),
                                rs.getString("Birthday"));
                        System.out.println();
                    }
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void display() {
         System.out.format("%-20s | %-20s | %-20s | %-12s | %-30s | %-20s | %-20s | %s", "Id", "FirstName", "LastName", "PhoneNumber", "Email", "Address", "Birthday", "Gender");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-20s | %-20s | %-20s | %-12s | %-30s | %-20s | %-20s | %s",
            this._id,
            this._firtsName,
            this._lastName,
            this._phoneNumber,
            this._email,
            this._address,
            this._birthday,
            this._gender);
        System.out.println();
    }
    
    public static Customer findById(String id) {
        try {
            // Load the SQLServerDriver class, build the 
            // connection string, and get a connection 

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://198.71.226.6;database=aptech_onlineshop;user=aptech;password=123456789";

            // Create and execute an SQL statement that returns some data.
            try (Connection con = DriverManager.getConnection(connectionUrl)) {
                // Create and execute an SQL statement that returns some data.
                String SQL = "SELECT TOP 1 * FROM Customers WHERE Id = ?";
                PreparedStatement stmt = con.prepareStatement(SQL);
                stmt.setString(1, id);
                
                // Iterate through the data in the result set and display it.
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        Customer c = new Customer();
                        c._id = rs.getString("Id");
                        c._firtsName = rs.getString("FirstName");
                        c._lastName = rs.getString("LastName");
                        c._phoneNumber = rs.getString("PhoneNumber");
                        c._email = rs.getString("Email");
                        c._address = rs.getString("Address");
                        c._birthday = rs.getString("Birthday");
                        c._gender = rs.getString("Gender");
                    
                        return c;
                    }
                    else {
                        return null;
                    }
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Trace: " + e.getMessage());
            System.exit(0);
        }
        return null;
    }
}
