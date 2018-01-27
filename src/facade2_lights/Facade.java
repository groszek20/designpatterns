package facade2_lights;

public class Facade {

	private Light livingRoomLight = new LivingRoomLight();
	private Light hallLight = new HallLight();
	private Door mainDoor = new MainDoor();
	private Door garageDoor = new GarageDoor();
	
	public void lockHome() {
		 System.out.println("------ LOCK HOME -----");
		livingRoomLight.off();
		hallLight.off();
		mainDoor.lock();
		garageDoor.lock();
	}
	
	public void unlocHome() {
		System.out.println("------ UNLOCK HOME -----");
		livingRoomLight.on();
		hallLight.on();
		mainDoor.unloc();
		garageDoor.unloc();
	}
	
	  public void lightOff(){
		  
	      System.out.println("------ LIGHT OFF -----");
	      livingRoomLight.off();
	      hallLight.off();
	   }
	 
	   public void lightOn(){
	 
	      System.out.println("------ LIGHT ON -----");
	      livingRoomLight.on();
	      hallLight.on();
	   }
	
}
