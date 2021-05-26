
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account artosAccount = new Account("Arto's account",100.00);
        
        artosAccount.deposit(20);
        System.out.println("The balance in Arto's account is " + artosAccount);
    }
}
