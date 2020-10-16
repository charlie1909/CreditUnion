import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.util.ArrayList;
import java.util.Scanner;

public class LoanAccount extends CreditUnion {

    private double maximumLoanAmount;
    private ArrayList<LoanAccount> loanAccounts = new ArrayList<>();
    private double loanValue;

    public LoanAccount(SavingsAccount account, String occupation, double salary, double loanValue) {
        super(account.getName(), account.getAddress(), account.getPhoneNumber());
        setOccupation(occupation);
        setSalary(salary);
        this.maximumLoanAmount = (salary * 0.5);
        this.loanValue = loanValue;
    }

    @Override
    public boolean createAccount(SavingsAccount account) {
        double totalLoanLeft = (getSalary() * 0.5);
        for (LoanAccount loan : loanAccounts) {
            String name = loan.getName();
            String address = loan.getAddress();
            if (name.equals(account.getName()) && address.equals(account.getAddress())) {
                totalLoanLeft = totalLoanLeft - loanValue;
            }
            if(totalLoanLeft < loanValue){
                System.out.println("You do not have enough to take out a loan this amount.");
                return false;
            }
        }
        loanAccounts.add(new LoanAccount(account, account.getOccupation(), account.getSalary(), loanValue));
        return true;
    }

    public double getMaximumLoanAmount(){
        return maximumLoanAmount;
    }

    public void setMaximumLoanAmount(double maximumLoanAmount) {
        this.maximumLoanAmount = maximumLoanAmount;
    }
}
