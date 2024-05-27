package Semester3Java.LearningJava.JavaQAP2;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    //Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.balance = new Money(0); //Initialized to zero
        this.creditLimit = new Money(limit);
    }

    //Method for balance
    public Money getBalance() {
        return new Money(this.balance);
    }

    //Method for credit limit
    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    //Method for owner information
    public String getPersonals() {
        return this.owner.toString();
    }

    //Method to charge the credit card
    public void charge(Money amount) {
        Money newBalance = this.balance.add(amount);
        if (newBalance.compareTo(this.creditLimit) <= 0) {
            this.balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    //Method to make a payment
    public void payment(Money amount) {
        this.balance = this.balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
