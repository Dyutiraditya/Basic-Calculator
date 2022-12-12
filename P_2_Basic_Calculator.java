import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {

        float x = 0;
        float y = 0;

        Scanner reader = new Scanner (System.in);
        System.out.print("X= ");
        x = reader.nextFloat();
        System.out.print("Y= ");
        y = reader.nextFloat();
        System.out.print("Enter an operator (+, -, *, /,%)= ");
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

