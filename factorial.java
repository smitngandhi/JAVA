import java.util.Scanner;

public class factorial {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,factorial;
        System.out.print("Enter Number: ");
        number = scanner.nextInt();
        factorial = 1;
        for(int i=2;i<=number;i++)
        {
               factorial = factorial * i;
             

        }
        System.out.print("The Factorial of Entered Number is: " +  factorial);

    }
}
