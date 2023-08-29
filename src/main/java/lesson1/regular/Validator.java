package lesson1.regular;

import java.util.Scanner;

/**
 * Класс проверки строки на содержание числа с плавающей точкой
 * или выхода из программы
 */
public class Validator {
    Scanner scanner;

    public Validator() {
        this.scanner = ScannerSingleton.getScanner();
    }
    /**
     * Функция проверки стоки на число с плавающей точкой.
     *
     * @param numberFromScanner строковое значение, предположительно число
     * @return число с плавающей точкой
     */
    public double valDouble(String numberFromScanner) {
        numberFromScanner = numberFromScanner.replace(",",".");
        while (true) {
            try {
                emergency_exit(numberFromScanner);
                if (Double.parseDouble(numberFromScanner) > -2_147_483_648.0 && Double.parseDouble(numberFromScanner) < 2_147_483_647.0) {//
                    return Double.parseDouble(numberFromScanner);
                } else {
                    System.out.print("Enter real number: ");
                    numberFromScanner = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Enter real number: ");
                numberFromScanner = scanner.next();
            }
        }
    }

    /**
     * Функция проверки стоки на необходимость выхода из программы.
     *
     * @param string строковое значение, предположительно exit
     * @return строковое значение
     */
    public String emergency_exit(String string) {
        if (string.equalsIgnoreCase("exit")) {
            System.out.println("\nEmergency exit!\n");
            System.exit(0);
        }
        return string;
    }
}
