package p012_Highly_divisible_triangular_number;

public class Main_012 {

	public static void main(String[] args) {
		int currentTnumber = 0;
		int currentAddition = 1;
		
		while (true) {
			currentTnumber += currentAddition;
			currentAddition++;
			
			int divisors = 0;
			for (int i = 1; i<currentTnumber;i++){
				if(currentTnumber%i==0)
					divisors++;
			}	
			
			if (divisors>500) {
				System.out.println(currentAddition);
				System.out.println(currentTnumber);
				break;
			}
		}

	}

}
