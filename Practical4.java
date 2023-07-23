import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z' };
        String[] code = { ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.." };
        System.out.println("Enter 1 for String to Morse Code Conversion");
        System.out.println("Enter 2 for Morse code to String");
        System.out.println("Enter 3 for exit");
        System.out.print("Enter your Number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        switch (number) {

            case 1:
                System.out.print("Enter your String: ");
                String str = scanner.nextLine();
                for (int i = 0; i < str.length(); i++) {

                    for (int j = 0; j < 26; j++) {
                        if (str.charAt(i) == letter[j])

                        {
                            System.out.print(code[j] + " ");
                        }
                    }
                }
                break;
            case 2:
                System.out.print("Enter Your Morse Code: ");
                String morse = scanner.nextLine();
                String split[] = morse.split(" ", 100);
                for (int i = 0; i < split.length; i++) {
                    for (int j = 0; j < 26; j++) {
                        if (split[i].equals(code[j])) {
                            System.out.print(letter[j] + " ");
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Thank You For Using Morse Code Converter");
                break;
        }
    }
}