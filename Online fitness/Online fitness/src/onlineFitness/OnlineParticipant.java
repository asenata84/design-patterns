package onlineFitness;

public class OnlineParticipant implements ObserverInterface {

	private String name;
	private String move;
	private ObservableInterface athlete;
	
	public OnlineParticipant(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.athlete == null) {
			System.out.println(this.name + " has no move set");
			return;
		}
		
		this.move = this.athlete.getUpdate();
		System.out.println(this.name + " updated with " + this.move);
	}

	@Override
	public void setAthlete(ObservableInterface athlete) {
		this.athlete = athlete;
	}

}