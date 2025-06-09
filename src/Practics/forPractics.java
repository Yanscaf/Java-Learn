package Practics;

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

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
