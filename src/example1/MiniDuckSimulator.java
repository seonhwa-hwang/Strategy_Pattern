package example1;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("-----------------------------------");
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowerd());
		model.performFly();		
	}

}
