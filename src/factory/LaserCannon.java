package factory;

public class LaserCannon extends AbstractCanon {

	LaserCannon() {
		this.cannonType = E_CannonType.LASER_CANNON;
		this.fireRate = 100;
		this.armor = 30;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
}
