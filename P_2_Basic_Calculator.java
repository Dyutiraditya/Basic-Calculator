package D_1_a_BeginnerOfJava;

import java.util.Scanner;

public class P_2_Basic_Calculator  {
    public static void main(String[] args) {

        float x = 0;
        float y = 0;

        Scanner reader = new Scanner (System.in);
        System.out.println("X= ");
        x = reader.nextFloat();
        System.out.println("Y= ");
        y = reader.nextFloat();
        System.out.println("Enter an operator (+, -, *, /,%)= ");
        char operator = reader.next().charAt(0);
        float result;

        switch(operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            case '%':
                result = x % y;
                break;

            default:
                System.out.println("Error");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f",  x, operator , y, result);
        }

    }

