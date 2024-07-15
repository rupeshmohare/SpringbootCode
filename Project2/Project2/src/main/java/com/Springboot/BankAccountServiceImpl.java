package com.Springboot;

public class BankAccountServiceImpl implements BankAccountService {

    private BankAccountRepository bankAccountRepository;

    public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public double withdraw(long accountId, double balance) {
        double currentBalance = bankAccountRepository.getBalance(accountId);
        if (currentBalance >= balance) {
            return bankAccountRepository.updateBalance(accountId, currentBalance - balance);
        }
        return currentBalance;
    }

    @Override
    public double deposit(long accountId, double balance) {
        double currentBalance = bankAccountRepository.getBalance(accountId);
        return bankAccountRepository.updateBalance(accountId, currentBalance + balance);
    }

    @Override
    public double getBalance(long accountId) {
        return bankAccountRepository.getBalance(accountId);
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
        double fromBalance = bankAccountRepository.getBalance(fromAccount);
        double toBalance = bankAccountRepository.getBalance(toAccount);
        if (fromBalance >= amount) {
            bankAccountRepository.updateBalance(fromAccount, fromBalance - amount);
            bankAccountRepository.updateBalance(toAccount, toBalance + amount);
            return true;
        }
        return false;
    }
}
