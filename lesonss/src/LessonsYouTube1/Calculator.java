package LessonsYouTube1;

public class Calculator {
    private int result;


    public static void main(String [] args){
        Calculator calc = new Calculator();
        int a,b;
        a = 2;
        b = 7;
        calc.add(1,2,3,4,5,6);


    }

    public void  add(int...arg) {
        for (int param : arg) {
            this.result += param;
            System.out.println(this.result);

        }
    }
        public int getResult() {
            return this.result;
        }

        public void cleanResult(){
            this.result = 0;

        }




    }






