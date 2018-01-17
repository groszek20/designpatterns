package classicBuilder2_z_podpowiedziami_cos_dziala;

public class ZestawAdama implements Builder {

	private ZestawKomputerowy zestaw;

	public ZestawAdama() {
		this.zestaw = new ZestawKomputerowy();
	}

	@Override
	public void buildMonitor() {
		Monior monitor = new Monior();
		monitor.setName("LG");
		monitor.setSize("15 cali");
		zestaw.setMonitor(monitor);
	}

	@Override
	public void buildStacjaRobocza() {
		StacjaRobocza stacjaRobocza = new StacjaRobocza();
		stacjaRobocza.setType("IBM");
		zestaw.setStacjaRobocza(stacjaRobocza);
	}

	@Override
	public ZestawKomputerowy getZestawKomputerowy() {
		return zestaw;
	}

}
