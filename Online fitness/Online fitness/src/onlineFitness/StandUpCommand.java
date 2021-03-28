package onlineFitness;

public class StandUpCommand implements CommandInterface {

	private Athlete athlete;
	
	public StandUpCommand(Athlete athlete) {
		this.athlete = athlete;
	}

	public void execute() {
		this.athlete.standUp();
	}

}