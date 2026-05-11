package com.designpattern.observer;

public interface IChannel {
  void subscribe(ISubscriber s);
  void unSubscribe(ISubscriber s);
  void Notify();
}
