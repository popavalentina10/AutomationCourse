package ro.sit.homework;

public class NumberPrime {

    public static void main(String[] args) {
        int start = 2;
        int end = 1000000;

        for (int number = start; number<= end; ++number) {
            int isPrime=1;
            for (int j=2; j<=number/2; ++j){
                if (number%j==0){
                    isPrime=0;
                    break;
                }
            }
            if (isPrime==1){
                System.out.println("Number " + number + " is prime");
            }
        }
    }
}
