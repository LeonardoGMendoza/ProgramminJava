package main;

public abstract class AbstractClass {
//	Properties
	public int password = 9999;

//	Behaviors
	public int getPassword() {
		return this.password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public abstract String sayHi();
}
