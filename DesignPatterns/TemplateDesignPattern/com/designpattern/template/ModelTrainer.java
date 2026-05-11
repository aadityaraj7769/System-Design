package com.designpattern.template;

public abstract class ModelTrainer {
  public abstract void load(String path);
  public abstract void preprocess();
  public abstract void train();
  public abstract void evaluate();
  public abstract void save();

  public void templateMethod(String path) {
    this.load(path);
    this.preprocess();
    this.train();
    this.evaluate();
    this.save();
  }

}
