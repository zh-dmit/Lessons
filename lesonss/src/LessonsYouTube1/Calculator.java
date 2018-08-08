package LessonsYouTube1;

public class Calculator {
    private double result;



    public static void main(String [] args){


    }
        public double  add(double a, double b) {
            this.result = a + b;
            return result;
        }
        public double  subtract(double a, double b) {
            this.result = a + b;
            return result;
        }

        public double share(double a, double b){
            this.result = a / b ;
            return result ;
        }

        public double multiply(double a, double b){
            this.result = a * b ;
            return result ;
        }
        public double sqr(double a, double b){
            this.result = Math.pow(a, b) ;
            return result ;
        }


    }






