package practice1;

public class MultiplyCalculator extends Calculate{

	public MultiplyCalculator() {
		excuteCalculate = new Multiply();
	}
	
	@Override
	public void display(int A, int B) {
		System.out.println("입력 받은 수는 " + A + " , " + B +"입니다.");
	}

	
	
}
