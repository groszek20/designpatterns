package factory;

public class PlasmaCannon extends AbstractCanon{
	PlasmaCannon() {
		this.cannonType = E_CannonType.PLAZMA_CANNON;
		this.fireRate = 100;
		this.armor = 60;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}
