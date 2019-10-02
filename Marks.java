class Marks {
	private int phy, che, mat;
	
	public void physics(int p1) {
		if(p1>0 & p1<150) {
			phy = p1;
		}
		else {
			System.out.println("Invalid physics mark");
		}
	}
	
		public void chemistry(int c1) {
		if(c1>0 & c1<150) {
			che = c1;
		}
		else {
			System.out.println("Invalid chemistry mark");
		}
	}
	
		public void maths(int m1) {
		if(m1>0 & m1<150) {
			mat = m1;
		}
		else {
			System.out.println("Invalid maths mark");
		}
	}
	
	private float total, per;
	
	private void doCalculations() {
		total = phy + che + mat;
		per = total * (float)100/450;
	}
	
	public void showResults() {
		doCalculations();
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + per);
	}
}