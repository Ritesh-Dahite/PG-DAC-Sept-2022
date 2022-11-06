class StringUsingConstructor
{
	public static void main(String[] args)
	{
		char ch[]={'H','E','L','L','O'};
		
		String str1=new String(ch);
		
		String str2=new String("HELLO");
		
		System.out.println("String using char array ="+str1);
		System.out.println("String using new keyword ="+str2);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java StringUsingConstructor
String using char array =HELLO
String using new keyword =HELLO
 */