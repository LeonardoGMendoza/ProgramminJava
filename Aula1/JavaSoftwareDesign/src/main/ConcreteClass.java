package main;

public class ConcreteClass extends AbstractClass {
//	Properties
	public int password = 3333;

//	Behaviors
	@Override
	public int getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String sayHi() {
		return "Hi";
	}
}
