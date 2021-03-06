package by.it.dudko.jd01_02;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] arguments) {

        step1();

        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        step2(monthNumber);

        System.out.println("Enter coefficient 'a'");
        int a = sc.nextInt();
        System.out.println("Enter coefficient 'b'");
        int b = sc.nextInt();
        System.out.println("Enter coefficient 'c'");
        double c = sc.nextDouble();
        step3((double) a, (double) b, c);
    }


    static void step1() {
        final int DIMENSION = 5;
        int counter = 0;
        String row = "";
        while (counter < 25) {
            row += ++counter;
            if (counter % DIMENSION != 0) {  // returns false for every fifth number
                row += " "; // add space between numbers in row
            } else {
                System.out.println(row); // write out finished row
                row = ""; // begin new empty row
            }
        }
    }


    static void step2(int month) {
        switch (month) {
            case 1: {
                System.out.println("январь");
                break;
            }
            case 2: {
                System.out.println("февраль");
                break;
            }
            case 3: {
                System.out.println("март");
                break;
            }
            case 4: {
                System.out.println("апрель");
                break;
            }
            case 5: {
                System.out.println("май");
                break;
            }
            case 6: {
                System.out.println("июнь");
                break;
            }
            case 7: {
                System.out.println("июль");
                break;
            }
            case 8: {
                System.out.println("август");
                break;
            }
            case 9: {
                System.out.println("сентябрь");
                break;
            }
            case 10: {
                System.out.println("октябрь");
                break;
            }
            case 11: {
                System.out.println("ноябрь");
                break;
            }
            case 12: {
                System.out.println("декабрь");
                break;
            }
            default: {
                System.out.println("нет такого месяца");
            }
        }
    }

    static void step3(double a, double b, double c) {
        double d = -1.0;
        double x1 = 0.0;
        double x2 = 0.0;

        String resultLine = "";

        if (a != 0) {
            // calculate discriminant
            d = b * b - 4 * a * c;
            if (d < 0) {
                // equation has no roots
                resultLine = "корней нет";
            } else {
                // calculate first root
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                resultLine = resultLine + Double.toString(x1);
                if (d > 0) {
                    // equation has two roots
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    resultLine = resultLine + " " + Double.toString(x2);
                }
            }
        } else {
            x1 = -c / b;
            resultLine = resultLine + Double.toString(x1);
        }

        System.out.println(resultLine);
    }

}
