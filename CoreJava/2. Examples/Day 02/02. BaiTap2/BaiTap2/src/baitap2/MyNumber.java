/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author softech
 */
public class MyNumber {
    public int Value;
    
    public void KiemTra3() {
        if (Value % 3 == 0) {
            System.out.println(Value);
        }
    }
    
    public void KiemTra5() {
        if (Value % 5 == 0) {
            System.out.println(Value);
        }
    }
}
