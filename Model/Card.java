package Model;

public class Card extends User {

    private Salary salary;
    private Double balance;
    private Debt debt;


    public Card(String name, Salary salary, Double balance, Debt debt) {
        super(name);
        this.salary = salary;
        this.balance = balance;
        this.debt = debt;
    }
    public Salary getSalary() {
        return salary;
    }
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Debt getDebt() {
        return debt;
    }
    public void setDebt(Debt debt) {
        this.debt = debt;
    }
    @Override
    public String toString() {
        return "Баланс = " + balance +"\n"+ salary +  "\n"+ debt;
    }
    
}
