package org.designPatterns.observer;

public class Demo {
  public static void main(String[] args) {
    Publisher publisher = new Publisher();
    Subscriber user1 = new IphoneSubscriber();
    Subscriber user2 = new IphoneSubscriber();
    publisher.addSubscriber(user1);
    publisher.addSubscriber(user2);
    publisher.sendNotification("Hello from smartWatch");
    publisher.removeSubscriber(user1);
    publisher.sendNotification("Hello second time");
  }
}
