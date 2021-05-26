
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account MatthewsAccount = new Account("Matthews account", 1000.0);
        Account MyAccount = new Account("My account",0.00);
        
        MatthewsAccount.withdrawal(100.0);
        MyAccount.deposit(100.0);
        
        System.out.println("Matthew's account: " +MatthewsAccount);
        System.out.println("My account: " + MyAccount);
    }
}
