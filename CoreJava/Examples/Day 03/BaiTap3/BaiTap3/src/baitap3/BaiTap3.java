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
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SinhVien sv1 = new SinhVien();
        sv1.Ten = "NGUYEN VAN ANH";
        sv1.Toan = 9;
        sv1.Ly = 8;
        sv1.Hoa = 3;
        
        sv1.HienThi();
        
        
        SinhVien sv2 = new SinhVien();
        sv2.Ten = "NGUYEN THI HOA";
        /*
        sv2.Toan = 7;
        sv2.Ly = 4;
        sv2.Hoa = 2;
        */
        sv2.HienThi();
        
    }
    
}
