package main;

public class ConcreteClass extends AbstractClass {
//	Properties
//	public int password = 3333;
	public int password;
	
//Constructors
	//constructor padrao mesmo nome da clase
	public  ConcreteClass() {
		
	
	}
	
	//agora sobrecarregar construtor
	public ConcreteClass(int password) {
	 this.password = password;
 }
//	Behaviors
//	@Override
//	public int getPassword() {
//		return this.password;
//	}
	
	public int getPassword() {
		return password;
	}

	@Override
	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String sayHi() {
		return "Hi";
	}
	
	@Override
	public void interfaceMethodTwo() {
		System.out.println("");
	}
}
