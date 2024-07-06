package BasicQues;

import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        char op;
        double num1, num2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator: +, - , *, /");
        op = sc.next().charAt(0);

        System.out.print("Enter number 1: ");
        num1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        num2 = sc.nextDouble();

        switch (op){
            case '+':
                res = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + res);
                break;
            case '/':
                res = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + res);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
