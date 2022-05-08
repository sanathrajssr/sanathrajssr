package week1day2;

public class TwoWheelers {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=12345678945643L;
	boolean isPunctured=false;
	String bikeName="ROYAL ENFIELD";
	double runningKM=345678.2345675;
	

	public static void main(String[] args) {
		TwoWheelers two=new TwoWheelers();
		System.out.println(two.noOfWheels);
		System.out.println("noOfMirrors"+two.noOfMirrors);
		System.out.println("chassisNumber"+two.chassisNumber);
		System.out.println("isPunctured"+two.isPunctured);
		System.out.println("bikeName"+two.bikeName);
		System.out.println("runningKM"+two.runningKM);
		

	}

}
