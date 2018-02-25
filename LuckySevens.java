public class LuckySevens {
	public static void main(String[] args) {
		
		System.out.println("Enter lower end of range: ");
		int lower = IO.readInt();
		System.out.println("Enter upper end of range: ");
		int upper = IO.readInt();
		int counter=0;
		
		if (lower>upper) {
			return;
		}
		
		if (lower==upper) {
			IO.outputIntAnswer(0);
			return;
		}
		
		if (lower<0 && upper<=0) {
			int temp = lower;
			lower = Math.abs(upper);
			upper = Math.abs(temp);
			for (int i=lower; i<=upper; i++) {
				int num=i;
				while (num>0) {
					if (num%10==7) {
						counter++;
					}
					num=(num/10);
				}	
			}
		}
		
		else if (lower<0 && upper>=0) {
			int lbound = Math.abs(lower);
			int c1=0;
			int c2=0;
			for (int i=0; i<=lbound; i++) {
				int num = i;
				while (num>0) {
					if (num%10==7) {
						c1++;
					}
					num=(num/10);
				}	
			}
			for (int i=0; i<=upper; i++) {
				int num = i;
				while (num>0) {
					if (num%10==7) {
						c2++;
					}
					num=(num/10);
				}	
			}
			counter = c1 + c2;
		}
		
		else if (lower>=0 && upper>=0) {
			for (int i=lower; i<=upper; i++) {
				int num = i;
				while (num>0) {
					if (num%10==7) {
						counter++;
					}
					num=(num/10);
				}	
			}
		}
		IO.outputIntAnswer(counter);
	}

}
