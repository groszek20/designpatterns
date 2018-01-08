package factory;

public abstract class AbstractCanon implements I_AbstractCannon{
	protected E_CannonType cannonType;
	protected int fireRate;
	protected int armor;
	protected int price;
	
	@Override
	public E_CannonType getCannonType() {
		return cannonType;
	}
	
	@Override
	public int getFireRate() {
		return fireRate;
	}
	
	@Override
	public int getArmor() {
		return armor;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "AbstractCanon [cannonType=" + cannonType + ", fireRate=" + fireRate + ", armor=" + armor + ", price="
				+ price + "]";
	}
	
}
