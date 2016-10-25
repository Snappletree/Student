

import java.util.Scanner;

public class StudentApp

{
    public static void main(String [] agrs){
        Student newStudent = new Student(); 
        String name;
        int test1;
        int test2;
        int test3;

        double average;
        double add;

        
        
        
       
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello what is the name of the student?");
        name  = reader.nextLine();
        
        System.out.println("Hello user what is the first test score?");

        test1 = reader.nextInt();

        System.out.println("Hello user what is the second test score?");

        test2 = reader.nextInt();
        System.out.println("Hello user what is the third test score?");

        test3 = reader.nextInt();

        add = test1 + test2 + test3;
        average = add / 3;

        System.out.println("The students " + name +  " average is " + average);

  
    }   
}

