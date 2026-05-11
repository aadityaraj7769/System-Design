package com.designpattern.composite;


public class File implements FileSystemItem{
  private String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return 1;
  }

  @Override
  public void openAll() {
    System.out.println("Opening " + this.getName());
    Folder.sizeOfFolder = Folder.sizeOfFolder + 1;
  }

  @Override
  public void ls() {
    this.openAll();
  }
}
