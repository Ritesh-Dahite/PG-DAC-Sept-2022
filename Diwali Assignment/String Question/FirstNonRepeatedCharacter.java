import java.util.*;

class FirstNonRepeatedCharacter 
{
    static char count[] = new char[500];
	
    static void getCharCountArray(String str)
    {
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)]++;
    }
 
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index=-1;
 
        for (int i=0;i<str.length();i++) 
		{
            if (count[str.charAt(i)]==1) 
			{
                index=i;
                break;
            }
        }
        return index;
    }
	
	
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String :");
		String str=sc.nextLine();  
        int index=firstNonRepeating(str);
 
		if(index==-1)
			System.out.println("Either all characters are repeating or String is empty");
		System.out.println("First non-repeating character is "+str.charAt(index));
    }
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java FirstNonRepeatedCharacter
Enter Any String :
keep to teek
First non-repeating character is p
 */