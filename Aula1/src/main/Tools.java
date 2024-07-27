package main;

public class Tools {

	//Properties 
	public  static char option = 'A';
	public   char alternative = 'a';
	
	
	public static void display(Double num) {
		 System.out.println(num);
	}
	
	public static void display(float num) {
		 System.out.println(num);
	}
	
	
	public static double sum(double num1, double num2) {
		 double result = num1 + num2;
		 System.out.println(result);
		 return result;
	}
	
//	public static void sum(double num1, double num2) {
//		 double result = num1 + num2;
//		 System.out.println(result);
////		 return result;
//	}
	
//	public static String display(String str) {
//		 return str;
//	}
//	
//	//esta variavel nao  estatic e variavel de instancia auqi a gente fa z diferente da outra
//	public char alternative = 'a';
//	
//	//Behaviors
//	public  static void printOption() {
//		System.out.println(option);
//	}
//	
//	
//	//uma forma de fazer
//	public  static void printAlternative() {
//		//crie uam vairvael local chaamda alterne
//		
//		char altern = 'z';
//		System.out.println(altern);
//		printOption();
////		printOp();
//	}
//	
//	public  void printOp() {
//		//crie uam vairvael local chaamda alterne
//		
//		System.out.println(option);
//		printOption();
//	}
}
//	
//	//uma forma de fazer
//		public  static char printAlternative() {
//			return 'Z';
//		}
	