import java.util.Scanner;
public class Greater {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int A = sc.nextInt();
        System.out.print("Enter Second number: ");
        int B = sc.nextInt();
        System.out.print("Enter Third number: ");
        int C = sc.nextInt();

        if (A > B && A > C){
            System.out.println("The Greatest number is " + A);
        }
        else if (B > A && B > C){
             System.out.println("The Greatest number is " + B);
        }
        else{
             System.out.println("The Greatest number is " + C);
        }

        sc.close();
    }
}
