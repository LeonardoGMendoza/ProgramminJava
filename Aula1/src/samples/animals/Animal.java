package samples.animals;

public abstract class Animal {
	private String scientificName;
	private String popularName;
	private int age;
	private double mass;

	
	//Constructors
	public Animal() {
		
	}
	
	public Animal(String scientificName, String popularName) {
		this.scientificName = scientificName;
		this.popularName = popularName;
	
	}
	
	
//	public Animal(String scientificName, String popularName, int age, double mass) {
//		this.scientificName = scientificName;
//		this.popularName = popularName;
//		this.age = age;
//		this.mass = mass;
//	}
//	
	
	public Animal(String scientificName, String popularName, int age, double mass) {
		this(scientificName,popularName);
		this.age = age;
		this.mass = mass;
	}
	
	
//	public Animal(String scientificName, String popularName, int age, double mass) {
//		this(scientificName,popularName,age,mass);
//	
//	}
//	
	

	public String getScientificName() {
		return scientificName;
	}


	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getPopularName() {
		return popularName;
	}

	public void setPopularName(String popularName) {
		this.popularName = popularName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public abstract String born();

	public abstract String eat();

	public abstract String growls();

	public abstract String reproduces();

	public abstract String die();
}
