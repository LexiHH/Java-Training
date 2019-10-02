class change {
	public static void main(String[] args) {
		int bill = 1;
		int paid = 50;
		int balance = paid - bill;
		
		if(balance>=50) {
			System.out.println("50: " + balance/50);
			balance = balance%50;
		}
		if(balance>=20) {
			System.out.println("20: " + balance/20);
			balance = balance%20;
		}
		if(balance>=10) {
			System.out.println("10: " + balance/10);
			balance = balance%10;
		}
		if(balance>=5) {
			System.out.println("5: " + balance/5);
			balance = balance%5;
		}
		if(balance>=2) {
			System.out.println("2: " + balance/2);
			balance = balance%2;
		}
		if(balance>=1) {
			System.out.println("1: " + balance/1);
			balance = balance%1;
		}
	}
}