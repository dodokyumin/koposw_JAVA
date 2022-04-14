package Practice;

public class P4 {

	public static void main(String[] args) {
		
		int[] numArr = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int a = 0, b = 0;//2 7 5 12  33  34  25  28  53  99  20 
		System.out.println(numArr.length);
		
		for (int i=0; i<numArr.length-1; i++) {
			
			for (int j=1+i ; j<numArr.length; j++)
				
			if (numArr[i] < numArr[j]) {
				a = numArr[i];
				numArr[i] = numArr[j];
				numArr[i] = a;
			} 
			
		}
		
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}

}
