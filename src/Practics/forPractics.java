package Practics;

import java.util.Scanner;

public class forPractics {
    public static void main(String[] args) {
//        for (int i = 10; i > 0; i--) {
//            System.out.println("i: " + i);
//        }
//
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//
//        int counter = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("7 * " + counter + " = " + (7 * counter));
//            counter++;
//        }

//        for (int i = 5; i <= 50; i++) {
//            System.out.println("i " + i);
//            i=i+4;
//        }
//
//        int counter = 0;
//        for (int i = 5; i <= 100; i++) {
//            if (i % 2 != 0) {
//                counter++;
//            }
//        }
//        System.out.println("Количество нечётных: " + counter);
//
//
//        for (int i = 1; i <= 10; i++) {
//            int result = (int) (Math.pow(i , 2));
//            System.out.println(result);
//        }

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(" ");
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = sc.nextInt();
//        int sum = 0;
//
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        System.out.println("<UNK> <UNK>: " + sum);

//        String name = "Yan Miskin";
//        String gender = "";
//        for (int i = name.length() - 1; i >=0 ; i--) {
//            gender += name.charAt(i);
//        }
//        System.out.println(gender);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the letter");
        char ch = sc.next().charAt(0);
        boolean flag = false;
        int position = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                flag = true;
                position = i;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Letter is found " + position);
        } else {
            System.out.println("Letter is not found at position ");
        }

    }

}
