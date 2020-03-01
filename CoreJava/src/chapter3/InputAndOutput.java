package chapter3;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class InputAndOutput {
	
	Scanner in = new Scanner(System.in);
	
	

	
	public static void main(String[] args) throws IOException {
		
		InputAndOutput test = new InputAndOutput();
		PrintWriter out = new PrintWriter("myfile.txt", StandardCharsets.UTF_8);

		
	}
	
	public void captureNameAndAge() {
		Scanner in = new Scanner(System.in);
		//capture name
		System.out.println("What is your name?");
		String name = in.nextLine();
				
		//capture age
		System.out.println("What is your age?");
		int age = in.nextInt();
				
		//return name + age
		System.out.println("Hello " + name + ". Congrats on turning " + age);
	}
	
}
