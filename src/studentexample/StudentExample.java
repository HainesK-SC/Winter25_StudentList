/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentexample;

/**
 *
 * @author thepr
 */
public class StudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Store 3 student details in an array
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setSid(1);
        
        Student s2 = new Student();
        s2.setName("John");
        s2.setSid(2);
        
        Student s3 = new Student();
        s3.setName("Paul");
        s3.setSid(3);
        
        Student stuArray[] = new Student[3];
        
        stuArray[0] = s1;
        stuArray[1] = s2;
        stuArray[2] = s3;
        
        for(int i = 0; i < stuArray.length; i++){
            System.out.println("Name: " + stuArray[i].getName() + "\t" + "Student ID: "  + stuArray[i].getSid());
        }
    }
    
}
