package onlineFitness;

public class Main {

	public static void main(String[] args) {

		Coach coach = new Coach();
		Athlete athlete = new Athlete();
		
		ComandFactory comandFactory = new ComandFactory(athlete);
		CommandInterface standUpCommand = comandFactory.getCommand("STAND UP");
		CommandInterface lieDownCommand = comandFactory.getCommand("LIE DOWN");

		ObserverInterface onlineParticipant1 = new OnlineParticipant("Participant 1");
		ObserverInterface onlineParticipant2 = new OnlineParticipant("Participant 2");
		ObserverInterface onlineParticipant3 = new OnlineParticipant("Participant 3");
		
		athlete.subscribe(onlineParticipant1);
		athlete.subscribe(onlineParticipant2);
		athlete.subscribe(onlineParticipant3);
		
		coach.setCommand(standUpCommand);
		coach.sayCommand();
		
		coach.setCommand(lieDownCommand);
		coach.sayCommand();

		coach.setCommand(standUpCommand);
		coach.sayCommand();
		
		coach.setCommand(lieDownCommand);
		coach.sayCommand();
	}

}