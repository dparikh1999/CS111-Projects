public class PayFee {
	public static void main(String[] args) {
		System.out.println("Enter payment amount: ");
		double payment=IO.readDouble();	
		if (payment<=0) {
			System.out.println("Error: please enter a valid payment account.");
			return;
		}
		
		if (payment<=500 && payment>0) {
			IO.outputDoubleAnswer(10);
		
		}else if (500<payment && payment<5000) {
			if ((payment*.01)>=20) {
				IO.outputDoubleAnswer(payment*0.01);
			}else {
				IO.outputDoubleAnswer(20);
			}
			
		}else if (5000<=payment && payment<10000) {
			if ((payment*.02)>=120){
				IO.outputDoubleAnswer(payment*0.02);
			}else {
				IO.outputDoubleAnswer(120);
			}
			
		}else if (payment==10000) {
			double tax1=10000*.02;
			IO.outputDoubleAnswer(tax1);
			
		}else if (payment>10000 && payment<=15000) {
			double tax1=10000*.02;
			double tax2=(payment-10000)*.03;
			double taxF=tax1+tax2;
			IO.outputDoubleAnswer(taxF);
			
		}else if (payment>15000) {
			double tax1=10000*.02;
			double tax2=5000*.03;
			double tax3=(payment-15000)*.04;
			double totalTax=tax1+tax2+tax3;
			IO.outputDoubleAnswer(totalTax);
		}	
				
}
}