package facade2_lights;

class LivingRoomLight implements Light {

	@Override
	public void on() {
		System.out.println("Living Room light on.");

	}

	@Override
	public void off() {
		System.out.println("Living Room off.");

	}

}
