public class ArrayMaths {
	public static void main(String[] args) {
		int no1, no2;
		float result = 0;
		String sign;
		
		try {
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[2]);
			sign = args[1];
			if(sign.equals("+")) {
				result = no1 + no2;
			}
			if(sign.equals("-")) {
				result = no1 - no2;
			}
			if(sign.equals("x")) {
				result = no1*no2;
			}
			if(sign.equals("/")) {
				result = no1 / no2;
			}
			System.out.println("Result: " + result);
		}
		catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("Please send three values");
		}
		catch(ArithmeticException x) {
			System.out.println("Please do not divide by zero");
		}
		catch(NumberFormatException x) {
			System.out.println("Only numbers for array members one and three please");
		}
	}
}