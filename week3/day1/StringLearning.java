package week3.day1;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "TestLeaf";
		String anotherName = "Testleaf";
		
		//check the count of character of e
		char expChar = 'e';
		int count = 0;
		char[] chararray = name.toCharArray();
		for(int i = 0 ;i<name.length();i++)
		{
			if (chararray[i]==expChar)
			{
				count++;
			}
		}
		System.out.println(count);
		//Comparing two string
		boolean compare = name.equals(anotherName);
		System.out.println(compare);
		boolean compareIgnore = name.equalsIgnoreCase(anotherName);
		System.out.println(compareIgnore);
		
		//Display String
		//char[] chararray = name.toCharArray();
		
		for(int i = 0 ;i<name.length();i++)
		{
			System.out.println(chararray[i]);
			
		}
		boolean contains = name.contains("Lea");
		System.out.println(contains);
		
		//String Reverse
		String reverse = "AMAZON";
		char[] chararrayReverse = reverse.toCharArray();
		System.out.println(chararrayReverse[5]);
		int length = reverse.length();
		System.out.println(length);
		for(int i = length-1;i>=0;i--)
		{
			System.out.println(chararrayReverse[i]);
			
		}
		
		

		
	}

}
