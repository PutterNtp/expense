package csku.expense;

import java.util.ArrayList;

public class Accounts {

    private double balance;

    private ArrayList<AccountsHistory> histories = new ArrayList<>();


    public Accounts(double initialMoney){
        this.balance = initialMoney;

    }

    public Accounts(){
        this.balance = 0;
    }


    public void income(double money, String descrip){
        balance += money;
        histories.add(new AccountsHistory(money, descrip, "+"));
    }

    public void expense(double money, String descrip) throws OverExpenseException{
        balance -= money;
        histories.add(new AccountsHistory(money, descrip, "-"));
        if(money > balance) {
            throw new OverExpenseException("Your expense more than your balance\n");
        }
    }

    public String getTotal(){
        String temp = "";
        for(int i = 0; i < histories.size(); i++){
            temp += histories.get(i).type + "" + histories.get(i).money + " : " + histories.get(i).des + "\n";
        }

        return temp;
    }

    public double getBalance() {
        return balance;
    }

}
