package csku.expense;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnitTestAccount {
    Accounts account;
    int init = 200;

    @BeforeEach
    void init(){
        account = new Accounts(init);
    }

    @Test
    void testIncome(){
        account.income(200, "earned from mom");
        assertEquals(400, account.getBalance());
    }

    @Test
    void testExpense() throws OverExpenseException {
        account.expense(50, "buy food");
        assertEquals(150, account.getBalance());
    }

    @Test
    @DisplayName("throws OverExpenseException when expense more than balance")
    void testExpenseMoreThanBalance(){
        assertThrows(OverExpenseException.class,
                () -> account.expense(3000, "buy ticket"));
        assertEquals(-2800, account.getBalance());
    }

}
