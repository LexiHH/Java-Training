class PassMarks {
	private int phy, che, mat, invalid, fail;
	
	public void physics(int p1) {
		if(p1>=0 & p1<=150) {
			phy = p1;
		}
		else {
			System.out.println("Invalid physics mark");
			invalid ++;
		}
		if(p1>=0 & p1<60) {
			fail ++;
		}
	}
	
		public void chemistry(int c1) {
		if(c1>=0 & c1<=150) {
			che = c1;
		}
		else {
			System.out.println("Invalid chemistry mark");
		}
		if(c1>=0 & c1<60) {
			fail ++;
		}
	}
	
		public void maths(int m1) {
		if(m1>=0 & m1<=150) {
			mat = m1;
		}
		else {
			System.out.println("Invalid maths mark");
		}
		if(m1>=0 & m1<60) {
			fail ++;
		}
	}
	
	private float total, per;
	
	private void doCalculations() {
		total = phy + che + mat;
		per = total * (float)100/450;
	}
	
	public void showResults() {
		doCalculations();
		if(invalid == 0) {
			if(fail == 0) {
				System.out.println("You have passed the exam");
			}
			if(fail == 1) {
				System.out.println("Retake the exam");
			}
			if(fail == 2) {
				System.out.println("Repeat the course");
			}
			if(fail == 3) {
				System.out.println("Go home");
			}
			System.out.println("Total Marks: " + total);
			System.out.println("Percentage: " + per);
		}
		else {
			System.out.println("Can't calculate the result");
		}
	}
}