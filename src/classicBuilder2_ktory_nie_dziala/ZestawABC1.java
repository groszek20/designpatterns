package classicBuilder2_ktory_nie_dziala;

public class ZestawABC1 implements Builder {

	private Zestaw zestaw;	
	
	public ZestawABC1() {
		this.zestaw = new Zestaw();
	}

	@Override
	public void buildMonitor() {
		zestaw.setMonitor("LG");
		
	}

	@Override
	public void buildKomputer() {
		zestaw.setKomputer("IBM");
		
	}

	@Override
	public void buildKlawiatura() {
	zestaw.setKlawiatura("leworêczna");
		
	}

	@Override
	public void buildDrukarka() {
		zestaw.setDrukarka("HP");
	}

	@Override
	public Zestaw getZestaw() {
		return zestaw;
	}

}
