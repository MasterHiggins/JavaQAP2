package Semester3Java.LearningJava.JavaQAP2;

public class Money {
    private long dollars;
    private long cents;

    //Default constructor
    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    //Constructor with amount
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - this.dollars) * 100);
    }

    //Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    //Method to add otherAmount to this object
    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents / 100;
        totalCents %= 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    //Method to subtract otherAmount from this object
    public Money subtract(Money otherAmount) {
        long totalCents = this.cents - otherAmount.cents;
        long totalDollars = this.dollars - otherAmount.dollars;
        if (totalCents < 0) {
            totalDollars--;
            totalCents += 100;
        }
        return new Money(totalDollars + totalCents / 100.0);
    }

    //Method to compare this object with otherObject
    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars) {
            return 1;
        } else if (this.dollars < otherObject.dollars) {
            return -1;
        } else {
            if (this.cents > otherObject.cents) {
                return 1;
            } else if (this.cents < otherObject.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    //Method to check if this object is equal to otherObject
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    //Method to convert this object to string
    public String toString() {
        return "$" + this.dollars + "." + this.cents;
    }
}
