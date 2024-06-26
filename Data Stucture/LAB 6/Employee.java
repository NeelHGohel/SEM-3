import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Employee_Detail E1 = new Employee_Detail();
        E1.Employee_Detail();
        E1.print();
    }
}
class Employee_Detail{
    Scanner sc = new Scanner(System.in);
    // Employee_ID, Name, Designation, and Salary
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

    public void Employee_Detail(){
        System.out.println("Enter Employee_ID");
        Employee_ID = sc.nextInt();
        System.out.println("Enter Employee Name");
        Name = sc.next();
        System.out.println("Enter Employee Designation");
        Designation = sc.next();
        System.out.println("Enter Salary");
        Salary = sc.nextInt();
    }

    public void print(){
        System.out.println("Employee_ID "+Employee_ID);
        
        System.out.println("Employee Name "+Name);
    
        System.out.println("Employee Designation "+Designation);
        
        System.out.println("Salary "+Salary);
        
    }
}