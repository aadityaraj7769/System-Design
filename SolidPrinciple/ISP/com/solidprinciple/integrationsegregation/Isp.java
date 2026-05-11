package com.solidprinciple.integrationsegregation;

public class Isp {
  public static void main (String[] args) {
    Square square = new Square(5);

    Rectangle rectangle = new Rectangle(5, 6);

    Cube cube = new Cube(5);

    System.out.println(square.area());
    System.out.println(rectangle.area());
    System.out.println(cube.area());
    System.out.println(cube.volume());
  }
}
