package ro.sit.homework;

public class Sum {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int sum = 0;

        for(int index = start; index <= end; ++index)
        {
            sum += index;
        }

        System.out.println("Sum = " + sum);
    }
}