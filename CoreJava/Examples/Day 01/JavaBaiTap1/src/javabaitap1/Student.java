/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabaitap1;

/**
 *
 * @author softech
 */
public class Student {
    public String Name;
    public int Age;
    public float Mark1;
    public float Mark2;
    public float Mark3;
    
    public void display() {
        System.out.println("Ho va ten: " + Name);
        System.out.println("Tuoi: " + Age);
        System.out.println("Diem mon 1: " + Mark1);
        System.out.println("Diem mon 2: " + Mark2);
        System.out.println("Diem mon 3: " + Mark3);
        
        float averageMark = (Mark1 + Mark2 + Mark3) / 3;
        
        if (averageMark >= 9) {
            System.out.println("Xep loai: Xuat sac");
        } else if (averageMark >= 8) {
            System.out.println("Xep loai: Gioi");
        } else if (averageMark >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else if (averageMark >= 5) {
            System.out.println("Xep loai: Trung Binh");
        } else {
            System.out.println("Xep loai: Yeu, Kem");
        }
    }
    
}
