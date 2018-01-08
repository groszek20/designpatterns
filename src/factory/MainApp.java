package factory;

public class MainApp {

	public static void main(String[] args) {
		CannonsCreator cannonsCreator = CannonsCreator.getInstance();
		I_AbstractCannon laserCannon = cannonsCreator.create(E_CannonType.LASER_CANNON);
		I_AbstractCannon plazmaCannon = cannonsCreator.create(E_CannonType.PLAZMA_CANNON);
		I_AbstractCannon machineCannon = cannonsCreator.create(E_CannonType.MACHINE_CANNON);
		
		System.out.println(laserCannon);
		System.out.println(plazmaCannon);
		System.out.println(machineCannon);
	}

}
