class change2 {
	public static void main(String[] args) {
		int bill = 1;
		int paid = 50;
		int balance = paid - bill;
		int fifty, twenty, ten, five, two, one;
		
		fifty = balance/50;
		twenty = balance%50/20;
		ten = balance%50%20/10;
		five = balance%50%20%10/5;
		two = balance%50%20%10%5/2;
		one = balance%50%20%10%5%2/1;
		
		if(fifty>0)
		System.out.println("Fifties:" + fifty);
		if(twenty>0)
		System.out.println("Twenties:" + twenty);
		if(ten>0)
		System.out.println("Tens:" + ten);
		if(five>0)
		System.out.println("Fives:" + five);
		if(two>0)
		System.out.println("Twos:" + two);
		if(one>0)
		System.out.println("Ones:" + one);
	}
}