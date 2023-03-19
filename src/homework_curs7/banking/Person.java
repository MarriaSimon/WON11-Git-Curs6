package homework_curs7.banking;

public class Person {
    private BankProvider bankSource;

    public void setBankSource(BankProvider bankSource) {
        this.bankSource = bankSource;
    }

    public void makeWithdrawal() {
        bankSource.withdrawMoney();
    }

    public void makeDeposit() {
        bankSource.depositMoney();
    }
}
