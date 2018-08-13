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

    public void OutputOnDisplay() {

        System.out.println(Arrays.toString (clients));
    }

}
