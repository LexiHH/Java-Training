class Num{
	public static void main(String[] args){
		int num = 50;
		
		if(num > 500) {
			System.out.println("A");
			if(num > 1000) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}
		else {
			System.out.println("D");
			if(num > 100) {
				System.out.println("F");
			}
			else {
				System.out.println("E");
			}
		}

	}
}