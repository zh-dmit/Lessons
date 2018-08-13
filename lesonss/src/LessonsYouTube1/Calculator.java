package LessonsYouTube1;
/*
 Класс реализует методы калькулятора с двумя значениями.
  */



public class Calculator {
    public double result = 0;
        /*
         * Сложение двух аргументов и возврат результата.
         * */
        public  double  add(double arg1, double arg2) {
            this.result = arg1 + arg2;
            return this.result;
        }
        /*
         * Вычитание двух аргументов и возврат результата.
         * */
        public double  subtract(double arg1, double arg2) {
            this.result = arg1 - arg2;
            return this.result;
        }
        /*
         * Деление двух аргументов и возврат результата.
         * */

        public double share(double arg1, double arg2){
            this.result = arg1 / arg2;
            return this.result;
        }
        /*
         * Умножение двух аргументов и возврат результата.
         * */

        public double multiply(double arg1, double arg2){
            this.result = arg1 * arg2;
            return this.result;
        }

        /*
         * Возведение в степень двух аргументов и возврат результата.
         * */
        public double sqr(double arg1, double arg2){
            this.result = Math.pow(arg1, arg2);
            return this.result;
        }


    }






