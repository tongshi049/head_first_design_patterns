package com.example.designpatterns.builder;

public class TestBuilder {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.Builder(10L)
                .withOwner("TongTongShi")
                .atBranch("AB, CA")
                .openingBalance(123.456)
                .build();

        System.out.println(bankAccount);

        bankAccount.setInterestRate(1.2);

        System.out.println(bankAccount);

        BankAccount bankAccount2 = new BankAccount.Builder(11L)
                .withOwner("LittleDirty")
                .atBranch("GC, CA")
                .openingBalance(777)
                .build();

        System.out.println(bankAccount2);

        Car redCar = new CarBuilder()
                .setColor("red")
                .setWheel(4)
                .build();
        System.out.println(redCar);
    }


}
