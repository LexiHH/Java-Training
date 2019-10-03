class Account2 {
	public void Tax() {
		System.out.printlnn("Tax Rate: " + 21);
	}
	
	public void Tax(int salary) {
		float t = (float)salary * (float)0.21;
		System.out.println("Your tax is: " + t);
	}
	
	public void Tax(int sal, int rate) {
		float t = (float)sal * (float)rate/100;
		System.out.println("Your tax is: " + t);
	}
}