package com.designpattern.adapter;

public class AdapterClient {
  public static void main(String[] args) {

    IReports report = new XmlDataProviderAdapter(new XmlDataProvider());

    System.out.println(report.getJsonData());
  }
}
