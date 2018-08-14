package LessonsYouTube2;

import java.util.Arrays;

public class Clinic {
    Clients[] clients;

    public void AddSize(int size) {

        clients = new Clients[size];
    }

    public void AddClient(String name, String pet, int numberClient) {

        clients[numberClient] = new Clients(name, pet);
    }

    public void OutputOnDisplay(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(((i + 1) + "|" + clients[i]));
        }
    }

    public void SearchClient(int positionClient) {
        System.out.println((clients[positionClient])); //Спросить можно ли обратиться к одному из параметров объекта name или pet, что бы реализовать поиск ?
    }

    public void DeleteClient(int positionClient) {
        clients[positionClient] = new Clients(null, null);
    }

    public void ChangeNameClient(int positionClient, String newName, String newPet) {
        clients[positionClient] = new Clients(newName, newPet);
    }
    public void Test (int value, int size){
        if ((value > size) || (value < 0)){
            System.out.println("Значение за пределами списка.");
            System.exit(0);
        }

    }

}


