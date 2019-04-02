/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap7inheritance;

/**
 *
 * @author softech
 */
public class BaiTap7Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.Name = "John";
        s.Age = 20;
        s.Mark = 9;
        s.display();

        Teacher t = new Teacher();
        t.Name = "Peter";
        t.Age = 40;
        t.Skill = "JAVA";
        t.display();
    }

}
