class while3 {
	public static void main(String[] args) {
		int A = 1;
		while(A<=100) {
			if(A %2 == 0) {
				System.out.println(A + "is even");
			}
			else {
				System.out.println(A + "is odd");
			}
			A = A+1;
		}
	}
}