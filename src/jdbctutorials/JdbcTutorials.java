/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctutorials;

import java.sql.*;
import java.util.List;


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

        CustomerFrame f = new CustomerFrame();
        f.setVisible(true);
        
        /*
        Customer c = CustomerRepository.findById("tomhank");
        if (c != null) { 
            c.setPhoneNumber("090654321");
            CustomerRepository.updateCustomer(c);
            c.display();
        }
        else {
            System.out.println("Not found");
        }

        CustomerRepository.displayAll();

        
        List<Customer> customers = CustomerRepository.getCustomers();
        customers.forEach((customer) -> {
            if (customer != null) {
                customer.display();
            }
        });
        */
    }
}
