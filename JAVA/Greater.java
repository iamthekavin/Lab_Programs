public class Greater {
    public static void main(String[] a){
        int A = 10;
        int B = 20;
        int C = 30;

        if (A > B && A > C){
            System.out.println("The Greatest number is " + A);
        }
        else if (B > A && B > C){
             System.out.println("The Greatest number is " + B);
        }
        else{
             System.out.println("The Greatest number is " + C);
        }
    }
}
