package lessons7;

public class lessons {

    public static void main(String [] args){
        int [] arr = {44,12,81,98,18};
        lessons lessons = new lessons();
        lessons.arithmetic(arr);
        lessons.min(arr);

    }


    public static  int min (int [] arr){
        int min = Integer.MAX_VALUE;
        int r = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                r = i;
            }
        }
        System.out.println("Минимальный индекс массива: "+r);
        return r;



    }

    public static double arithmetic (int [] arr2){
        double average;
        double sum = 0;
        for (int i = 0; i < arr2.length; i++){
            sum += arr2[i];
        }
        average = sum / arr2.length;
        System.out.println("Среднее арифметическое массива: "+average);
        return average;



    }





}
