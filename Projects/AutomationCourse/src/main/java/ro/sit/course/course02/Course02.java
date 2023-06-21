package course.course02;

public class Course02 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number;
        number = 5;
        int secondNumber = 2;
        System.out.println(number);
        System.out.println(secondNumber);
        final String FIRST_NAME = "Darth Vader";
        String name = "Sidius";
        System.out.println(number + FIRST_NAME + name + secondNumber);
        int suma = number + secondNumber;
        System.out.println(suma);
        suma = number + secondNumber;
        int produs = number * secondNumber;
        System.out.println("Suma este: " + suma);
        System.out.println("Produsul este: " + produs);
        System.out.println(number + "+" + secondNumber + "=" + suma);
        System.out.println(number + "*" + secondNumber + " = " + produs);
        boolean isNegative = number < 0;
        System.out.println(isNegative);
        char caracter = 'a';
        System.out.println("Caracterul este " + caracter);
        byte a = 127;
        byte b = 100;
        short suma2 = (short) (a + b);
        System.out.println(suma2);
        String numeComplet = FIRST_NAME + " " + name;
        System.out.println(numeComplet);
        int impartire = number / secondNumber;
        System.out.println("Rezultatul impartirii este: " + impartire);
        float impartire2 = (float) number / secondNumber;
        System.out.println("Rezultatul impartirii este: " + impartire2);
        int modul = number % secondNumber;
        System.out.println("Restul impartirii este: " + modul);
        modul = modul + 5;
        modul += 5;
        modul -= 3;
        modul *= 5;
        modul -= 1;
        //modul = modul * 5 - 1;
        modul = modul + 1;
        modul += 1;
        System.out.println("Inainte de operatii de incrementare/decrementare: " + modul);
//        modul++;
//        System.out.println("Post incrementare: " + modul++);
        System.out.println("Post incrementare: " + modul);
        modul = modul + 1;
        System.out.println(modul);
//        modul--;
        System.out.println("Post decrementare: " + modul--);
        System.out.println(modul);
//        ++modul;
        modul = modul + 1;
        System.out.println("Post incrementare: " + modul);
//        System.out.println("Pre incrementare: " + ++modul);
        System.out.println(modul);
//        --modul;
        System.out.println("Post decrementare: " + --modul);
        System.out.println(modul);
        boolean areEqual = number == secondNumber;
        boolean notEqual = number != secondNumber;
        System.out.println("The numbers are equal " + areEqual);
        System.out.println("The numbers are not equal " + notEqual);
        boolean areBothPositive = number >= 0 && secondNumber >= 0;
        System.out.println("Both numbers are positive " + areBothPositive);
        secondNumber = -2;
        areBothPositive = number >= 0 && secondNumber >= 0;
        System.out.println("Both numbers are positive " + areBothPositive);
        boolean eitherIsPositive = number >= 0 || secondNumber >= 0;
        System.out.println("Either number is positive " + eitherIsPositive);
        boolean reversedEitherIsPositive = !eitherIsPositive;
        System.out.println("Reversed Either number is positive " + reversedEitherIsPositive);
        boolean xorOperator = number >= 0 ^ secondNumber >= 0;
        System.out.println("XOR operator " + xorOperator);
        secondNumber = 3;
        xorOperator = number >= 0 ^ secondNumber >= 0;
        System.out.println("XOR operator " + xorOperator);
        System.out.println("First sequence");
        System.out.println("Second sequence");
        System.out.println("Third sequence");
        number = 0;
        boolean isNumberPositive = number > 0;
        boolean isNumberNegative = number < 0;
        if (isNumberPositive) {
            System.out.println("Numarul este strict mai mare decat 0");
        } else if (isNumberNegative) {
            System.out.println("Numarul este negativ");
        } else {
            System.out.println("Numarul este 0");
        }

        int a1 = 3;
        int b1 = 4;
        if (a1 > b1) {
            System.out.println("A is bigger");
        } else if (a1 < b1) {
            System.out.println("B is bigger");
        } else {
            System.out.println("They're equal");
        }

        //switch converted into if method
        //        String letter2 = "b";
//        if (letter2.equals("b")) {
//            System.out.println("beer");
//        } else if (letter2.equals("a")) {
//            System.out.println("beer");
//        } else if (letter2.equals("c")) {
//            System.out.println("cider");
//        } else {
//            System.out.println("We only learned A, B, C");
//        }

        String letter = "D";
        switch (letter) {
            case "A":
                System.out.println("apples");
                break;
            case "B":
                System.out.println("beer");
                break;
            case "C":
                System.out.println("cider");
                break;
            case "D":
                System.out.println("ding dong");
                break;
            default:
                System.out.println("We only learned A, B, C");
        }

        int x = 25;
//        x++ este acelasi lucru cu x = x+1
//        ++x este acelasi lucru cu x = x+1
        boolean xEsteMaiMicDecat5 = x < 25;
        while (xEsteMaiMicDecat5) {
//            System.out.println(++x);
//            x = x + 1;
//            System.out.println(x);
//            System.out.println(x++);
            System.out.println(x++);
//            x = x + 1;
        }

        int x1 = 0;
        do {
            System.out.println(x1);
            x1++;
        } while (x1 < 25);
        System.out.println();
        for (int i = 25; i > 0; i--) {
            if (i == 23) {
                continue;
            }
            System.out.println(i);
        }

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int sum = 0;
        for (int num : numbers) {
            if (num == 30) {
                continue;
            }
            sum += num;
            if (sum > 100) {
                break;
            }
            System.out.println(num);
        }
        System.out.println("sum: " + sum);
    }
}