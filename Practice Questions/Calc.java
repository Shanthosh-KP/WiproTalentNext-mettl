import java.util.*;
class Calculator
{
	public static void powerInt(int num1,int num2)
	{
		int d1 = num1;
		int d2 = num2;
		double p = Math.pow(d1,d2);
		System.out.println(p);
	}
	public static void powerDouble(double num1,int num2)
	{
		double d1 = num1;
		int d2 = num2;
		double p = Math.pow(d1,d2);
		System.out.println(p);
	}
}
class Calc
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	Calculator.powerInt(a,b);
    	Calculator.powerDouble(a,b);    	
    }
}
