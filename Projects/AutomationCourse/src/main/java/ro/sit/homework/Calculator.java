package ro.sit.homework;

public class Calculator {
    public static void main(String[] args){
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            float result=0;
            switch (operator){
                case "+":
                    result=a+b;
                    break;
                case "-":
                    result=a-b;
                    break;
                case "*":
                    result=a*b;
                    break;
                case"/":
                    result=a/b;
                    break;
                default:
                    result=0;
            }
           System.out.println("Result is: " + result);
        } else {
            System.err.println("3 args are needed!");
        }
    }
}
