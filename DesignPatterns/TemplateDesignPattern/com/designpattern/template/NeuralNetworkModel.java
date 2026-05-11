package com.designpattern.template;

public class NeuralNetworkModel extends ModelTrainer{

  @Override
  public void load(String _path) {
    System.out.println("Loading Neural Network Model path " + _path);
  }

  @Override
  public void save() {
    System.out.println("Saving Neural Network Model");
  }

  @Override
  public void train() {
    System.out.println("Training Neural Network Model");
  }

  @Override
  public void preprocess() {
    System.out.println("Preprocessing Neural Network Model");
  }

  @Override
  public void evaluate() {
    System.out.println("Evaluating Neural Network Model");
  }
}
