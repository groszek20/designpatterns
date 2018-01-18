package budowniczy;

public class ZestawKomputerowy {
	private String monitor;
	private String drukarka;
	private String grafika;
	private String hdd;
	private String ram;

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public void setDrukarka(String drukarka) {
		this.drukarka = drukarka;
	}

	public void setGrafika(String grafika) {
		this.grafika = grafika;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "ZestawKmputerowy [monitor=" + monitor + ", drukarka=" + drukarka + ", grafika=" + grafika + ", hdd="
				+ hdd + ", ram=" + ram + "]";
	}

	
}
