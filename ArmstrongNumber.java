package Asignmentweek1.day4;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int A=256;
		int sum=0;
		int originalValue=A;
		
		
		while(A>0){
		int rem=A%10;
		sum=sum+(rem*rem*rem);
		A=A/10;
		}
		
		if(sum==originalValue) {
			System.out.println(A+"is a ArmstrongNumber");
		}

		else {
	    
	    	System.out.println(A+"is not a ArmstrongNumber");

}
	
	}
	
}




