package org.systemDesign.splitwise;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SplitWiseService {
  private Map<String, User> users;
  private Map<String, Group> groups;
  private Map<String, Expense> expenses;
  private BalanceSheet balanceSheet;

  private SplitWiseService() {
    this.users = new ConcurrentHashMap<>();
    this.groups = new ConcurrentHashMap<>();
    this.expenses = new ConcurrentHashMap<>();
    this.balanceSheet = new BalanceSheet();
  }

  public User createUser(String name, String phoneNumber) {
    User user = new User(name, phoneNumber);
    users.put(user.getUserId(), user);
    return user;
  }

  public Group createGroup(String name, List<String> userIds) {
    List<User> userList = userIds.stream().map(users::get).toList();
    Group group = new Group(name, userList);
    groups.put(group.getGroupId(), group);
    return group;
  }

  public static SplitWiseService getInstance() {
    return SingletonHelper.INSTANCE;
  }

  private static class SingletonHelper {
    private static final SplitWiseService INSTANCE = new SplitWiseService();
  }
}
