package LessonsYouTube2;

import java.util.Scanner;

public class Pet_Clinic_Home {

    public static void main(String[] args) {
        int menu = 1;
        int size, numberClient, positionClient;
        String name, pet, newName, newPet;
        Clinic clinic = new Clinic();
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите количество клиентов: ");
        size = scan.nextInt();
        clinic.AddSize(size);

        while ((menu < 6) && (menu > 0)) {
            System.out.println("Выберите пункт меню: 1) Добавить клиента 2) Найти клиента  3) Удалить клиента 4) Редактировать имя клиента 5) Вывод всех клиентов на экран 6) Выход ");
            menu = scan.nextInt();
            if (menu == 1) {
                System.out.println("Введите номер клиента в списке от 1 до " + size);
                numberClient = scan.nextInt();
                if (clinic.Test(numberClient, size)) {
                    numberClient -= 1;
                    System.out.println("Введите имя клиента: ");
                    name = scan.next();
                    System.out.println("Введите имя петомца: ");
                    pet = scan.next();
                    clinic.AddClient(name, pet, numberClient);
                } else
                    System.out.println("За пределами списка");

            }
            if (menu == 5) {
                clinic.OutputOnDisplay(size);
            }
            if (menu == 2) {
                System.out.println("Введите позицию клиента: ");
                positionClient = scan.nextInt();
                if (clinic.Test(positionClient, size)) {
                    positionClient -= 1;
                    clinic.SearchClient(positionClient);
                } else
                    System.out.println("За пределами списка");

            }
            if (menu == 3) {
                System.out.println("Введите позицию клиента на удаление: ");
                positionClient = scan.nextInt();
                if (clinic.Test(positionClient, size)) {
                    positionClient -= 1;
                    clinic.DeleteClient(positionClient);
                } else
                    System.out.println("За пределами списка");
            }
            if (menu == 4) {
                System.out.println("Введите позицию клиента для редактирования имени: ");
                positionClient = scan.nextInt();
                if (clinic.Test(positionClient, size)) {
                    positionClient -= 1;
                    clinic.SearchClient(positionClient);
                    System.out.println("Введите новое имя клиента: ");
                    newName = scan.next();
                    System.out.println("Введите новое имя петомца: ");
                    newPet = scan.next();
                    clinic.ChangeNameClient(positionClient, newName, newPet);
                } else
                    System.out.println("За пределами спсика");
            }


        }


    }


}
