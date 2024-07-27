package samples.animals;

public abstract class Animal {
	private String scientificName;
	private String popularName;
	private int age;
	private double mass;

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
