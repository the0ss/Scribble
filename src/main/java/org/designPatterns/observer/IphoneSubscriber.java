package org.designPatterns.observer;

import java.util.UUID;

public class IphoneSubscriber implements Subscriber {
  private final String sid;

  public IphoneSubscriber() {
    this.sid = UUID.randomUUID().toString();
  }

  @Override
  public void update(String message) {
    System.out.println("User: " + sid + " have been notified with message: " + message);
  }
}
