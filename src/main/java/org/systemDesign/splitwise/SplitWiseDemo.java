package org.systemDesign.splitwise;

import java.util.List;

public class SplitWiseDemo {
  public static void main(String[] args) {
    SplitWiseService splitWiseService = SplitWiseService.getInstance();
    User user1 = splitWiseService.createUser("user1", "12345");
    User user2 = splitWiseService.createUser("user2", "12346");
    User user3 = splitWiseService.createUser("user3", "12347");

    Group group1 =
        splitWiseService.createGroup(
            "Group1", List.of(user1.getUserId(), user2.getUserId(), user3.getUserId()));
  }
}
