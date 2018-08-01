package lessons6;

public class MultipleTable {

    public static void main (String [] args ){
        MultipleTable table = new  MultipleTable();
       // table.evenRange(4, 12);
        table.show(2);

    }

    public void evenRange (int a, int b){
        for ( int i = a; i<b; i++){

            if (i % 2 == 0){
                System.out.println(i);

            }


        }



    }
    public void  show(int a){
        for (int i = 1; i<= a; i++){
            for (int j = 1; j<=a; j++){
                System.out.print(i*j+" ");

            }
            System.out.println(" ");
        }

    }





}
