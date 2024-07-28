package com.wislam.example;

import com.wislam.example.classes.GFG;
import com.wislam.example.classes.Student;
import com.wislam.example.objects.Dog;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings({ "deprecation", "rawtypes" })
    public static void main( String[] args )
    {
        // Section class
        // tạo một object Student
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);

        // GFG 1
         // Khối Try để_kiểm_tra exceptions (các_ngoại_lệ)
         try {
            Class cls = Class.forName("com.wislam.example.classes.GFG");
            // Tạo object có main class sử_dụng instance method
            GFG obj = (GFG)cls.newInstance();
            // In và hiển_thị
            System.out.println(obj.name);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        // GFG 2
        GFG obj1 = new GFG();
        // Khối Try kiểm_tra exceptions
        try {
            GFG obj2 = (GFG)obj1.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // End section class

        // Section object
        Dog tuffy
            = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
        // End section 


        System.out.println( "Hello World!" );
    }
}
