package com.example.designpatterns.builder;

public class BankAccount {

    // account id
    private long accountNumber;

    // owner name
    private String owner;

    // balance amount
    private double balance;

    // branch name
    private String branch;

    // interest rate
    private double interestRate;

    // getters and setters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /*
    * private constructor
    * so users cannot instantiate a new account by calling the constructor directly
    *
    * */
    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.balance = builder.balance;
        this.branch = builder.branch;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", branch='" + branch + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }

    /*
    * The inner static Builder class
    *
    * */
    public static class Builder {

        // fields we want to use to create a new bank account
        // account id, required
        private long accountNumber;

        // owner name
        private String owner;

        // balance amount
        private double balance;

        // branch name
        private String branch;

        /*
        * constructor
        * construct the Builder with account id
        *
        * */
        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

}
