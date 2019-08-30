package practice1;

public abstract class Calculate {

	ExcuteCalculate excuteCalculate;
	
	public Calculate() {}
	
	public abstract void display(int A, int B);

	public void performCalculate(int A, int B) {
		excuteCalculate.excute(A, B);
	}
	
}
