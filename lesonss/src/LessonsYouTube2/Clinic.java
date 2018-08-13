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


    @Override
    public String toString() {
        for (int index = 0; index < clients.length; index++) {
             System.out.println(clients[index]);
        }
        return "";
    }

        public void OutputOnDisplay () {

            System.out.println(clients.toString());
        }

    }
