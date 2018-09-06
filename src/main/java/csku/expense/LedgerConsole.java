package csku.expense;

import java.util.Scanner;

public class LedgerConsole {

    public void start(){
        Ledger ledgerAccount = new Ledger();
        Scanner sc = new Scanner(System.in);
        while (true) {
                System.out.println("[Balance = " + ledgerAccount.getBalance() + " ]");
                System.out.print("[A]=Income, [B]=Expense, [C]=History, [D]=Exit: ");
                String command = sc.next();
                if (command.equalsIgnoreCase("A")) {
                    System.out.print("Income: ");
                    double amount = sc.nextDouble();
                    System.out.print("Description: ");
                    sc.useDelimiter("\n");
                    String description = sc.next();
                    ledgerAccount.income(amount, description);
                }
                else if (command.equalsIgnoreCase("B")) {
                    System.out.print("Expense: ");
                    double amount = sc.nextDouble();
                    System.out.print("Description: ");
                    sc.useDelimiter("\n");
                    String description = sc.next();
                    try {
                        ledgerAccount.expense(amount, description);
                    } catch (OverExpenseException e) {
                        System.out.print(e.getMessage());
                    }
                }
                else if (command.equalsIgnoreCase("C")) {
                    System.out.println(ledgerAccount.getTotal());
                }
                else if (command.equalsIgnoreCase("D"))
                    System.exit(0);
                else
                    System.out.println("Input is not correct!, Please try again.");
            }
        }
    }



