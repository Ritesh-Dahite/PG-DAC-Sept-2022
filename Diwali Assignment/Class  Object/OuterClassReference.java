class OuterClass
{
    static OuterClass.InnerClass obj;
    void OuterMethod()
    {
        System.out.println("Outer class Method");
    }
    static public class InnerClass
    {
    	
        public void InnerMethod()
        {
            OuterClass out = new OuterClass();
            out.OuterMethod();
        }
    }
}

public class OuterClassReference
{
	 public static void main(String[] args)
    {
        OuterClass.obj=new OuterClass.InnerClass();
        OuterClass.obj.InnerMethod();
    }
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java OuterClassReference
Outer class Method

D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>
 */



