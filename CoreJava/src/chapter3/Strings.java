package chapter3;

public class Strings {
	
	static StringBuilder builder = new StringBuilder();
	
	public static void main(String[] args) {
		

	builderAppend("lol");
	builderAppend("123");
	
	String completedString = builder.toString();
	
	System.out.println(completedString);
	}
	
	public static void builderAppend(String var) {
		builder.append(var);
	}

	
}

