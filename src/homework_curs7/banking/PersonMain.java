package homework_curs7.banking;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setBankSource(new BRD());
        person.makeDeposit();
        person.makeWithdrawal();
    }
}
