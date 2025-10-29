package org.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
  private List<Subscriber> subscriberList;

  public Publisher() {
    this.subscriberList = new ArrayList<>();
  }

  public void addSubscriber(Subscriber s) {
    subscriberList.add(s);
  }

  public void removeSubscriber(Subscriber s) {
    subscriberList.remove(s);
  }

  public void sendNotification(String message) {
    subscriberList.forEach(subscriber -> subscriber.update(message));
  }
}
