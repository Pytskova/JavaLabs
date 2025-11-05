import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        switch (scanner.nextInt()) {
            case 1:
                double x = (4 / 2) + Math.pow(3, 2);
                System.out.println("Результат выражения: " + x);
                break;

            case 2:
                System.out.println("Введите номер подзадания 2:");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Введите число");
                        int num = scanner.nextInt();

                        System.out.println("Введите делитель: ");
                        int n = scanner.nextInt();

                        if (n != 0) {
                            if (num % n == 0) {
                                System.out.println("Введенное число делится на делитель");
                            } else {
                                System.out.println("Введенное число не делится на делитель");
                            }
                        } else {
                            System.out.println("Введенный делитель является нулем");
                        }
                        break;
                    case 2:
                        System.out.println("Введите число: ");
                        int a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Один");
                                break;
                            case 2:
                                System.out.println("Два");
                                break;
                            case 3:
                                System.out.println("Три");
                                break;
                            case 4:
                                System.out.println("Четыре");
                                break;
                            case 5:
                                System.out.println("Пять");
                                break;
                            case 6:
                                System.out.println("Шесть");
                                break;
                            case 7:
                                System.out.println("Семь");
                                break;
                            case 8:
                                System.out.println("Восемь");
                                break;
                            case 9:
                                System.out.println("Девять");
                                break;
                            default:
                                System.out.println("Не верное число");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Введите столицу:");
                        String capital = scanner.next();
                        switch (capital) {
                            case "Минск":
                                System.out.println("Беларусь");
                                break;
                            case "Москва":
                                System.out.println("Россия");
                                break;
                            case "Вильнюс":
                                System.out.println("Литва");
                                break;
                            case "Рига":
                                System.out.println("Латвия");
                                break;
                            case "Хельсинки":
                                System.out.println("Норвегия ");
                                break;
                            default:
                                System.out.println("Нет такой столицы");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Введите до какого числа: ");
                        int b = scanner.nextInt();
                        int sum = 0;
                        int i = 1;

                        if (b < 1 || b > 9) {
                            System.out.println("Число не подходит!");
                        } else {

                            while (i <= b) {
                                if (i % 2 != 0) {
                                    sum += i;
                                }
                                i++;
                            }

                            System.out.println("Сумма нечетных чисел от 1 до " + b + " = " + sum);

                        }
                        break;
                    default:
                        System.out.println("Такого задания нет");
                        break;
                }
                break;

            case 3:
                System.out.println("Вывести числа 811-851");
                int s = 811;
                int e = 851;

                do {
                    System.out.print(s + "\t\t");
                    s++;
                }
                while (s <= e);
                break;

            case 4:
                System.out.print("Введите количество чисел: ");
                int n = scanner.nextInt();

                int shortest = 0, longest = 0;
                int minLen = 10, maxLen = 1;

                if (n == 0) {
                    System.out.println("Нет чисел для поиска");
                    break;
                }


                for (int i = 1; i <= n; i++) {
                    int num = scanner.nextInt();
                    int len;
                    len = (num == 0) ? 1 : 0;

                    for (int t = Math.abs(num); t > 0; t /= 10) {
                        len++;
                    }

                    if (len < minLen) {
                        minLen = len;
                        shortest = num;
                    }

                    if (len > maxLen) {
                        maxLen = len;
                        longest = num;
                    }
                }

                System.out.println("Самое короткое число: " + shortest + " (длина = " + minLen + ")");
                System.out.println("Самое длинное число: " + longest + " (длина = " + maxLen + ")");

                break;

            case 5:
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.print((i * j) + "\t");
                    }
                    System.out.println();
                }


            default:
                System.out.println("Такого задания нет");
                break;
        }
    }
}
