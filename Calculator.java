import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number: ");
        a=scanner.nextInt();
        System.out.print("Enter Second Number: ");
        b=scanner.nextInt();
        char operation;
        System.out.print("Enter Operation you need to perform: ");
        operation = scanner.next().charAt(0);
        switch (operation)
         {
            case '+':
                System.out.print(a+b);
                break;
                case '-':
                System.out.print(a-b);
                break;
                case '/':
                System.out.print(a/b);
                break;
                case '*':
                System.out.print(a*b);
                break;
        }
        scanner.close();
    }
}
