package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;


public class Folder implements FileSystemItem {
  private String name;
  private List<FileSystemItem> children;
  public static int sizeOfFolder = 0;

  public Folder(String name) {
    this.name = name;
    this.children = new ArrayList<FileSystemItem>();
  }

  public void add(FileSystemItem child) {
    children.add(child);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void ls() {
    for(FileSystemItem child : children) {
      System.out.println(child.getName());
    }
  }

  @Override
  public int getSize() {
    return sizeOfFolder;
  }

  @Override
  public void openAll() {
    System.out.println("Opening folder " + name);
    for (FileSystemItem child : children) {
      child.openAll();
    }
  }
}
