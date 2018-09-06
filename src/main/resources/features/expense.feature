# new feature
# Tags: optional

Feature: expense
        As a user,
        I can add expense to ledger,so I can view my balance.

Scenario: Normal Expense
        Given a user have balance 200 exists
        When I spend 50 for buy food
        Then balance is 150.

Scenario: Over Expense
        Given a user have balance 200 exists
        When I spend 3000 over for buy ticket
        Then balance is -2800.00.
