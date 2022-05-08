package Asignmentweek1.day4;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int B=2587;
		int sum=0;
		
		while(B>0) {
			int rem = B%20;
			sum=sum+rem;
			B=B/20;
		}
		
		System.out.println("Sum of digits is:"+sum);
		

	}

}
