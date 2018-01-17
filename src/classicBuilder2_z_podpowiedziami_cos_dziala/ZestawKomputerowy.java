package classicBuilder2_z_podpowiedziami_cos_dziala;

public class ZestawKomputerowy {
	private Monior monitor;
	private StacjaRobocza stacjaRobocza;
	
	public void setMonitor(Monior monitor) {
		this.monitor = monitor;
	}
	public void setStacjaRobocza(StacjaRobocza stacjaRobocza) {
		this.stacjaRobocza = stacjaRobocza;
	}
	
	@Override
	public String toString() {
		return "ZestawKomputerowy [monitor=" + monitor + ", stacjaRobocza=" + stacjaRobocza + "]";
	}
	
	
}
