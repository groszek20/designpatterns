package budowniczy;

public abstract class Builder {

	protected ZestawKomputerowy zestaw;

	public void newZestaw() {
		zestaw = new ZestawKomputerowy();
	}

	public ZestawKomputerowy getZestaw() {
		return zestaw;
	}

	public abstract void buildMonitor();

	public abstract void buildDrukarka();

	public abstract void buildRam();

	public abstract void buildGrafika();

	public abstract void buildHdd();

}
