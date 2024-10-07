package classandmethods;

import java.util.Scanner;

abstract class Shape{
    abstract double area();
}
class Square extends Shape {
    private double length;
    Square(double length){
        this.length=length;
    }
    double area(){
        return length*length;
    }
}
class Triangle extends Shape {
    private double breadth;
    private double height;
    Triangle(double breadth,double height){
        this.breadth=breadth;
        this.height=height;
    }
    double area(){
        return breadth*height*0.5;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0]=new Square(4);
        shapes[1]=new Square(9);
        shapes[2]=new Triangle(4,6);
        shapes[3]=new Triangle(4,12);
        for(Shape s:shapes){
            System.out.println(s.area());
        }
        int i=10;
        Integer i2= Integer.valueOf(i);
        System.out.println(i2);
        int j=i2.intValue();
        System.out.println(j);
        String s="123";
        int k=Integer.parseInt(s);

    }
}
