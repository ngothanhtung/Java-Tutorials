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
public class JavaBaiTap1 {
    enum Mua {
        Xuan, Ha, Thu, Dong
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("HELLO WORLD");
        
        Student s1 = new Student();
        s1.Name = "NGO THANH TUNG";
        s1.Age = 36;
        s1.Mark1 = 10;
        s1.Mark2 = 9;
        s1.Mark3 = 6;     
        s1.display();
        
        Student s2 = new Student();
        s2.Name = "NGUYEN THANH TUAN";
        s2.Age = 30;
        s2.Mark1 = 9;
        s2.Mark2 = 9;
        s2.Mark3 = 8;
        s2.display();
        
        // Lưu ý kiểu dữ liệu tham chiếu: Reference DataType
        Student s3;
        s3 = s2;
        
        s2.Name = "NGUYEN THI BICH";
        s3.display();
        
    }
    
}
