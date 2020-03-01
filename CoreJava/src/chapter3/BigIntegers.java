package chapter3;

import java.math.BigInteger;

public class BigIntegers {
	
	public static void main(String[] args) {
		integerBig1(15);
		integerBig2();
		integerBig3();
		integerBig4();
		
	}
	
	//intialise a BigInteger
	public static void integerBig1 (int var)
	{
		BigInteger a = BigInteger.valueOf(var);
		System.out.println(a);
	}
	
	//For longer numbers use a constructor with a string parameter
	public static void integerBig2 ()
	{
		BigInteger reallyBig 
		   = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
		System.out.println(reallyBig);
	}
	
	//Add big numbers
	public static void integerBig3 ()
	{
		BigInteger reallyBigA 
		   = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
		
		BigInteger reallyBigB 
		   = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
		
		BigInteger reallyBigSum = reallyBigA.add(reallyBigB);
		
		System.out.println(reallyBigSum);
	}
	
	//Multiply big numbers
	public static void integerBig4 ()
	{
		BigInteger reallyBigA 
		   = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
		
		BigInteger reallyBigB 
		   = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
		
		BigInteger reallyBigmultiple = reallyBigA.multiply(reallyBigB);
		
		System.out.println(reallyBigmultiple);
	}
}
