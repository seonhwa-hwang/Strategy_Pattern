package practice1;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("input the first number");
			int A = sc.nextInt();
			System.out.println("input the second number");
			int B = sc.nextInt();			
			System.out.println("input one of +,-,*,/");
			String C = sc.next();
			
			switch (C) {
			case "+":
				Calculate plus = new PlusCalculator();
				plus.display(A, B);
				plus.performCalculate(A, B);
				System.out.println("setter를 이용해서 -계산으로 바꿔 볼게요");
				plus.setExcuteCalculate(new Minus());
				plus.performCalculate(A, B);
				
				break;
			case "-":
				Calculate minus = new MinusCalculator();
				minus.display(A, B);
				minus.performCalculate(A, B);
				System.out.println(" ");
				break;
			case "*":
				Calculate multi = new MultiplyCalculator();
				multi.display(A, B);
				multi.performCalculate(A, B);
				System.out.println(" ");
				break;
			case "/":
				Calculate divi = new DivideCalculator();
				divi.display(A, B);
				divi.performCalculate(A, B);
				System.out.println(" ");
				break;
			}
			
		}

		
	}

}
