package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// x integers between 1 and n
		
		int size = 200;
		
		int [] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = i + 1;
		}
		
		
		int [] arrayNew = new int[size];
		for (int i = 0; i < size; i++) {
			arrayNew[i] = i + 1;
		}
				
		
		for (int i = 1; i < size; i++) {
			int num2 = 0;
			for (int j = 1; j < size - 1; j++) {
				num2 = (i + 1) * (j + 1);
				for (int n = 0; n < size; n++) {
					if (arrayNew[n] == num2){
						arrayNew[n] = 0;
						
					}
					if (arrayNew[n] == 1){
						arrayNew[n] = 0;
						
					}

				}
			}
			
		}
		
		
		for (int i = 0; i < size; i++) {
			if (arrayNew[i] != 0) {
				System.out.print(arrayNew[i] + " ");
			}
		}
	}
	
}


