package com.designpattern.template;

public class DecisionTreeModel extends ModelTrainer {

  @Override
  public void save() {
    System.out.println("Saving Decision Tree Model");
  }

  @Override
  public void evaluate() {
    System.out.println("Evaluating Decision Tree Model");
  }

  @Override
  public void load(String _path) {
    System.out.println("Loading Decision Tree Model path " + _path);
  }

  @Override
  public void preprocess() {
    System.out.println("Preprocessing Decision Treek Model");
  }

  @Override
  public void train() {
    System.out.println("Training Decision Tree Model");
  }
}
