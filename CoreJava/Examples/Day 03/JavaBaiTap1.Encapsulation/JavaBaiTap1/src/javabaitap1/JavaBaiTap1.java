/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabaitap1;

import java.util.Set;

/**
 *
 * @author softech
 */
public class JavaBaiTap1 {
    enum Mua {
        Xuan, Ha, Thu, Dong
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("HELLO WORLD");
        Student s1 = new Student();
        s1.setName("NGO THANH TUNG");
        s1.setAge(36);
        s1.setMark1(10);
        s1.setMark2(9);
        s1.setMark3(0);     
        s1.display();
        
        Student s2 = new Student();
        s2.setName("NGUYEN THANH TUAN");
        s2.setAge(30);
        s2.setMark1(9);
        s2.setMark2(9);
        s2.setMark3(8);
        s2.display();
    }
    
}
