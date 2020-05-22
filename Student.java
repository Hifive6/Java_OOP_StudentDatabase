import java.util.Scanner;

public class Student {
    private String firstName, lastName, studentId;   
    private String courses = null;
    private int classYear;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter a student last name: ");
        this.lastName = scan.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter a student class year: ");
        this.classYear= scan.nextInt();
        
        setStudentID();

        System.out.println(firstName + " "+lastName + " "+classYear + " " + studentId);
    }

    //Generate an ID
    private void setStudentID(){
        //Grade level plus static id
        id++;
        this.studentId = classYear + "" + id;
    }

    //enroll in course
    public void enroll(){
        //get inside of loop user hits 0 
        do{
        System.err.println("Enter to enroll (Q to quit): ");
        Scanner scan = new Scanner(System.in);
        String course = scan.nextLine();
        if(!course.equalsIgnoreCase("Q")){
            courses = courses + "\n" + course; 
            tuitionBalance = costOfCourse + tuitionBalance;
        } else {
           break; 
        }  
    }while(1 != 0);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: $" + tuitionBalance);
    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(int payment){
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }

}