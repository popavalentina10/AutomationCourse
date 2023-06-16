package ro.sit.homework;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the year");
        int year = keyboard.nextInt();
        if (year <1900 || year >2016){
            System.out.println("Year must be between 1900 and 2016");
        } else{
            if ((year % 4==0 && year % 100 !=0) || (year % 100==0 && year % 400==0) ){
                System.out.println("February has 29 days");
            } else{
                System.out.println("February has 28 days");
            }
        }
    }
}
