package observer;

import java.util.ArrayList;

public class Channel implements Subject {

	private ArrayList<Observer> observerList;
	
	public Channel() {
		observerList = new ArrayList<>();
	}

	public void publishVideo() {
		System.out.println("Channel: Publisching new video.");
		notifyObservers();
	}
	
	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observerList.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observerList ) {
			o.update();
		}
	}
}
