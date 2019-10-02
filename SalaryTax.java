class SalaryTax {
	public static void main(String[] args) {
		Account ac = new Account();
		String name;
		int salary;
		float net;
		name = "James";
		salary = 1000;
		net = salary - ac.Tax(1000);
		System.out.println("Net: " + net);
	}
}