package org.example;

public class PremiyaException extends Exception {
    public PremiyaException(double premia) {
        super("Ошибка: отрицательная премия " + premia);
    }
}
