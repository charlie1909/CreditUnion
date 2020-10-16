public class Main {

    public static void main(String[] args){
        SavingsAccount charlie1 =  new SavingsAccount("Charlie Muir", "address", "12345678910");
        boolean account1Created = charlie1.createAccount(charlie1);
        System.out.println("Account 1 created? " + account1Created);
        SavingsAccount charlie2 =  new SavingsAccount("Charlie Muir", "address", "12345678910");
        boolean account2Created = charlie1.createAccount(charlie2);
        System.out.println("Account 2 created? " + account2Created);


        LoanAccount loan1 = new LoanAccount(charlie1, "Developer" , 15000, 500);
        LoanAccount loan2 = new LoanAccount(charlie1, "Developer", 15000, 10000);
        LoanAccount loan3 = new LoanAccount(charlie1, "Developer", 15000, 10000);
        boolean made1 = loan1.createAccount(charlie1);
        boolean made2 = loan2.createAccount(charlie2);
        boolean made3 = loan2.createAccount(charlie2);
        System.out.println(made1);
        System.out.println(made2);
        System.out.println(made3);
    }
}
