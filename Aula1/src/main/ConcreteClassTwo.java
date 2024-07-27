package main;

public class ConcreteClassTwo extends ConcreteClassOne {
//	Properties
	private int password = 4321;

	
	//Constructors
    public ConcreteClassTwo() {
		
		
	}


	public ConcreteClassTwo(int password) {
		
		this.password = password;
	}
		
//	Behaviors
	@Override
	public int getPasswordClassOne() {
		return this.password;
	}

	public void setPasswordClassOne(int passwordClassOne) {
		this.password = passwordClassOne;
	}
}
