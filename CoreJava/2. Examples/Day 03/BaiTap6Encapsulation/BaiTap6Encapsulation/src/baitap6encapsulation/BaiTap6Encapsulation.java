/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap6encapsulation;

/**
 *
 * @author softech
 */
public class BaiTap6Encapsulation {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        SinhVien sv = new SinhVien();
        sv.setDiem(20);
        float d = sv.getDiem();
        // sv.Diem = 20;
        
        sv.hienThi();
        
    }
    
}
