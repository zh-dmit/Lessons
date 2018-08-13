package LessonsYouTube2;
import java.util.Scanner;

public class Pet_Clinic_Home {

public static void main (String [] args){
    int menu = 0;
    int size;
    String name,pet;
    Clinic clinic = new Clinic();
    Scanner scan = new Scanner(System.in);
    System.out.println("Укажите размер клиники: ");
    size = scan.nextInt();
    clinic.addSize(size);

    while (menu < 5){
        System.out.println("Выберите пункт меню: 1) Добавить клиента 2) Найти клиента  3) Удалить клиента 4) Редактировать имя клиента ");
        menu = scan.nextInt();
        if (menu == 1){
            System.out.println("Введите имя клиента и петомца: ");
            name = scan.toString();
            pet = scan.toString();
            clinic.addClient(name,pet);
        }








    }




}






}
