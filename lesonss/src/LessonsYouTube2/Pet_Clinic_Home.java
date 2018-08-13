package LessonsYouTube2;

import java.util.Scanner;

public class Pet_Clinic_Home {

    public static void main(String[] args) {
        int menu = 0;
        int size,numberClient;
        String name, pet;
        Clinic clinic = new Clinic();
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите количество клиентов: ");
        size = scan.nextInt();
        clinic.AddSize(size);

        while (menu < 6) {
            System.out.println("Выберите пункт меню: 1) Добавить клиента 2) Найти клиента  3) Удалить клиента 4) Редактировать имя клиента 5) Вывод всех клиентов на экран 6) Выход ");
            menu = scan.nextInt();
            if (menu == 1) {
                System.out.println("Введите номер клиента в списке от 1 до "+size);
                numberClient = scan.nextInt();
                System.out.println("Введите имя клиента: ");
                name = scan.next();
                System.out.println("Введите имя петомца: ");
                pet = scan.next();
                clinic.AddClient(name, pet,numberClient);
            }
            if (menu == 5){
                clinic.OutputOnDisplay();

            }


        }


    }


}
