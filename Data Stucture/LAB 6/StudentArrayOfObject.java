import java.util.Scanner;

public class StudentArrayOfObject {
    public static void main(String[] args) {
        Student_Details[] S1;
        
        S1= new Student_Details[5];

        S1[0] = new Student_Details("23010101089", "neel" , 3, 8.0f);
        S1[1] = new Student_Details("23010101058", "Jineesh" , 3, 8.0f);
        S1[2] = new Student_Details("23010101283", "Jigar" , 3, 8.0f);
        S1[3] = new Student_Details("23010101273", "Prasham" , 3, 8.0f);
        S1[4] = new Student_Details("23010101249", "Pram" , 3, 8.0f);
        for(int i=0 ; i<5 ; i++){
            S1[i].printStudent();
        }
        
    }
}
class Student_Details{
    String Enrollment_No;
    String Name;
    int Semester;
    Float cpi;

    // public void scanStudent(){
    //     Scanner sc  = new Scanner(System.in);
    //     System.out.print("Enter Student Enrollnment_No: ");
    //     Enrollment_No = sc.next();
    //     System.out.print("Enter Student Name: ");
    //     Name = sc.next();
    //     System.out.print("Enter Student Semester: ");
    //     Semester = sc.nextInt();
    //     System.out.print("Enter Student CPI: ");
    //     cpi = sc.nextFloat();
    // }

    Student_Details(String Enrollment_No , String Name , int Semester, Float cpi){
        this.Enrollment_No = Enrollment_No;
        this.Name= Name;
        this.Semester = Semester;
        this.cpi = cpi;
    }

    public void printStudent(){
        System.out.println("Student Enrollnment_No: "+Enrollment_No);
        
        System.out.println("Student Name: "+Name);
    
        System.out.println("Student Semester: "+Semester);
        
        System.out.println("Student CPI: "+cpi);
    }
}
