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
                int arg1 = scan.nextInt();
                System.out.println("Введите аргумент 2: ");
                int arg2 = scan.nextInt();
                if (exit == 1) {
                    System.out.println("Результат деления " + calc.share(arg1, arg2));
                }
                if (exit == 2) {
                    System.out.println("Результат умножения " + calc.multiply(arg1, arg2));
                }
                if (exit == 3) {
                    System.out.println("Результат сложения " + calc.add(arg1, arg2));
                }
                if (exit == 4) {
                    System.out.println("Результат вычитания " + calc.subtract(arg1, arg2));
                }
                if (exit == 5) {
                    System.out.println("Результат возведения в степень " + calc.sqr(arg1, arg2));
                }

            }

        }

    }

