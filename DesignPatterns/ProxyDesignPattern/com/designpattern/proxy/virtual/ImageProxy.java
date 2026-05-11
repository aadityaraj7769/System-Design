package com.designpattern.proxy.virtual;

public class ImageProxy implements IDisplay {
  private ImageDisplay imageDisplay;
  private String fileName;

  public ImageProxy(String file) {
    this.imageDisplay = null;
    this.fileName = file;
  }

  public void display() {
    if (imageDisplay == null) {
      imageDisplay = new ImageDisplay(fileName);
    }
    imageDisplay.display();
  }
}
