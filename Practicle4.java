import java.util.Arrays;
import java.util.Scanner;

public class Practicle4 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        char[] Character ={ 'a', 'b', 'c', 'd', 'e', 'f',
      'g', 'h', 'i', 'j', 'k', 'l',
      'm', 'n', 'o', 'p', 'q', 'r',
      's', 't', 'u', 'v', 'w', 'x',
      'y', 'z' };
      String[] Morse = { ".-",   "-...", "-.-.", "-..",  ".",
      "..-.", "--.",  "....", "..",   ".---",
      "-.-",  ".-..", "--",   "-.",   "---",
      ".--.", "--.-", ".-.",  "...",  "-",
      "..-",  "...-", ".--",  "-..-", "-.--",
      "--..", };
      
      System.out.println("Enter 1 for string to morse code");
      System.out.println("Enter 2 for morse to string code");
      System.out.println("Enter 3 For Exit");
      System.out.print("Enter Number: ");
      int c=scanner.nextInt();
      switch(c)
      {
        case 1: 
        scanner.nextLine();
        System.out.print("Enter the string : ");
             String str1 = scanner.nextLine();    
      for(int i=0;i<str1.length();i++)
      { 
        for(int j=0;j<26;j++)
        {
            if(str1.charAt(i)==Character[j])
            {
                   System.out.print(Morse[j]);
            }
        }
      }
      break;
                     case 2:
                     scanner.nextLine();
      System.out.print("Enter the Morse : ");
      String morse = scanner.nextLine();
      String mor[]= morse.split(" ",100);
      for(int i=0;i<mor.length;i++)
      {
         for(int j=0;j<26;j++)
         {
          if(mor[i].equals(Morse[j]))
          {
            System.out.print(Character[j] + " ");
          }
         
      }}
      break;
      case 3:
      System.out.println("Thank You for using Morse Code Converter");
      break;
      }
    }
}

