import java.util.Scanner;

public class GOT {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter the number" + (i + 1));
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a > b && a > c) {
                System.out.printf("Greatest number is %d%n", a);
            } else if (b > a && b > c) {
                System.out.printf("Greatest number is %d%n", b);
            } else {
                System.out.printf("Greatest number is %d%n", c);
            }
        }

        sc.close();
    }
}
