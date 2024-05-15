import java.lang.*;
public class Account{
    private int accnum;
    private String acctype;
    private double balance;

    public Account(){}
    public Account(int accnum, String acctype, double balance){
        this.accnum=accnum;
        this.acctype=acctype;
        this.balance=balance;
    }

    public void setAccnum(int accnum){
        this.accnum=accnum;
    }public int getAccnum(){
        return accnum;
    }
    public void setAcctype(String acctype){
        this.acctype=acctype;
    }public String getAcctype(){
        return acctype;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }public double getBalance(){
        return balance;
    }

    public void details(){
        System.out.println("Account No: "+accnum+"\nAccount type: "+acctype+"\nBalance: "+balance+" tk");
    }
}