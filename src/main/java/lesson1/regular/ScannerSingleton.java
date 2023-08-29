package lesson1.regular;

import java.util.Scanner;

/**
 * Класс паттерна Singleton,
 * чтобы использовать лишь один сканер
 */

public class ScannerSingleton {
    private static Scanner scanner;

    /**
     * Получить объект сканера
     * @return объект сканера
     */
    public static Scanner getScanner() {
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
