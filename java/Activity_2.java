package Activity;

public class Activity_2 {

	public static void main(String[] args) {
		int[] numbers = {10, 77, 10, 54, -11, 10};
		
		int sum = 0;
		for(int num : numbers) {
			if(num == 10) {
				sum = sum+num;
			}
		}
		
		boolean res=(sum ==30);
		System.out.println(res);
	}

}
