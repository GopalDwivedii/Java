import java.util.Scanner;
public class Cuberoot {
    public static void main(String[] args) {
        int i=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(i=1;i<=n;i++){
            System.out.println("Cube root is "+i*i*i);
        }
    s.close();   
    }
}
