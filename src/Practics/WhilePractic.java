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

//
//        Scanner sc = new Scanner(System.in);
//        String input = "";
//        boolean flag = true;
//        while (!input.equalsIgnoreCase("Stop")) {
//            System.out.println("Enter first number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter second number: ");
//            int b = sc.nextInt();
//            System.out.print("Введите операцию (+ - * /): ");
//            String s = sc.next();
//
//            switch (s) {
//                case "+":
//                    System.out.println(a + b);
//                    break;
//                case "-":
//                    System.out.println(a - b);
//                    break;
//                case "*":
//                    System.out.println(a * b);
//                    break;
//                    case "/":
//                        if (b!= 0) {
//                            System.out.println(a / b);
//                        } else {
//                            System.out.println("Ошибка: деление на ноль!");
//                        }
//                        break;
//            }
//
//            System.out.print("Введите 'stop' для выхода или нажмите Enter для продолжения: ");
//            sc.nextLine();
//            input = sc.nextLine();

//        Scanner sc = new Scanner(System.in);
//        int value = Integer.MIN_VALUE;
//        while (sc.hasNextInt()) {
//            int number = sc.nextInt();
//            if (number > value) {
//                value = number;
//            }
//
//        }
//        System.out.println(value);

//        Scanner sc = new Scanner(System.in);
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        int sum = 0;
//        int counter = 0;
//
//        while (sc.hasNextInt()) {
//            int num = sc.nextInt();
//            if (num > max) {
//                max = num;
//            }
//            if (num < min) {
//                min = num;
//            }
//            sum += num;
//            counter++;
//        }
//
//        if (counter > 0) {
//           double avg = sum / counter;
//           System.out.println("The average is " + avg);
//            System.out.println("The maximum is " + max);
//            System.out.println("The minimum is " + min);
//            System.out.println("The sum is " + sum);
//        }

        String str = "Java";
        int count = 1;
        while (count <= 10) {
            System.out.print(str + " ");
            count++;

        }


    }
}
