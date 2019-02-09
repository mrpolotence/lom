
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите 1 число ");
        Scanner b = new Scanner(System.in);
        int number1 = b.nextInt();
        System.out.println("Введите Операцию : сложение, вычитание, умножение, деление ");
        Scanner a = new Scanner(System.in);
        String sign = a.nextLine();
        System.out.println("Введите 2 число ");
        Scanner c = new Scanner(System.in);
        int number2 = c.nextInt();

        switch (sign) {
            case "+":
                System.out.println("= ");
                System.out.println(number1 + number2);
                break;
            case "*":
                System.out.println("= "+ number1 * number2);
                break;
            case "/":


                if (number2 != 0) {

                    System.out.println("="+number1 / number2);
                }

                while (number2 == 0) {
                    System.out.println("ошибка");

                    System.out.println("Введите 2 число ");
                    Scanner g = new Scanner(System.in);
                    number2 = g.nextInt();


                }
                System.out.println("= " + number1 / number2);


                break;
            case "-":
                System.out.println("= ");
                System.out.println(number1 - number2);
                break;

        }


    }

}


