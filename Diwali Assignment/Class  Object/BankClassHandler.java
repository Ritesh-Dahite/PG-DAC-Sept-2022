class Bank
{
    int p,r,n;
    Bank(int p,int r,int n)
	{
		this.p=p;
		this.r=r;
		this.n=n;
	}
	
    void interest()
	{
        Interest in=new Interest();
        in.display();
    }
    class Interest 
    {
        void display() 
        {
            int interest = (p*r*n)/100;
            System.out.println("Interest for "+p+" rs with "+r+"% rate for "+n+" years =: Rs. " +interest);
        }
    }
}
public class BankClassHandler 
{
    public static void main(String args[]) 
    {
        Bank b=new Bank(1000,5,4);
        b.interest();
    }
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java BankClassHandler
Interest for 1000 rs with 5% rate for 4 years =: Rs. 200

D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>
 */