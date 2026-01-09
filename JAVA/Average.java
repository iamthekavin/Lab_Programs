public class Average {
    public static void main(String[] args){
        int Sum = 0;

        if(args.length !=5 ){
            System.out.println("Please Enter 5 number");
        }
        for(int i=0;i<5;i++){
            Sum = Sum + Integer.parseInt(args[i]);
        }

        double avg = Sum/5.0;
        System.out.println("Sum = " + Sum);
        System.out.println("Average = " + avg);

    }
}
