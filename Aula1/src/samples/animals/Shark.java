package samples.animals;

//esta clase e concreta as outras sao abstrata
public class Shark extends Fish {
	
	//specif properties
	private int numberOfFins;
	
	
	//Constructors
	public Shark() {
		
	}
	
	

	public Shark(String ScientificName, String PopularName, int Age, double mass) {
		super(ScientificName,PopularName,Age,mass);
		this.numberOfFins = numberOfFins;
	}



	//specific Behaviors
	@Override
	public String born() {
		return "Tubarão nascendo!";
	}

	@Override
	public String eat() {
		return "Tubarão comendo!";
	}

	@Override
	public String growls() {
		return "Tubarão crescendo!";
	}

	@Override
	public String reproduces() {
		return "Tubarão reproduzindo!";
	}

	@Override
	public String die() {
		return "Tubarão morrendo!";
	}
	
	/*
	@Override
	public String swin() {
		return "Tubarao nadando";
	}
	*/
	
}
