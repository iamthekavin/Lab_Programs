public class Exponent {
    
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Please Enter 2 number");
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double result = Math.pow(x, y);
        long roundedResult = Math.round(result);

        System.out.println("Result = " + roundedResult);
    }
}
