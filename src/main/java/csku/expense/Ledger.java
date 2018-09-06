package csku.expense;

/**
 * Created by 708 on 8/31/2018.
 */
public class Ledger {
    private Accounts accounts;


   public Ledger(){
       accounts = new Accounts();
   }

    public Ledger(Accounts a){
        accounts = a;
    }

   public void income(double money, String descrip){
           accounts.income(money, descrip);
       }

   public void expense(double money, String descrip) throws OverExpenseException{
           accounts.expense(money, descrip);
   }

    public double getBalance() {
            return accounts.getBalance();
    }

    public String getTotal(){
       return accounts.getTotal();
    }
}
