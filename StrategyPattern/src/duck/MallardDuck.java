package duck;

public class MallardDuck extends Duck{

	@Override
	public void display() {
		System.out.println("I´m Mallard duck!");
		
	}
	
	public MallardDuck () {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	
	

}
