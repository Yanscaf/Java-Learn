package Practics;

import java.util.Scanner;

public class WhilePractic {
    public static void main(String[] args) {
//        int number = 1;
//        int num = 1;
//        while (number <= 10) {
//            System.out.println(number);
//            number++;
//        }
//
//        int sum = 0;
//        while (num <= 100) {
//            sum += num;
//            num++;
//        }
//        System.out.println(sum);
//
//        int n = 25;
//        while (n >= 0) {
//            System.out.println(n);
//            n-=2;
//        }

//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while(flag) {
//            String input = sc.nextLine();
//            System.out.println("Vi vveli " + input);
//
//            if (input.equalsIgnoreCase("stop")) {
//                flag = false;
//            }
//        }
//        System.out.println("Program is over!");


        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean flag = true;
        while (!input.equalsIgnoreCase("Stop")) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            System.out.print("Введите операцию (+ - * /): ");
            String s = sc.next();

            switch (s) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                    case "/":
                        if (b!= 0) {
                            System.out.println(a / b);
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                        }
                        break;
            }

            System.out.print("Введите 'stop' для выхода или нажмите Enter для продолжения: ");
            sc.nextLine();
            input = sc.nextLine();


        }


    }
}
