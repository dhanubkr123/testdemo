package testtry;

public class testtry {
	public static void main(String [] args)
	{
	int a=10;
	// add value
	int b=2;
	int []c = {1,5,9};
	
try
	{
		int d =a/b;
		System.out.println(d);
		System.out.println(c[9]);
	}
	
	
	
	catch(ArithmeticException e)
	{
		System.out.println("b=0 change the value");
	}
	
	catch(ArrayIndexOutOfBoundsException r)
	{
		System.out.println(c[2]);
	}
	
	catch(Exception x)

	{
		System.out.println("last catch");
	}
}
}
