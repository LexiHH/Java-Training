class Tax{
	public static void main(String[] args){
		String name = "Peter";
		int salary = 2000;
		double tax = 0, net;
		
		if(salary>=2000) {
			tax = salary*0.21;

		}
		
		if(salary<2000) {
			tax = salary*0.15;
		}
					
		net = salary - tax;
		System.out.println("Salary: " + salary);
		System.out.println("Tax: " + tax);
		System.out.println("Net: " + net);
	}
}