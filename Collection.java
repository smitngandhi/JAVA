import java.util.Scanner;
public class Collection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Subject-code: ");
        String sub_code = scanner.nextLine();
        System.out.print("Enter Subject-name: ");
        String sub_name = scanner.nextLine();
        int marks[] = new int[30];
        int total = 10, absent = 0, appeared, total_marks = 0, average, b_average = 0, a_average = 0, c_average = 0;
        boolean ab;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Does Student[" + i + "] is absent(true/false): ");
            ab=scanner.nextBoolean();
            if(ab==false)
            {
            System.out.print("Enter marks for student[" + i + "]: ");
            marks[i] = scanner.nextInt();
            total_marks = total_marks + marks[i];
            }
            else if(ab==true)
            {
            absent++;
            continue;  
        }
    }
        System.out.println("-----DETAILS-----\n");
        System.out.print("Subject-Code: " + sub_code + "\n");
        System.out.print("Subject-name: " + sub_name + "\n");
        System.out.print("Total number of Students are: " + total + "\n");
        System.out.print("Total  number of Students who are absent: " + absent + "\n");
        appeared = total - absent;
        System.out.print("Total number of student appeared for the exams are: " + appeared + "\n");
        average = total_marks / appeared;
        System.out.print("Class Average is: " + average + "\n");
        for (int i = 1; i < appeared + 1; i++)
         {
            if (marks[i] < average)
                ++b_average;
            else if (marks[i] > average)
                ++a_average;
            else if (marks[i] == average)
                ++c_average;
        }
        System.out.print("Total Students below Average Marks are: " + b_average + "\n");
        System.out.print("Total Students with Average Marks are: " + c_average + "\n");
        System.out.print("Total Students Above Average Marks are: " + a_average + "\n");
        scanner.close();
    }
}