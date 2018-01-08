package factory;

public class MachineCannon extends AbstractCanon {
	MachineCannon() {
		this.cannonType = E_CannonType.MACHINE_CANNON;
		this.fireRate = 200;
		this.armor = 40;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}
