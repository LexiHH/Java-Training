class Account {
	public void TaxCalculation(int salary) {
		float tax;
		tax = salary * (float)0.21;
		System.out.println("Your tax is " + tax);
	}
	
	public float Tax(int salary) {
		float t = salary * (float)0.21;
		return t;
	}
}