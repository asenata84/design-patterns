package onlineFitness;

public class LieDownCommand implements CommandInterface {

	private Athlete athlete;
	
	public LieDownCommand(Athlete athlete) {
		this.athlete = athlete;
	}

	@Override
	public void execute() {
		this.athlete.lieDown();
	}

}