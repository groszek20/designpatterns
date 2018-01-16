package classicBuilder2_ktory_nie_dziala;

public class ZestawDEF2 implements Builder {

	private Zestaw zestaw;
	
	@Override
	public void buildMonitor() {
		zestaw.setMonitor("Samsung");
		
	}

	@Override
	public void buildKomputer() {
		zestaw.setKomputer("Dell");
		
	}

	@Override
	public void buildKlawiatura() {
		zestaw.setKlawiatura("praworêczna");
		
	}

	@Override
	public void buildDrukarka() {
		zestaw.setDrukarka("Cannon");
		
	}

	@Override
	public Zestaw getZestaw() {
		return zestaw;
	}

}
