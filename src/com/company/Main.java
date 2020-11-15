package com.company;

public class Main {

    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(4, 4);
        RegularPolygon p3 = new RegularPolygon(3, 3, 1, 1);


        System.out.println("p1: "+ String.format("perimeter: %.4f ", p1.getPerimeter()) + "\t" + String.format("area: %.4f",p1.getArea()));
        System.out.println("p2: "+ String.format("perimeter: %.4f ", p2.getPerimeter()) + "\t" + String.format("area: %.4f",p2.getArea()));
        System.out.println("p3: "+ String.format("perimeter: %.4f ", p3.getPerimeter()) + "\t" + String.format("area: %.4f",p3.getArea()));
    }
}
