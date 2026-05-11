package com.designpattern.composite;

public class FileSystem {
  public static void main(String[] args) {
    Folder root = new Folder("root");
    root.add(new File("File1.txt"));
    root.add(new File("File2.txt"));

    Folder child1 = new Folder("child1");
    child1.add(new File("File3.txt"));
    child1.add(new File("File4.txt"));

    root.add(child1);
    Folder child2 = new Folder("child2");
    child2.add(new File("File5.txt"));
    child2.add(new File("File6.txt"));

    root.add(child2);

    root.ls();
    root.openAll();
    int noOfFiles = root.getSize();
    System.out.println(noOfFiles);
  }
}
