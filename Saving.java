import java.lang.*;
public class Saving extends Account{
    private double inrate;

    public Saving(){}
    public Saving(int accnum, String acctype, double balance, double inrate){
        super(accnum,acctype,balance);
        this.inrate=inrate;
    }

    public void setInrate(double inrate){
        this.inrate=inrate;
    }public double getInrate(){
        return inrate;
    }

    public void details(){
        super.details();
        System.out.println("Int. Rate: "+inrate+"%");
    }
}