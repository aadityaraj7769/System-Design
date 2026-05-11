package com.designpattern.adapter;

public class XmlDataProviderAdapter implements IReports {

  private XmlDataProvider _xmlDataProvider;

  public XmlDataProviderAdapter(XmlDataProvider xmlDataProvider) {
    _xmlDataProvider = xmlDataProvider;
  }

  @Override
  public String getJsonData() {
    String xmlData = _xmlDataProvider.getXmlData();
    System.out.println(xmlData);

    return "Data is converted into Json";
  }
}
