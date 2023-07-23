import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month(1-12)");
        int month = sc.nextInt();
        int temp = 0;
        System.out.println("Enter year");
        int year = sc.nextInt();
        String m[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December" };
        int a[] = { 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3 };
        boolean isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? true : false;

        int day, days;
        day = 1;
        days = 28 + a[month - 1] + (isLeap && month == 2 ? 1 : 0);
        int x = (day + ((13 * (month + 1)) / 5) + year + (year / 4) - (year / 100) + (year / 400)) % 7;
        System.out.print(m[month - 1]);
        System.out.println(" " + year);
        System.out.println("Sat Sun Mon Tue wed Thu Fri ");
        for (int i = 0; i < 40; i++) {
            if (i >= x) {
                temp++;
                System.out.printf("%3d ", temp);
            } else
                System.out.printf("%3c ", 32);
            if (temp == days)
                break;
            if (i == 6 || i == 13 || i == 20 || i == 27 || i == 34)
                System.out.println();
        }
}
}
