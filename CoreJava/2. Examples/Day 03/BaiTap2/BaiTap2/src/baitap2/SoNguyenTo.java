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
public class SoNguyenTo {
    public int Value;
    
    public void KiemTra() {
        int n = Value;
        int count = 0;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }
        
        if (count == 1) {
            System.out.println(Value + " khong phai la so nguyen to");
        } else {
            System.out.println(Value + " la so nguyen to");
        }
    }
}
