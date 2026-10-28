package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

public abstract class Duck {
		
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
		public Duck() {
}

public abstract void display();

public void performFly() {
	flyBehavior.fly();
}

public void performQuack() {
	quackBehavior.quack();
}

public void swim() {
	System.out.println("All dicks float, even decoys!");
}
}