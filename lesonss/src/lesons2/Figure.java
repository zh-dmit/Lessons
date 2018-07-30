package lesons2;

public class Figure {

    public double randomNumber(){
        return Math.random()* 10;
    }

    public double circleArea (double rad){
        return Math.PI * Math.pow(rad,2);
    }

    public static void main(String[] args) {
        Figure figure = new Figure();
        double rad = figure.randomNumber();
        double area = figure.circleArea(rad);
        System.out.println("Радиус круга = "+ rad + " площадь круга = " + area);
    }


}
