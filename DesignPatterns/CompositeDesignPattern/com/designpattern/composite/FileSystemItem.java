package com.designpattern.composite;


public interface FileSystemItem {
  void ls();

  void openAll();

  int getSize();

  String getName();
}
