import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        double num1;
        double num2;
        double res;
        char oper;
        Scanner reader = new Scanner(System.in);
        System.out.print("введите два числа (через пробел): ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("выберите действие: (+, -, *, /): ");
        oper = reader.next().charAt(0);
        switch (oper) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> res = num1 / num2;
            default -> {
                System.out.print("ошибка");
                return;
            }
        }
        System.out.print("результат: ");
        System.out.printf(num1 + " " + oper + " " + num2 + " = " + res);
    }
}