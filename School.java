class School{
	public static void main(String[] args){
		int physics = 70;
		int chemistry = 80;
		int maths = 90;
		int total = physics + chemistry + maths;
		int percent = total*100/450;
	
		if (percent>=50) {
			System.out.println("Total: " + total);
			System.out.println("Percent: " + percent);
			System.out.println("You have passed the exam");
		}
		else  {
			System.out.println("You have failed the exam");
		}
	
	}
}