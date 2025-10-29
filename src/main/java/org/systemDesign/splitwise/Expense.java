package org.systemDesign.splitwise;

import java.util.Date;
import java.util.List;

public class Expense {
    private final String expenseId;
    private final double amount;
    private final String description;
    private final Group group;
    private final User paidBy;
    private final List<Split> splits;
    private final Date createdAt;

    public Expense(String expenseId, double amount, String description, Group group, User paidBy, List<Split> splits, Date createdAt) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.description = description;
        this.group = group;
        this.paidBy = paidBy;
        this.splits = splits;
        this.createdAt = createdAt;
    }
}
