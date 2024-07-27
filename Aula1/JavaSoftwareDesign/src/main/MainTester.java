package main;

public class MainTester {
	public static void main(String[] args) {
		ConcreteClassOne ccOne = new ConcreteClassOne();
		System.out.println("Old password of ccOne: " + ccOne.getPasswordClassOne());
		ccOne.setPasswordClassOne(6789);
		System.out.println("New password of ccOne: " + ccOne.getPasswordClassOne() + "\n");

		ConcreteClassTwo ccTwo = new ConcreteClassTwo();
		System.out.println("Old password of ccTwo: " + ccTwo.getPasswordClassOne());
		ccTwo.setPasswordClassOne(9876);
		System.out.println("New password of ccTwo: " + ccTwo.getPasswordClassOne());

		AbstractClass acOne = new ConcreteClass();
	}
}
