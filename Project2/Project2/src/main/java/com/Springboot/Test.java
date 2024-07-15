package com.Springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        BankAccountController controller = (BankAccountController) context.getBean("bankAccountController");

        System.out.println("Initial Balance for Account 1: " + controller.getBalance(1L));
        System.out.println("Depositing 500 to Account 1: " + controller.deposit(1L, 500));
        System.out.println("Balance after deposit for Account 1: " + controller.getBalance(1L));
        System.out.println("Withdrawing 200 from Account 1: " + controller.withdraw(1L, 200));
        System.out.println("Balance after withdrawal for Account 1: " + controller.getBalance(1L));

        System.out.println("Initial Balance for Account 2: " + controller.getBalance(2L));
        System.out.println("Transferring 300 from Account 1 to Account 2: " + controller.fundTransfer(1L, 2L, 300));
        System.out.println("Balance for Account 1 after transfer: " + controller.getBalance(1L));
        System.out.println("Balance for Account 2 after transfer: " + controller.getBalance(2L));
    }
}
