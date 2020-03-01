package chapter3;

public class Arrays {
	public static void main(String[] args) {
		array1();
		array2();
	}
	
	//Initalise, assign and iterate array
	public static void array1 ()
	{
		// 100 of zero integers inserted from 0-99 in array
		int[] a = new int[100];
		
		//Selecting what values will be this time
		int[] b = {1,2,3,4,5};
		
		//Change values of b array
		b = new int[] {5,4,3,2,1};
		
		//Iterate through array and print values
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		
	}
	
	//Fill array with values from 1 to 100
	public static void array2()
	{
		int[] a = new int[100];
		
		for(int i = 0; i < 100; i++)
		{
			a[i] = i + 1;
		}
		
		for (int element : a)
		{
			System.out.println(element);
		}
	}
	
	
}
