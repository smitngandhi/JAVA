import java.util.Scanner;
public class palindromedhruvil {
    public static void main(String[] args) {
        int flag=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The string: ");
        String s= scanner.nextLine();
        char r[] = new char[100];
        for(int i=0;i<s.length();i++)
        {
            r[i]=s.charAt(s.length()-i-1);

        }
        for(int i=0;i<s.length();i++)
        {
            if(r[i]!=s.charAt(i))
            {
                 flag=1;
                 break;
            }
        }
        if(flag==0)
        System.out.print("Given is not Palindrome");
        else 
        System.out.print("Given is not Plaindrome");

        scanner.close();
        
    }
}
