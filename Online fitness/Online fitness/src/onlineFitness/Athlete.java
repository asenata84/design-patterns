package onlineFitness;

import java.util.ArrayList;
import java.util.List;

public class Athlete implements ObservableInterface{

	private String move;
	private List<ObserverInterface> observers = new ArrayList<>();
	
	public void standUp() {
		System.out.println("STAND UP");
		this.setMove("STAND UP");
	}
	
	public void lieDown() {
		System.out.println("LIE DOWN");
		this.setMove("LIE DOWN");
	}
	
	@Override
	public void subscribe(ObserverInterface observer) {
		this.observers.add(observer);
		
		observer.setAthlete(this);
	}

	@Override
	public void unsubscribe(ObserverInterface observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(ObserverInterface observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.move;
	}

	public void setMove(String move) {
		this.move = move;
		this.notifyObservers();
	}
}