package example1;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void Fly() {
		System.out.println("저는 못 날아요");
	}

}
