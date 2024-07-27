package main;

public class ConcreteClassTwo extends ConcreteClassOne {
//	Properties
	private int passwordClassOne = 4321;

//	Behaviors
	@Override
	public int getPasswordClassOne() {
		return this.passwordClassOne;
	}

	public void setPasswordClassOne(int passwordClassOne) {
		this.passwordClassOne = passwordClassOne;
	}
}
