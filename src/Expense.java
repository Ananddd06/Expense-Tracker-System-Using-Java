package src;
import java.time.LocalDateTime;

public class Expense {
    private int id;
    private String category;
    private double amount ;
    private LocalDateTime time;    

    public Expense(int id , String category , double amount){
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getCategory(){
        return category;
    }

    public double getAmount(){
        return amount;
    }

    public LocalDateTime getTime(){
        return time;
    }
}
