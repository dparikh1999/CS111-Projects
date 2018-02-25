public class TwoLargest {
	public static void main(String[] args) {
		System.out.println("Enter terminating value (which should be entered"
				+ " again at end of list):");
		
		double termval = IO.readDouble();
		double largest=0;
		double secondlargest=0;
		
		double input= IO.readDouble();
		while (input==termval) {
			IO.reportBadInput();
			System.out.println("Enter valid value: ");
			input = IO.readDouble();
			}
		
		double input2 = IO.readDouble();
		while (input2==termval) {
			IO.reportBadInput();
			System.out.println("Enter valid value: ");
			input2 = IO.readDouble();
				}
		
		if (input>input2) {
			largest = input;
			secondlargest = input2;
		}else if (input2>input) {
			largest = input2;
			secondlargest = input;
		}else if (input==input2) {
			largest = input;
			secondlargest = input2;
		}
		
		input = IO.readDouble();
		while (input != termval) {
			if (input>largest) {
			secondlargest=largest;
			largest = input; 
		}else if (input>secondlargest) {
			secondlargest=input;
		}
			input=IO.readDouble();
		}
		
		IO.outputDoubleAnswer(largest);
		IO.outputDoubleAnswer(secondlargest);
	}
}
	


