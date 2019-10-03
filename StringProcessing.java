class StringProcessing {
	public void PrintVertical(String msg) {
		int i= 0;
		for(i = 0; i<msg.length(); i++) {
			System.out.println(msg.substring(i, i+1));
		}
	}
	
	public void WordCount(String msg) {
		int spacecount = 0;
		int i = 0;
		String alpha;
		for(i = 0; i<msg.length(); i++) {
			alpha = msg.substring(i, i+1);
			if(alpha.equals(" ")) {
				spacecount ++;
			}
		}
		System.out.println("We have " + (spacecount + 1) + "words");
	}
	
	public void PrintWordVertical(String msg) {
		String word = "";
		String alpha;
		int i = 0;
		for(; i<msg.length(); i++) {
			alpha = msg.substring(i, i+1);
			if(alpha.equals(" ")) {
				System.out.println(word);
				word = "";
			}
			else {
				word+=alpha;
			}
		}
		System.out.println(word);
	}
	
	public void PrintWordsBackwards(String msg) {
		String word = "";
		String forwards = "";
		String alpha;
		String beta;
		int i = msg.length() - 1;
		int x;
		
		// go backwards until space
		// from space save index
		// from saved index to last index or end print
		
		for(; i>=0; i--) {
			alpha = msg.substring(i, i+1);
			if(alpha.equals(" ")) {
				for(x = (word.length()-1); x>=0; x--) {
					beta = word.substring(x, x+1);
					forwards+=beta;
				}
				System.out.println(forwards);
				forwards = "";
				word = "";
			}
			else {
				word+=alpha;
			}
			if(i == 0) {
				for(x = (word.length()-1); x>=0; x--) {
					beta = word.substring(x, x+1);
					forwards+=beta;
				}
				System.out.print(forwards);
			}
		}
	}
				
}