package com.designpattern.template;

public class TemplatePattern {
  public static void main(String[] args) {
    ModelTrainer modelTrainer = new NeuralNetworkModel();
    modelTrainer.templateMethod("/home");

    ModelTrainer modelTrainer2 = new DecisionTreeModel();
    modelTrainer2.templateMethod("/Desktop");
  }
}
