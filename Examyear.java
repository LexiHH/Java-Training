class Examyear {
	private int totalmarks;
	
	public Examyear(int marks) {
		totalmarks = marks;
	}
	
	public void showResults(int marksobt) {
		float per = (float)marksobt * (float)100/totalmarks;
		if(per >= 60) {
			System.out.println("You have passed the exam");
		}
		else {
			System.out.println("You have failed the exam");
		}
	}
}