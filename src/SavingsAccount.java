import sun.awt.SunGraphicsCallback;

import java.util.ArrayList;

public class SavingsAccount extends CreditUnion {

    private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();

    public SavingsAccount(String name, String address, String phonenumber){
        super(name, address, phonenumber);
    }

    @Override
    public boolean createAccount(SavingsAccount savingsAccount) {
        for (int i = 0; i < savingsAccounts.size(); i++) {
            SavingsAccount savings = savingsAccounts.get(i);
            String name = savings.getName();
            String address = savings.getAddress();
            if (savingsAccount.getName().equals(savingsAccount.getName()) && savingsAccount.getAddress().equals(savingsAccount.getAddress())) {
                System.out.println("You already have a savings account. You may apply for a loan account instead");
                return false;
            }
        }
        savingsAccounts.add(new SavingsAccount(savingsAccount.getName(), savingsAccount.getAddress(), savingsAccount.getPhoneNumber()));
        return true;
    }
}
