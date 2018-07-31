package lessons5;

public class lessons5 {


    public static void main (String [] args){
        lessons5 lesons = new lessons5();
        lesons.checkRange(8,6,17);
        lesons.checkNumber(0);


    }
    public static void checkRange (int a, int b, int c){
        System.out.println((a>b)&&(a<c)  ? "Число a входит в диапазон между b и c": "Число a не входит в диапазон между b и c");

    }
    public static void checkNumber(int a){

        System.out.println((a<0) ? "Число отрицательное": "");
        System.out.println((a>0) ? "Число положительное": "");
        System.out.println(a==0 ? "Число ноль": "");

    }


}
