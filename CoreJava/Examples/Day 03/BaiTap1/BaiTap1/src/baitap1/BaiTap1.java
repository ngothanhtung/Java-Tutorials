/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author softech
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HELLO WORLD");
        
        NhanVat nv1 = new NhanVat();
        nv1.Ten = "Ly Tieu Long";
        nv1.Mau = 100;
        nv1.Luc = 100;
        nv1.HienThi();
        
        
        
        NhanVat nv2 = new NhanVat();
        nv2.Ten = "Ly Lien Kiet";
        nv2.Mau = 100;
        nv2.Luc = 80;
        nv2.HienThi();
    }
    
}
