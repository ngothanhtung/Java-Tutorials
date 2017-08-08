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
        
        Customer c = new Customer();
        c.setId("tungnt");
        c.setFirtsName("Ngo");
        c.setLastName("Tung");
        c.setPhoneNumber("0905157803");
        c.setEmail("tungnt@softech.vn");
        c.setAddress("Danang");
        c.setBirthday("1908-04-10");
        c.setGender("MAN");
        c.insert();
        
        Customer.displayAll();
    }
    
}
