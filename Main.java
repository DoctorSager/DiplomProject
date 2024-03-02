import Model.Card;
import Model.Debt;
import Model.Salary;
import Model.User;

public class Main {
    public static void main(String[] args) {
        
        User user1 = new Card("олежа",
        new Salary(25000.5,5000.5,2),
        0.0,
        new Debt(150000.5, 15.5, 36));

        System.out.println(user1);


    
    }
}
