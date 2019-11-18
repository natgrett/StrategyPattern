package duck;

public abstract class Duck {
       FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;
		
		//Konstruktor
		public Duck () {
		}
		
		public abstract void display();
		
		public void performFly() {
			flyBehavior.fly();
		}
		
		public void performQuack () {
			quackBehavior.quack();
		}
		
		public void swim () {
			System.out.println("All ducks float, even decoys!");
		}
		
		public void setFlyBehavior (FlyBehavior fb) {
			flyBehavior = fb;
		}
		
		public void setQuackBehavior (QuackBehavior qb) {
			quackBehavior = qb;
		}
		
		
	  public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.setFlyBehavior(new FlyRockedPowered());
		mallard.performFly();

	}

}
