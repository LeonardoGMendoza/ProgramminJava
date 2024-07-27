package main;

public interface Interface1 {

	final boolean interfaceVar = true;
	
    default void interfaceMethodOne() {
		
		System.out.println("Metodo 1 da interface one");
	}
    
    void interfaceMethodTwo();

}
