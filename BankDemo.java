import java.util.Scanner;
class Bank{
    private int acno;
    private String name;
    private int balance;
    Scanner sc=new Scanner(System.in);
    public void readData()
    {
        System.out.println("Enter Account Details:");
        acno=sc.nextInt();
        name=sc.next();
        balance=sc.nextInt();
    }
    public void showData()
    {
        System.out.println(acno+" "+name+" "+balance);
    }
    public void withdraw()
    {
        System.out.println("Enter amount to be withdraw:");
        int amt=sc.nextInt();
        if(balance-amt>=1000)
        {
            balance=balance-amt;
            System.out.println(amt+" withdraw successfully");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit()
    {
        System.out.println("Enter amount to be deposit:");
        int amt=sc.nextInt();
        balance=balance+amt;
        System.out.println(amt+" deposited successfully");
    }
    public int getacno()
    {
        return acno;
    }

}
public class BankDemo {
    public static void main(String[] args) {
        Bank[] b=new Bank[3];
        Scanner sc=new Scanner(System.in);
        int i,n,f,choice;
        do{
            System.out.println("1:Add Account\n2:Show Account Details\n3:Withdraw\n4:Deposit\n5:Exit\nEnter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    for(i=0;i<b.length;i++)
                    {
                       b[i]=new Bank();
                       b[i].readData(); 
                    }
                    break;
                case 2:
                    for(i=0;i<b.length;i++)
                    {
                        b[i].showData();
                    }
                    break;
                case 3:
                    f=0;
                    System.out.println("Enter Account Number to withdraw the amount:");
                    n=sc.nextInt();
                    for(i=0;i<b.length;i++)
                    {
                        if(n==b[i].getacno())
                        {
                            f=1;
                            b[i].withdraw();
                            break;
                        }
                    }
                    if(f==0)
                    {
                        System.out.println("Account Number not found");
                    }
                    break;
                case 4:
                    f=0;
                    System.out.println("Enter Account Number to deposit the amount:");
                    n=sc.nextInt();
                    for(i=0;i<b.length;i++)
                    {
                        if(n==b[i].getacno())
                        {
                            f=1;
                            b[i].deposit();
                            break;
                        }
                    }
                    if(f==0)
                    {
                        System.out.println("Account Number not found");
                    }
                    break;           
            }
        }while(choice!=5);
    }
}
