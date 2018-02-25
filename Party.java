public class Party {
	public static void main(String[] args) {
	System.out.println("Enter number of people attending party: ");
		int numberPeople=IO.readInt();
	System.out.println("Enter number of slices per person: ");
		int slicePerPerson=IO.readInt();
	System.out.println("Enter number of cans per person: ");
		int cansPerPerson=IO.readInt();
	System.out.println("Enter cost of one pizza pie: ");
		double costPizzaPie=IO.readDouble();
	System.out.println("Enter number of slices in a pie: ");
		int numberSlicesInPie=IO.readInt();
	System.out.println("Enter cost of a case of soda: ");
		double costCaseSoda=IO.readDouble();
	System.out.println("Enter number of cans in a case of soda: ");
		int cansInCase=IO.readInt();
	
	int totalSlices=numberPeople*slicePerPerson;
	int totalCans=numberPeople*cansPerPerson;
	double totalPies=((double)totalSlices/numberSlicesInPie);	
		double roundedPies= Math.ceil(totalPies);
		
	double totalCases=((double)totalCans/cansInCase);	
		double roundedCases=Math.ceil(totalCases);
	
		
	double costPizza=roundedPies*costPizzaPie;
	double costSoda=roundedCases*costCaseSoda;
	double result=costPizza+costSoda;
	
	IO.outputDoubleAnswer(Math.round(result*100.0)/100.0);
	}
}
