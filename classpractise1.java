class calculate {
    int height, length, breadth;

    calculate() {
        System.out.print("Default Constructor is called" + "\n");
    }

    calculate(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    int c_s_a(int height, int lenght, int breadth) {
        int ans = 2 * height * (length + breadth);
        System.out.print("The Curved Surface area is: " + ans * 100 * 100 + "cm" + "\n");
        return ans;
    }

    int t_s_a(int height, int length, int breadth) {
        int ans = 6 * length * length;
        System.out.print("The Total Surface area is: " + ans * 100 * 100 + "cm" + "\n");
        return ans;
    }

    int volume(int height, int breadth, int length) {
        int ans = length * height * breadth;
        System.out.print("The volume is: " + ans * 100 * 100 * 100 + "cm" + "\n");
        return ans;
    }
}

public class classpractise1 {
    public static void main(String[] args) {
        calculate c = new calculate();
        int C_S_A, T_S_A, V, l, b, h;
        c.height = 2;
        c.length = 3;
        c.breadth = 4;
        l = c.length;
        b = c.breadth;
        h = c.height;
        C_S_A = c.c_s_a(h, l, b);
        T_S_A = c.t_s_a(h, l, b);
        V = c.volume(h, b, l);
    }
}
