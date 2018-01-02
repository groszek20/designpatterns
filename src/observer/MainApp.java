package observer;

public class MainApp {

	public static void main(String[] args) {
		Channel channel1 = new Channel();
		
		User user1 = new User("Adam");
		channel1.register(user1);
		
		channel1.publishVideo();
		System.out.println("---------");
		
		channel1.publishVideo();
		User user2 = new User("Kote³");
		channel1.register(user2);
		
		
	}

}
