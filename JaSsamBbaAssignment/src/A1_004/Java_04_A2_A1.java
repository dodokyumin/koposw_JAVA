package A1_004;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Java_04_A2_A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> inputStrArr = new ArrayList<>();
		
		int conso = 0, vow = 0;
		String[] vowArr = {"A","I","U","E","O","Y","W"};
		
		
		String inputSortedStr = sc.nextLine().toUpperCase().replaceAll("\\s+", "");
		System.out.println(inputSortedStr);
		
		
		for(int i=0; i<inputSortedStr.length();i++) {
			//inputStrArr에 0~7자리까지 string 형식으로 저장되게끔 
			inputStrArr.add(Character.toString(inputSortedStr.charAt(i)));		
		}
		System.out.println("inputSortedStr : "+inputStrArr);

		System.out.println("inputSortedStr.length() : "+inputSortedStr.length());
		System.out.println(inputStrArr.size());
		System.out.println("ddasdasdasd" + vowArr.length);
		System.out.println(inputStrArr.size());
		for(int i=0; i<vowArr.length; i++ ) {
			//System.out.println("vowArr길이"+vowArr.length); .length에서 문제가 있는데...
			//0<7 7qks
			if(inputStrArr.contains(vowArr[i])) {
				vow++;
			}
			
		}
		System.out.println(vow);
		
			
	}
	

}
