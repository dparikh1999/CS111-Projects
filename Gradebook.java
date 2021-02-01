public class Gradebook {
	public static void main(String[] args) {
		
		String[] roster = new String[30];
			double[][] grades = new double[30][20];
	}
	
	public static boolean addStudent(String[] r, String stud) {
		
		for (int i=0; i<r.length; i++) {
			if (stud.equals(r[i])) {
				return false;
			}
			if (r[i] == null) {
				r[i]=stud;
				return true;
			}
		}
		return false;
	}
	public static int findStudent(String[] r, String name) {
		for (int i=0; i<r.length; i++) {
			if (r[i] == null) {
				break;
			}else if (name.equals(r[i])) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static boolean addGrade(String[] r, double[][] g, String name, int assn, double grade) {
		int pos = findStudent(r, name);
		if (pos ==-1 || 
			grade<0 || 
			assn<1 || 
			assn>g[0].length) {
			return false;
		}
		g[pos][assn-1]=grade;
		return true;
	}
	
	public static double classAverage(double[][] g, String[] r) {
		double sum=0;
		int count = 0;
		
		for (int i=0; i<g.length-1; i++) {
			if (r[i]!=null) {
				for (int k=0; k<g[i].length-1; k++) {
					count++;
					sum += g[i][k];
				}
			}else {
				break;
			}
		}
		return (sum)/(count);
	}
	
	public static double assnAverage(double[][] g, int assn) {
		if (assn<1 || assn>g[0].length) {
			return -1;
		}
		double sum = 0;
		for (int i=0; i<g.length; i++) {
			sum+=g[i][assn-1];
		}
		return sum/(g.length);
	}
	
	public static double studentAverage(double [][] g, String[] roster, String student) {
		double sum = 0;
		int index = findStudent(roster, student);
		if (index==-1) {
			return -1;
		}
		for (int i=0; i<g[index].length; i++) {
			sum += g[index][i];
		}
		return sum/(g[index].length);
	}
}
