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
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * for(int i = 0; i <= 100; i++) { if (i % 5 == 0) { System.out.println(i); }
         * 
         * if (i % 3 == 0) { System.out.println(i); } }
         */

        for (int i = 0; i <= 100; i++) {
            MyNumber n = new MyNumber();
            n.Value = i;
            n.KiemTra3();
            n.KiemTra5();
        }

        for (int i = 1000; i <= 2000; i++) {
            SoNguyenTo n = new SoNguyenTo();
            n.Value = i;
            n.KiemTra();
        }
    }

}
