import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int number;
        int flag=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you number: ");
        number = scanner.nextInt();
        if(number==0|| number==1)
        System.out.print("Entered number is neither Prime nor composite\n");
       else
       {
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            flag=1;
        }
        if(flag==0)
        System.out.print("Entered number is Prime");
        else if(flag==1)
        System.out.print("Entered Number is not prime");
    }
        
        scanner.close();

    }
}
