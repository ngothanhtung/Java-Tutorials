/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileexample;
import java.util.Scanner;

/**
 *
 * @author softech
 */
public class DoWhileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Khai báo lớp Scanner để nhập liệu từ bàn phím
        Scanner input = new Scanner(System.in);
        int n;
        
       
        do {
            n = input.nextInt();
        } while(n < 0);
        
        /* KHỬ DO..WHILE bằng WHILE
        while(true) {
            n = input.nextInt();
            if (n > 0) break;
        }
        */
        
        System.out.println("Integer n = " + n);
    }
    
}
