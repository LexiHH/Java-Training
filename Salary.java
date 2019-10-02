class Salary{
	public static void main(String[] args){
		String name = "Peter";
		int salary = 2100;
		double tax, net;
		
		if(salary>=1500) {
			tax = salary*0.21;
			net = salary - tax;
			System.out.println("Salary: " + salary);
			System.out.println("Tax: " + tax);
			System.out.println("Net: " + net);
		}
		
		else {
			System.out.println("No Tax");
		}

	}
}