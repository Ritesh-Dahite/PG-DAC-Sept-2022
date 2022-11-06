class FinalBank
{
	final String welcome="Welcome to Banking Sector";
	FinalBank()
	{
		System.out.println(welcome);
	}

}

class Banks extends FinalBank
{
	Banks(String bank)
	{
		System.out.println("This is "+bank+" bank");
	}
}

final class Branch extends Banks
{
	Branch(String bank,String br)
	{
		super(bank);
		System.out.println("This is "+br+" branch");
	}
}

public class FinalAndConstructorUse
{
	public static void main(String[] args)
	{
		Branch b1=new Branch("SBI","Pune");
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java FinalAndConstructorUse
Welcome to Banking Sector
This is SBI bank
This is Pune branch
 */