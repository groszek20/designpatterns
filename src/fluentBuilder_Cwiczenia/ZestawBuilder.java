package fluentBuilder_Cwiczenia;

public class ZestawBuilder {
	
	private String monitor;
	private String drukarka;
	
	
	
	private ZestawBuilder(Zestaw zestaw) {
		this.monitor = zestaw.monitor;
		this.drukarka = zestaw.drukarka;
	}



	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}



	public void setDrukarka(String drukarka) {
		this.drukarka = drukarka;
	}


	@Override
	public String toString() {
		return "ZestawBuilder [monitor=" + monitor + ", drukarka=" + drukarka + "]";
	}



	public static class Zestaw {
		private String monitor;
		private String drukarka;
		
		public Zestaw setMonitor(String monitor) {
			this.monitor = monitor;
			return this;
		}
		public Zestaw setDrukarka(String drukarka) {
			this.drukarka = drukarka;
			return this;
		}
		
		public ZestawBuilder build() {
			return new ZestawBuilder(this);
		}
		
		
	} 

}
