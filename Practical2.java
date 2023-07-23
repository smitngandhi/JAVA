import java.util.Scanner;
public class Practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Mobile number: ");
        String number = scanner.nextLine();
        String split[] = number.split("-",4);
        System.out.print("Mobile System operator Code is: " + split[1]);
        System.out.println();
        System.out.print("MSC is: " + split[2]);
        System.out.println();
        System.out.print("Unique Code is: " + split[3]);
        System.out.println();
        scanner.close();
}
}
