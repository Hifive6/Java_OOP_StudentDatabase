import java.util.Scanner;

public class StudentDatabaseApp{
    public static void main(String[] args) {
        
        //Ask how many new students we aten to add
        System.out.println("Enter number of Student to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();
        Student[] students = new Student[numberOfStudents];

        //Create n numbers of new students
        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for(int n =0; n<numberOfStudents; n++){
            System.out.println(students[n].showInfo());
        }
        scan.close();
    }
}