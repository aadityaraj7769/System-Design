package com.designpattern.observer;

public class Observer {
  public static void main(String[] args) {
    Channel channel = new Channel("BachelorKaZaika");

    Subscriber subs1 = new Subscriber("Aditya", channel);
    Subscriber subs2 = new Subscriber("Anshu", channel);

    channel.subscribe(subs1);
    channel.subscribe(subs2);

    channel.uploadVideo("ButterChicken");

    channel.unSubscribe(subs1);

    channel.uploadVideo("KadhaiPaneer");
  }
}
