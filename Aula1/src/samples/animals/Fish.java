package samples.animals;

public abstract class Fish extends Chordate implements Aquatic {
	
	//Properties
	
	//Constructors
	public Fish() {
		
	}
	
    public Fish(String scientificName, String popularName, int age, double mass) {
    	super(scientificName,popularName,age,mass);
	}
	//Behaviors
	@Override
	public String swin() {
		return "Tubarao nadando";
	}
	 
}
