import java.util.*;
import java.util.Arrays;

public class Praactical5 {
    public static String SortString(String user) {
        char temparray[] = user.toCharArray();
        Arrays.sort(temparray);
        return new String(temparray);
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String input = scanner.nextLine();
        String x = "";
        String Anagram = x;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(random.nextInt(input.length()));

            for (int j = 0; j < Anagram.length(); j++) {
                while (c == Anagram.charAt(j)) {
                    c = input.charAt(random.nextInt(input.length()));
                    j=0;
                }
            }
            Anagram = Anagram + c;
        }
        System.out.print("The Anagram String is: " + Anagram);
        System.out.println();
        System.out.print("Enter User String: ");
        String user = scanner.nextLine();
        String user_sorted = SortString(user);
        String input_sorted = SortString(input);
        if (user_sorted.equals(input_sorted)) {
            System.out.println("Well Done!");
        } else {
            System.out.println("Wrong,it is not an Anagram." + "The Original String is: " + input);
        }
    }
}
