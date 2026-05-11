package com.solidprinciple.integrationsegregation;

public class Rectangle implements ITwoDimensionalShape{
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }
}
