package main;

public abstract class AbstractClass implements Interface1, Interface2{
//	Properties
	public int password;

	
	//Constructors
	public AbstractClass() {
		password = 9999;
		
	}
	
	public AbstractClass(int password) {
		this.password = password;
		
	}
//	Behaviors
	public int getPassword() {
		return this.password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public abstract String sayHi();
}
