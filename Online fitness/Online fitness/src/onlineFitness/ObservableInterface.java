package onlineFitness;

public interface ObservableInterface {
	void subscribe(ObserverInterface observer);
	void unsubscribe(ObserverInterface observer);
	void notifyObservers();
	
	String getUpdate();
}
