package Model;



public class Debt {

    private Double debt;
    private Double persents;
    private Integer time;

    
    public Debt(Double debt, Double persents, Integer time) {
        this.debt = debt;
        this.persents = persents;
        this.time = time;
    }
    public Double getDebt() {
        return debt;
    }
    public void setDebt(Double debt) {
        this.debt = debt;
    }
    public Double getPersents() {
        return persents;
    }
    public void setPersents(Double persents) {
        this.persents = persents;
    }
    public Integer getTime() {
        return time;
    }
    public void setTime(Integer time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Долг = " + debt + ",\nПроценты = " + persents + ",\nСрок = " + time + "мес.";
    }
    
}