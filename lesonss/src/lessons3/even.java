package lessons3;



public class even {

    public static void main (String [] args){
        even even = new even();
        if (even.eve(12)){
            System.out.println("не четное");

        }
        else System.out.println("четное");

        System.out.println(even.mai(64));


    }

    public boolean mai (int a){

        return  Math.sqrt(a) > a / 4;



    }

    public boolean eve (int a){
         return a % 2 != 0;

    }



}
