/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author softech
 */
public class BaiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mua = 5;
        
        switch(mua) {
            case 1:
            case 2:
            case 3:
                System.out.println("MUA XUAN");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("MUA HA");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("MUA THU");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("MUA DONG");
                break;
            default: 
                System.out.println("KHONG XAC DINH");
                break;
        }
        
        if (mua >= 1 && mua <= 3) {
            System.out.println("MUA XUAN");
        } else if (mua >= 4 && mua <= 6) {
            System.out.println("MUA HA");
        } else if (mua >= 7 && mua <= 9) {
            System.out.println("MUA HA");
        } else if (mua >= 10 && mua <= 12) {
            System.out.println("MUA HA");
        } else {
            System.out.println("KHONG XAC DINH");
        }
    }
    
}
