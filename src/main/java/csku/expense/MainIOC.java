package csku.expense;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainIOC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Accounts accounts = context.getBean("account",Accounts.class);
        accounts.income(200,"Mom give to me");
        System.out.println(accounts.getBalance());
    }
}
