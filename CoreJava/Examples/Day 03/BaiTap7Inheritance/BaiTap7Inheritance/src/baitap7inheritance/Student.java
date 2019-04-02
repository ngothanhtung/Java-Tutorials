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
public class Student extends Person {
    public float Mark;
    
    @Override
    public void display() {
        super.display();
        System.out.println("Mark: " + Mark);
    }
    
}
