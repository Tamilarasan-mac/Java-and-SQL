package package_one;

import package_two.Teacher;

public class Student extends Teacher{               //Package_two - Teacher class extends to package_one - Student class
    public static void main(String[] args) {
        Student s1 = new Student();                 //Object created for Student class
        System.out.println(s1.salary);              //s1 is Student class object and salary is teacher class variable
    }
}
