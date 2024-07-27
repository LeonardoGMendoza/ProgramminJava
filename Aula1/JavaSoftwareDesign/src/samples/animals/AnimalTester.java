package samples.animals;

public class AnimalTester {
	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.setScientificName("Galeocerdo Cuvier");
		shark.setPopularName("Tubarão Tigre");
		shark.setAge(20);
		shark.setMass(250.0);

		System.out.println(shark.getScientificName());
		System.out.println(shark.getPopularName());
		System.out.println(shark.getAge());
		System.out.println(shark.getMass());

		System.out.println();

		System.out.println(shark.born());
		System.out.println(shark.eat());
		System.out.println(shark.growls());
		System.out.println(shark.reproduces());
		System.out.println(shark.die());
	}
}
