import java.util.Scanner;

class main1{
public static void main(String []args){
    
    //single comments
    /*multiline 
    comments*/

    int a=10;
    double b=10.578392738449;
    char c='a';
    String d="Hello";
    boolean e=true;

    Scanner s = new Scanner(System.in);
        for(int i=1;i<=1;i++){
            System.out.println("Enter number");
            a=s.nextInt();
            b=s.nextDouble();
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
        }
s.close();
}
}