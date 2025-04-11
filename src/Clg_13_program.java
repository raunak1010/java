import  java.util.Scanner;
public class Clg_13_program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = in.nextDouble();

        System.out.println("Enter second number");
        double num2 = in.nextDouble();

        System.out.println("choose an operator: +,-,*,/");
         char operator = in.next().charAt(0);

         double result;

        if (operator == '+') {
            result = num1 + num2;
        }else if (operator == '-'){
                result = num1 - num2;
            }
        else if (operator == '*'){
            result = num1 * num2;
        }
        else if (operator == '/'){
            result = num1 / num2;
        }
        else {
            System.out.println("Invaild operator");
            return;
        }
        System.out.println("Result:"+ result);
    }
}
