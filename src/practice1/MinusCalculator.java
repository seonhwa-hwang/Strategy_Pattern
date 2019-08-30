package practice1;

public class MinusCalculator extends Calculate{

	public MinusCalculator() {
		excuteCalculate = new Minus();
	}
	
	@Override
	public void display(int A, int B) {
		System.out.println("입력 받은 수는 " + A + " , " + B +"입니다.");
	}

	
}
