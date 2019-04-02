/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap5;

import java.util.Scanner;

/**
 *
 * @author softech
 */
public class BaiTap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; count <= 100;) {
            if (i % 7 == 0) {
                count++;
                System.out.println(i);
            }

            i++;
        }

        int i = 1;
        while (count <= 100) {
            if (i % 7 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }

        /*
         * Scanner input = new Scanner(System.in); int n = 0; do {
         * System.out.print("Hay nhap n: "); n = input.nextInt(); } while(n < 0);
         */
        // OK;

        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Hay nhap n: ");
            n = input.nextInt();
            if (n >= 0) {
                break;
            }
        }
    }

}
