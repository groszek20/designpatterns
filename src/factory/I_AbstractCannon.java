package factory;

public interface I_AbstractCannon {
	public abstract E_CannonType getCannonType();

	public abstract int getFireRate();

	public abstract int getArmor();

	public abstract int getPrice();
}
