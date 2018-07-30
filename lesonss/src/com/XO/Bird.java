package com.XO;

public class Bird {


    public void Fly(int znachenie) {
        System.out.println("I can fly " + znachenie);
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.Fly(10);
        System.out.println(bird.flyBack(40));

    }
    
    public int flyBack(int speed) {
        return speed * 2;
    }
}




