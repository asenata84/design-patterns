package onlineFitness;

public class Coach {

	private CommandInterface command;
	
	public void setCommand(CommandInterface command) {
		this.command = command;
	}

	public void sayCommand() {
		System.out.println("Coach say to the athlete: ");
		this.command.execute();
	}
	
}