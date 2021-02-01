public class SmallestLargest {
	public static void main(String[] args) {
		System.out.println("Enter terminating value (which should be entered"
				+ " again at end of list):");
		
		double termval = IO.readDouble();
		
		double input = IO.readDouble();
		double largest = input;
		double smallest = input;
		
		if (input==termval) {
			IO.reportBadInput();
			return;
		}
		
		while (input != termval) {
			if (input > largest) {
				largest = input;	
			}else if (input < smallest) {
				smallest = input;
			}
			input = IO.readDouble();
		}
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(largest);
	}

}
