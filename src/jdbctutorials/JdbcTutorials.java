/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctutorials;

import java.sql.*;


/**
 *
 * @author MyPC
 */
public class JdbcTutorials {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Customer c = Customer.findById("tomhank");
        if (c != null) { 
            c.display();
        }
        else {
            System.out.println("Not found");
        }
        //Customer.displayAll();
    }
    
}
