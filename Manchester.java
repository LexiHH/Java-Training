class Maths {
	int No1, No2;
	public void doSomething() {
		System.out.println("hello");
		System.out.println("my friend");
	}
	
	public void message() {
		System.out.println("Nationwide");
	}
}

class Manchester {
	public static void main(String[] args) {
		Maths ref;
		ref = new Maths();
		
		ref.doSomething();
		ref.message();
		ref.No1 = 10;
		ref.No2 = 20;
		System.out.println(ref.No1 + ref.No2);
	}
}