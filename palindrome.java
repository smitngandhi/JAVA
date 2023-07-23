import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        int total = number;
        int length = String.valueOf(number).length();
        int reverse=0,remainder,flag=0;
        for(int i=0;i<length;i++)
        {
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number=number/10;
        }
        System.out.print("The Palindrome number is: " + reverse + "\n");
        if(reverse==total)
        {
        flag=1;
        }
       if(flag==1)
       {
        System.out.print("Given number is Palindrome");
       }
       else if(flag==0)
       {
        System.out.print("Given number is not Palindrome");
       }
       scanner.close();
}
}
