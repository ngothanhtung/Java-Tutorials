/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author softech
 */
public class SinhVien {
    public String Ten;
    public int Toan;
    public int Ly;
    public int Hoa;
    
    public SinhVien() {
        Toan = 0;
        Ly = 0;
        Hoa = 0;
    }
    
    public void HienThi() {
        System.out.println("Ten: " + Ten);
        System.out.println("Diem Toan: " + Toan);
        System.out.println("Diem Ly: " + Ly);
        System.out.println("Diem Hoa: " + Hoa);
        
        float dtb = (Toan + Ly + Hoa) / 3;
        
        System.out.println("Diem TB: " + dtb);
        if (dtb >= 6) {
            System.out.println("Ket qua: Dat");  
        } else {
            System.out.println("Ket qua: Hong");  
        }
        
    }
}
