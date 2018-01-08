package factory;

public class CannonsCreator implements I_CannonCreator {

	private static CannonsCreator Instance;

	private CannonsCreator() {

	}

	public static synchronized CannonsCreator getInstance() {
		if (Instance == null) {
			Instance = new CannonsCreator();
		}
		return Instance;
	}

	@Override
	public I_AbstractCannon create(E_CannonType cannonType) {
		I_AbstractCannon cannon;
		switch (cannonType) {
		case LASER_CANNON:
			LaserCannon laserCannon = new LaserCannon();
			laserCannon.setPrice(200);
			cannon = laserCannon;
			break;

		case MACHINE_CANNON:
			MachineCannon machineCannon = new MachineCannon();
			machineCannon.setPrice(300);
			cannon = machineCannon;
			break;
			
		case PLAZMA_CANNON:
			PlasmaCannon plasmaCannon = new PlasmaCannon();
			plasmaCannon.setPrice(400);
			cannon = plasmaCannon;
			break;
			
		default:
			cannon = null;
			break;
		}
		return cannon;
	}

}
