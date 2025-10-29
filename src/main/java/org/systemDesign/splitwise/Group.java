package org.systemDesign.splitwise;

import java.util.List;
import java.util.UUID;

public class Group {
  private final String groupId;
  private String name;
  private List<User> users;

  Group(String name, List<User> users) {
    this.users = users;
    this.name = name;
    this.groupId = UUID.randomUUID().toString();
  }

  public String getGroupId() {
    return groupId;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean addUser(User user) {
    return this.users.add(user);
  }
}
