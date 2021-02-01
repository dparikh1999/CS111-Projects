public class AverageScores {
	public static void main(String[] args) {
	System.out.println("Enter number of tests: ");
	int numTests=IO.readInt();
	while (numTests<0) {
		System.out.println("Error: input positive number");
		numTests=IO.readInt();
	}
	int sumTests=0;
	int i=0;
	while (i<numTests) {
		System.out.println("Enter score: ");
		double score=IO.readDouble();
		sumTests+=score;
		i++;
	}
	double average=sumTests/numTests;
	System.out.println("Average is "+average);
	}
}
