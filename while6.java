class while6 {
	public static void main(String[] args) {
		int A,B;
		A = B = 1;
		while(A<=10) {
			B = 1;
			while(B<=A) {
				System.out.print(B);
				if(B<A) {
					System.out.print(",");
				}
				B = B + 1;
			}
			System.out.println(".");
			A = A + 1;
		}
	}
}
			