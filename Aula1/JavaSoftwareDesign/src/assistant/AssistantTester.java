package assistant;

import main.AbstractClass;
import main.ConcreteClass;
import main.ConcreteClassOne;
import main.ConcreteClassTwo;

public class AssistantTester {
	public static void main(String[] args) {
		ConcreteClassOne ccOne = new ConcreteClassOne();
		System.out.println(ccOne.getPasswordClassOne());

		ConcreteClassTwo ccTwo = new ConcreteClassTwo();
		System.out.println(ccTwo.getPasswordClassOne());

		System.out.println();

		AbstractClass acOne = new ConcreteClass();
		System.out.println(acOne.password);
		System.out.println(acOne.getPassword());
		System.out.println(acOne.sayHi());

		ConcreteClass ccThree = new ConcreteClass();
		System.out.println(ccThree.password);
		System.out.println(ccThree.getPassword());
		System.out.println(ccThree.sayHi());
	}
}
