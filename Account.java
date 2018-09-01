public class Account {
    private String name;
    private double balance;
    public Account( String name, double depositAmount ) {
        this.name = name;
        if (depositAmount > 0.0) {
            this.balance = depositAmount;
        }
    }
    public Account( String name ) {
        this(name, 0.0);
    }
    public void deposit( double depositAmount ) {
        if(depositAmount > 0.0) {
            this.balance += depositAmount;
        }
    }
    public void withdraw(double withdrawAmount) {
        double balanceLeft = this.balance - withdrawAmount;
        if( balanceLeft >= 0.0 ) {
            this.balance = balanceLeft;
        } else {
            System.out.printf("Insufficient Balance.%n");
        }
    }
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public double getBalance() {
        return this.balance;
    }

}