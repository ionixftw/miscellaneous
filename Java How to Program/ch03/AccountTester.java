import javax.swing.JOptionPane;
public class AccountTester {
    public static void main(String[] args) {
        Account user1 = new Account("Steve Rogers");
        displayInfo(user1);
        Account user2 = new Account("Bob Marley");
        displayInfo(user2);
        user1.deposit(3.33);
        displayInfo(user1);
        user2.deposit(5.66);
        displayInfo(user2);
        user1.withdraw(7.00);
        displayInfo(user1);
        user1.withdraw(2.13);
        displayInfo(user1);
        user1.deposit(599.99);
        displayInfo(user1);
        user1.withdraw(392.97);
        displayInfo(user1);
        double depositAmount = Double.valueOf(JOptionPane.showInputDialog("Insert deposit amount for user1:"));
        user1.deposit(depositAmount);
        displayInfo(user1);
    }
    public static void displayInfo(Account user) {
        String message = String.format("%s's account balance: %.2f%n%n", user.getName(), user.getBalance());
        System.out.print(message);
    }
}