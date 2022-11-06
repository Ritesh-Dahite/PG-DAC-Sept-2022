import java.util.*;

interface IShape
{
	
	Scanner sc=new Scanner(System.in);
	public void getData();
	public void calArea();
	public void showArea();
}

class Rectangle implements IShape
{
	double length,breadth,area;
	public void getData()
	{
		System.out.print(" Enter Length & Breadth :");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	public void calArea()
	{
		area=length*breadth;
	}
	
	public void showArea()
	{
		System.out.println(" Area of Rectangle = "+area);
	}
}

class Circle implements IShape
{
	double radius,area ;
	
	public void getData()
	{
		System.out.print(" Enter Radius :");
		radius=sc.nextDouble();
	}
	public void calArea()
	{
		area=3.14*radius*radius;
	}
	
	public void showArea()
	{
		System.out.println(" Area Circle = "+area);
	}
}

public class IShapeHandler
{
	public static void main(String[] args)
	{
		
		Rectangle r=new Rectangle();
		r.getData();
		r.calArea();
		r.showArea();
		
		Circle c=new Circle();
		c.getData();
		c.calArea();
		c.showArea();
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java IShapeHandler
 Enter Length & Breadth :25 20
 Area of Rectangle = 500.0
 Enter Radius :25
 Area Circle = 1962.5
 */