package lesson1.sample;

import lesson1.regular.Functions;
import lesson1.regular.ScannerSingleton;
import lesson1.regular.Validator;
import lesson1.regular.outputDecorator;

import java.util.Scanner;

public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        Validator val = new Validator();
        Scanner sc = ScannerSingleton.getScanner();

        // Вводим данные с консоли
        System.out.print("Enter number <a>: ");
        double a = val.valDouble(sc.next());
        sc.nextLine();
        System.out.print("Enter operator: ");
        String op = sc.next();
        sc.nextLine();
        System.out.print("Enter number <b>: ");
        double b = val.valDouble(sc.next());
        sc.nextLine();
        double res = 0;
        // */

        switch (op){ //проверка на оператор
            case "+" -> {
                res = Functions.sum(a,b);
            }
            case "-" -> {
                res = Functions.diff(a,b);
            }
            case "*" -> {
                res = Functions.multy(a,b);
            }
            case "/", ":" -> {
                if (b != 0){
                    res = Functions.div(a,b);
                }else {
                    System.out.println("Can`t divide by zero!");
                }
            }
            default -> {
                System.out.println("This is not an operator!");
                System.exit(0); // Выход из программы в случае неверного оператора
            }
        }
        // Вывод декорированной строки
        System.out.println(outputDecorator.decorate(res));
    }
}
