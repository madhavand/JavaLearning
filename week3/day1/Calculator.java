package week3.day1;
public class Calculator {
		public int add(int a,int b) 
		{
		return a+b;
		}
		public int add(int a,int b,int c)
		{
		return a+b+c;
		}
		public double multiply(double a,double b) 
		{
		return a*b;
		}
		public void multiply(int a,double b) 
		{
		System.out.println(a*b);
		}
			
		public static void main(String[] args)
		{
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(2, 3, 4));
		calc.add(2, 3);
		calc.add(2, 3, 4);
		calc.multiply(15, 10);
		calc.multiply(2, 100);
		}
}
