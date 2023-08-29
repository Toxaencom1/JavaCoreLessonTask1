package lesson1.regular;

/**
 * Класс приложения со статическими методами. Его основное назначение
 * основные математические операции.
 */
public class Functions {
    /**
     * Функция суммирования двух целых чисел
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b.
     */
    public static double sum(double a, double b){
        return a+b;
    }
    /**
     * Функция вычитания двух целых чисел
     *
     * @param a первое число
     * @param b второе число
     * @return разница a и b.
     */
    public static double diff (double a, double b){
        return a-b;
    }
    /**
     * Функция умножения двух целых чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b.
     */
    public static double multy(double a, double b){
        return a*b;
    }
    /**
     * Функция деления двух целых чисел
     *
     * @param a делимое
     * @param b делитель
     * @return частное a на b.
     */
    public static double div(double a, double b){
        return a/b;
    }
}
