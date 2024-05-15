import java.util.*;
import java.lang.*;
public class Customer {
    private String name;
    private Account acc[];

    public Customer(){}
    public Customer(String name,int size){
        this.name=name;
        acc= new Account [size];
    }

    public void setName(String name){
        this.name=name;
    }public String getName(){
        return name;
    }
    public void insertacc(Account a){
        int flag=0;
        for(int i=0; i<acc.length; i++){
            if(acc[i]==null){
                acc[i]=a;
                flag=1;
                break;
        }
    }if(flag==1){
        System.out.println("Account Created");
    }else{
        System.out.println("Nothing inserted yet!");
    }
}

public void deleteacc(int accnum){
    for(int i=0; i<acc.length;i++){
        if(acc[i] != null && accnum==acc[i].getAccnum()){
            acc[i]=null;
        }
    }System.out.println("Account Deleted");
}

public void deposit(int accnum,double d){
    for(int i=0;i<acc.length;i++){
    if(acc[i]!=null && acc[i].getAccnum()==accnum){
    double newbal=acc[i].getBalance()+d;
    acc[i].setBalance(newbal);
    System.out.println("\tDeposit Successfull!\n\tCurrent Balance: "+acc[i].getBalance()+" tk");
    break;
    }
}
}
public void withdraw(int accnum,double d){
    for(int i=0;i<acc.length;i++){
        if(acc[i]!=null && acc[i].getAccnum()==accnum && acc[i].getBalance()>=d){
            if(acc[i].getBalance()>=d){
            double newbal=acc[i].getBalance()-d;
            acc[i].setBalance(newbal);
            System.out.println("\tWithdraw Succuessfull!\n\tCurrent Balance: "+acc[i].getBalance()+" tk");
            break;
        }else{
            System.out.println("Insufficient Balance.");
            break;
        }
    }
}
}
public void details(){
    System.out.println("Name: "+name);
    for(int i=0; i<acc.length;i++){
        if(acc[i]!=null){
            acc[i].details();
        }
    }System.out.println();
}
}