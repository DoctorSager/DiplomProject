package Model;


public class Salary {

    private Double salary;
    private Double partOfSalary;
    private Integer time;
    
    public Salary(Double salary, Double partOfSalary,Integer time) {
        this.salary = salary;
        this.partOfSalary = partOfSalary;
    }
    public Salary() {
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Double getPartOfSalary() {
        return partOfSalary;
    }
    public void setPartOfSalary(Double partOfSalary) {
        this.partOfSalary = partOfSalary;
    }
    public Integer getTime() {
        return time;
    }
    public void setTime(Integer time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Размер ЗП = " + salary + ",\nАванс = " + partOfSalary+",";
    }
    
    
}
