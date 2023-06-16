package ro.sit.homework;

public class Calculator {
    public static void main(String[] args){
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            float result=0;

            if (operator.equals("+")){
               result=a+b;
            }
            if (operator.equals("-")){
                result=a-b;
            }
            if (operator.equals("*")){
                result=a*b;
            }
            if (operator.equals("/")){
                result=a/b;
            }
           System.out.println("Result is: " + result);
        } else {
            System.err.println("3 args are needed!");
        }
    }
}
