public class LuckyNines {
	public static void main(String[] args) {
		System.out.println("Enter lower end of range: ");
		int lower = IO.readInt();
		System.out.println("Enter upper end of range: ");
		int upper = IO.readInt();
		IO.outputIntAnswer(countLuckyNines(lower,upper));
	}
	
	public static int countLuckyNines(int lowerEnd, int upperEnd) {
		int counter = 0;
		if (lowerEnd>upperEnd) {
			return -1;
		}
		
		if (lowerEnd==upperEnd) {
			return 0;
		}
		
		if (lowerEnd<0 && upperEnd<=0) {
			int temp = lowerEnd;
			lowerEnd = Math.abs(upperEnd);
			upperEnd = Math.abs(temp);
			for (int i=lowerEnd; i<=upperEnd; i++) {
				int num=i;
				while (num>0) {
					if (num%10==9) {
						counter++;
					}
					num=(num/10);
				}	
			}
		}
		
		else if (lowerEnd<0 && upperEnd>=0) {
			int lbound = Math.abs(lowerEnd);
			int c1=0;
			int c2=0;
			for (int i=0; i<=lbound; i++) {
				int num = i;
				while (num>0) {
					if (num%10==9) {
						c1++;
					}
					num=(num/10);
				}
			}
			for (int i=0; i<=upperEnd; i++) {
				int num = i;
				while (num>0) {
					if (num%10==9) {
						c2++;
					}
					num=(num/10);
				}	
			}
			counter = c1 + c2;
		}
		
		else if (lowerEnd>=0 && upperEnd>=0) {
			for (int i=lowerEnd; i<=upperEnd; i++) {
				int num = i;
				while (num>0) {
					if (num%10==9) {
						counter++;
					}
					num=(num/10);
				}	
			}
		}
		return counter;
	}

}
