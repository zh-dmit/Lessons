package LessonsYouTube1;
import java.util.Scanner;


public class Interface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int exit = 1;
            while ((exit < 6) && (exit > 0)) {
                System.out.println("Выберете операцию: 1)Деление 2)Умножение 3)Сложение 4)Вычитание 5)Возведение в степень 6)Выход ");
                exit = scan.nextInt();
                if (exit == 6) System.exit(0);
                System.out.println("Введите аргумент 1: ");
                int a = scan.nextInt();
                System.out.println("Введите аргумент 2: ");
                int b = scan.nextInt();
                if (exit == 1) {
                    System.out.println("Результат деления " + calc.share(a, b));
                }
                if (exit == 2) {
                    System.out.println("Результат умножения " + calc.multiply(a, b));
                }
                if (exit == 3) {
                    System.out.println("Результат сложения " + calc.add(a, b));
                }
                if (exit == 4) {
                    System.out.println("Результат вычитания " + calc.subtract(a, b));
                }
                if (exit == 5) {
                    System.out.println("Результат возведения в степень " + calc.sqr(a, b));
                }

            }

        }

    }

