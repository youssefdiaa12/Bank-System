package accounts_details;

public class account {
    double balance;

void deposit(double amount) {
    balance += amount;
}
void withdraw(double amount) {
    balance -= amount;
}
void balanceEnquiry() {
    System.out.println("Balance: " + balance);
}
void notifyObserver() {
    System.out.println("Notifying observer");
}


}
