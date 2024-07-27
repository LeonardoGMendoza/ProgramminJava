package samples.animals;

public class Shark extends Fish {
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
}
