package LessonsYouTube2;

public class Clinic {
    Clients[] clients;

    public void addSize(int size) {
        clients = new Clients[size];
    }
    public void addClient(String name, String pet){
        clients [0] = new Clients (name,pet);
    }



}
