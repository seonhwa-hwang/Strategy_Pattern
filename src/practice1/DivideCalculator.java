package practice1;

public class DivideCalculator extends Calculate{

	public DivideCalculator() {
		excuteCalculate = new Devide();
	}
	
	@Override
	public void display(int A, int B) {
		System.out.println("입력 받은 수는 " + A + " , " + B +"입니다.");
	}

}
