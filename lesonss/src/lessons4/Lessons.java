package lessons4;

public class Lessons {

    public static void main(String [] args){
        Lessons lessons = new Lessons();
        System.out.println(lessons.check(3>4 ,4>3));
        System.out.println(lessons.checkThree(3>4 ,2>3, 6>4));


    }

    public  boolean check (boolean a, boolean b){
        return a == false && b == true ;


    }
    public boolean checkThree(boolean a, boolean b, boolean c){
        return a && b && c || !a && !b && !c;


    }


}
