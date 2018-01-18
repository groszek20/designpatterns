package budowniczy;

class ZestawXT001 extends Builder {

	@Override
	public void buildMonitor() {
		zestaw.setMonitor("LG");
		
	}

	@Override
	public void buildDrukarka() {
		zestaw.setDrukarka("HP");
		
	}

	@Override
	public void buildRam() {
		zestaw.setRam("SDD");
		
	}

	@Override
	public void buildGrafika() {
		zestaw.setGrafika("najlepsza");
		
	}

	@Override
	public void buildHdd() {
		zestaw.setHdd("1 TB");
		
	}

}
