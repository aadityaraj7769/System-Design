package com.designpattern.proxy.virtual;

public class VirtualProxy {
  public static void main(String[] args) {
    IDisplay idis = new ImageProxy("image.jpg");
    idis.display();
  }
}
