public class PracticeProblem {

	public static void main(String args[]) {

	}
public static int sum(int num, int num2){
	return (num + num2);
}

public static int difference(int num, int num2){
	return (num - num2);
}

public static double product(double num, double num2){
	return (num * num2);
}

public static String removeFirst(String phrase){
	return phrase.substring(1);
}

public static int combinedLength(String phrase, String phrase2){
	return (phrase + phrase2).length();
}

public static boolean isEven(int num){
	return (num%2 == 0);
}

public static boolean isOdd(int num){
	return (!(num%2 == 0));
}

public static boolean isNegative(int num){
	
	return (num < 0);
}

public static boolean isPositive(int num){
	
	return (num > 0);
}
}
