import java.util.Scanner;
public class Add {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        int Result = num1 + num2;
        System.out.println(Result);
    sc.close();
    }
}