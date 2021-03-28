package onlineFitness;

public class ComandFactory {
	private Athlete athlete;
	
	public ComandFactory(Athlete athlete) {
		this.athlete = athlete;
	}
	
	public CommandInterface getCommand(String name) {
		
		if(name == "STAND UP") {
			return new StandUpCommand(this.athlete);
		}
		
		if(name == "LIE DOWN") {
			return new LieDownCommand(this.athlete);
		}
		
		System.out.println("Unknown factory: " + name);
		return null;
	}
	
}