package com.solidprinciple.integrationsegregation;

public class Square implements ITwoDimensionalShape{

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }
}
