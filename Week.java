class Week{
	public void Print(int a) {
		switch(a) {
			case 1: System.out.println("One");
					break;
			case 2: System.out.println("Two");
					break;
			case 3: System.out.println("Three");
					break;
			case 4: System.out.println("Four");
					break;
		}
	}
	
	public void Days(int a) {
		switch(a) {
			case 1: 
			case 3:
			case 5: System.out.println("We finish at 4");
					break;
			case 2:
			case 4: System.out.println("We finish at 5");
					break;
			default: System.out.println("Invalid data");
		}
	}
}