package observer;

public class User implements Observer {

	private String name;
	private int videosToWatch;
	
	public User(String name) {
		this.name = name;
		videosToWatch = 0;
	}
	
	@Override
	public void update() {
			videosToWatch++;
			System.out.println("Hey " + name + "! There is a new video! You have " + videosToWatch + " videos to watch.");
	}

}
