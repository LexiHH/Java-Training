class while4 {
	public static void main(String[] args) {
		int A,B;
		A = B = 1;
		while(A <= 10) {
			B = 1;
			while(B <= 10) {
				System.out.println(A);
				B = B + 1;
			}
			A = A + 1;
		}
	}
}
			