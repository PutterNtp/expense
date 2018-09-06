# new feature
# Tags: optional

Feature: income
        As a user,
        I can add income to ledger
        ,so I can view my balance.

Scenario: Normal income
        Given a user have balance 200 exists
        When I earned 200 from mom
        Then balance is 400