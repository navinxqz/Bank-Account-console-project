import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter username: ");
    String n=sc.next();
    Customer c1= new Customer(n,4);

   
    Account a1= new Saving(103,"Saving",30000,3.69);
	Account a2= new Saving();
	Account a3=new Fixed();
	
    c1.insertacc(a1);
    System.out.println("Welcome to the dummy Bank\n"+c1.getName()+"'s current Acc.Details:\n");
    c1.details();

    double d;
    int choice;
    do{
    System.out.println("\tEnter your choice:");
    System.out.println("\t1.Deposit\t2.Withdraw\n\t3.NewAcc\t4.DeleteAcc\n\t5.Details\t6.EXIT");
    System.out.print("Choice: ");
    choice=sc.nextInt();

    switch(choice){
        case 1:    //deposit
        System.out.print("Enter your AccNum:");
        int y=sc.nextInt();

        System.out.print("Amount of deposit: ");
        d=sc.nextDouble();
        c1.deposit(y,d);
        break;

        case 2:   //withdraw
        System.out.print("Enter your AccNum:");
        int u=sc.nextInt();

        System.out.print("Amount of withdraw: ");
        d=sc.nextDouble();
        c1.withdraw(u,d);
        break;

        case 3:    //new acc
		System.out.println("To create new acc input the following data:");
        System.out.println("What type of acc you want to create?\n1.Saving\t2.Fixed");
        int q=sc.nextInt();
        if(q==1){
            System.out.print("AccType: Saving [Selected]\nAccNum: ");
            int w=sc.nextInt();
            System.out.print("Enter Balance: ");
            double e=sc.nextDouble();
            System.out.print("Enter interestRate: ");
            double rate=sc.nextDouble();

            a2=new Saving(w,"Saving",e,rate);
            System.out.print("Congrats! your ");
            c1.insertacc(a2);
        }else if(q==2){
             System.out.print("AccType: Fixed [Selected]\nAccNum: ");
            int w=sc.nextInt();
            System.out.print("Balance: ");
            double e=sc.nextDouble();
            System.out.print("Year: ");
            int r=sc.nextInt();

            a3=new Fixed(w,"Fixed",e,r);
            System.out.print("Congrats! your ");
            c1.insertacc(a3);
        }else{
            System.out.println("Invalid Input!");
        }
		break;
        
        case 4:    //delete acc
        System.out.print("Enter the AccNum you want to Delete: ");
        int o=sc.nextInt();
        System.out.println("Are you sure you want to delete this acc?\n1.yes\t2.no");
        int e=sc.nextInt();
        if(e==1){
            c1.deleteacc(o);
        }else{
            System.out.println("Operation Stopped.");
        }
        break;

        case 5:    //details
        System.out.println("\t__All AccDetails__");
        c1.details();
        break;

        case 6:    //exit
        System.out.println("exiting..");
        break;

        default:
        System.out.println("Invalid Input!");
        break;
    }
}while(choice !=6);
}
}
