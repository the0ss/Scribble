package org.systemDesign.splitwise;

import java.util.UUID;

public class User {
  private final String userId;
  private final String name;
  private final String phoneNumber;

  User(String name, String phoneNumber) {
    this.userId = UUID.randomUUID().toString();
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getUserId() {
    return userId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
}
