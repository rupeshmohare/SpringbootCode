package com.Springboot;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository {
    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();

    public BankAccountRepositoryImpl() {
        bankAccountMap.put(1L, new BankAccount() {{
            setAccountId(1L);
            setAccountHolderName("John Doe");
            setAccountType("Savings");
            setAccountBalance(1000.0);
        }});
        bankAccountMap.put(2L, new BankAccount() {{
            setAccountId(2L);
            setAccountHolderName("Jane Doe");
            setAccountType("Checking");
            setAccountBalance(2000.0);
        }});
    }

    @Override
    public double getBalance(long accountId) {
        BankAccount account = bankAccountMap.get(accountId);
        return account != null ? account.getAccountBalance() : 0;
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        BankAccount account = bankAccountMap.get(accountId);
        if (account != null) {
            account.setAccountBalance(newBalance);
            return newBalance;
        }
        return 0;
    }
}
