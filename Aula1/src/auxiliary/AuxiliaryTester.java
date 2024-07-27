package auxiliary;


import main.AbstractClass;
import main.ConcreteClass;
import main.ConcreteClassOne;
import main.ConcreteClassTwo;
import main.Tools;

public class AuxiliaryTester {
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
		System.out.println(ccThree.sayHi() +"\n");
		
		System.out.println(ccThree.interfaceVar);
		
		
		//clase concreta pode  abstrata
		AuxilliaryClass aux = new AuxilliaryClass();
		
		System.out.println(aux.interfaceVar+"\n");
		aux.interfaceMethodOne();
		aux.interfaceMethodTwo();
		
		System.out.println();
//		Tools t01 = new Tools(); 
//		Tools t02 = new Tools(); 
//		
//		
//		t01.option ='B';
//		t01.option ='c';
////		
//		System.out.println(t01.option);
//		System.out.println(t02.option);
	    System.out.println(Tools.option);
		 Tools.option = 'A';
	     Tools.option = 'D';
	     System.out.println(Tools.option);
		
	     System.out.println();
//		Tools.printOption();
//	    System.out.println(Tools.option);
		
	   System.out.println("Um texto qualquier");
	   Tools.display(25.32);
	   Tools.display(25.32f);
	   
//	   double value = Tools.sum(10,15.976);
	   Tools.sum(10,15.976);
	  System.out.println((Tools.sum(10, 15.976))+ 100);
	  System.out.println("fIM DO ROTEIRO 6");
	  System.out.println("INICIO DO ROTEIRO 7");
//	  ConcreteClassTwo cc4 = new ConcreteClassTwo(7890);
//	  ConcreteClass cc5 = new ConcreteClass(7890);
//	  AbstractClass cc6 = new ConcreteClass(7890);
	}
}
