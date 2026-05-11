package com.designpattern.proxy.virtual;

public class ImageDisplay implements IDisplay {
  private String fileName;

  public ImageDisplay(String file) {
    //Very Expensive Operation
    System.out.println("ImageDisplay constructor");
    this.fileName = file;
  }

  @Override
  public void display() {
    System.out.println("Display Image" + fileName);
  }
}
