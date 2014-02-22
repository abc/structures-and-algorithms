
public class Operation {
	
	public static int Solution (String operator, int number1, int number2)
	{
		switch (operator)
		{
			case "+":
				return number1 + number2;
			case "-":
				return number1 - number2;
			case "/":
				return number1 / number2;
			case "*":
				return number1 * number2;
			default:
				return 0;
		}
	}
	public static String Expression (String operator, int number1, int number2)
	{
		switch (operator)
		{
			case "+":
				int result = Solution("+", number1, number2);
				return number1 + " + " + number2 + " = " + result;
			case "-":
				return number1 + " - " + number2;
			case "/":
				return number1 + " / " + number2;
			case "*":
				return number1 + " * " + number2;
			default:
				return "";
		}
	}
	
}
