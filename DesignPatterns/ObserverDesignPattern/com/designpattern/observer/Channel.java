package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;


public class Channel implements IChannel {

  private String name;
  private String latestVideo;

  private List<ISubscriber> subscribers = new ArrayList<>();

  public Channel(String name) {
    this.name = name;
  }

  public void subscribe(ISubscriber subscriber) {
    if(!subscribers.contains(subscriber)) {
      subscribers.add(subscriber);
    } else{
      System.out.println("Subscriber already exists");
    }
  }

  public void unSubscribe(ISubscriber subscriber) {
    if(subscribers.contains(subscriber)) {
      subscribers.remove(subscriber);
    } else {
      System.out.println("Subscriber does not exist");
    }
  }

  public void Notify() {
    for(ISubscriber subscriber : subscribers) {
      subscriber.update();
    }
  }

  public void uploadVideo(String video) {
    latestVideo = video;
    this.Notify();
  }

  String getLatestVideo() {
    return "Latest video uploaded: " + latestVideo;
  }


}
