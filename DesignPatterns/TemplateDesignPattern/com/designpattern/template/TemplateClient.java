package com.designpattern.template;

public class TemplateClient {
  private ModelTrainer modelTrainer;

  public TemplateClient(ModelTrainer modelTrainer) {
    this.modelTrainer = modelTrainer;
  }

  public void pipelineRun(String path) {
    modelTrainer.templateMethod(path);
  }
}
