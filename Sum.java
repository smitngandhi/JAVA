import java.util.Scanner;
public class Sum
{
public static void main(String[] args)
{
int A,B,C;
Scanner a= new Scanner(System.in);

System.out.print("Enter the First number: ");
A=a.nextInt();
System.out.print("Enter the Second number: ");
B=a.nextInt();
C=A+B;
System.out.println("The Addition of Numbers is: " + C);
}
}