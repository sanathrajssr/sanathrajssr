package Assignmentweek1.day3;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		
		int n=50,n1=0,n2=1,n3;
		
		for (int i =1 ;i<n;i++) {
			
			
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
		}
		// TODO Auto-generated method stub

	}

}
