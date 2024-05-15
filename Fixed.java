import java.lang.*;
public class Fixed extends Account{
    private int year;

    public Fixed(){}
    public Fixed(int accnum, String acctype, double balance,int year){
        super(accnum,acctype,balance);
        this.year=year;
    }

    public void setYear(int year){
        this.year=year;
    }public int getYear(){
        return year;
    }

    public void details(){
        super.details();
        System.out.println("Year: "+year);
    }
}
