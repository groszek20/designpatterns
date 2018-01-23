package budowniiczy_data;

public class HeaderDateUtil {

	private String responseHeaders;
	private String dateFormatter;
	
	public String calculateHeader() {
		String wynik = responseHeaders + " " + dateFormatter 
				+ " " + " coœ tam";
		return wynik;
	}
	
	public HeaderDateUtil(Builder builder) {
		this.responseHeaders = builder.responseHeaders;
		this.dateFormatter = builder.dateFormatter;
	}
	
	public static class Builder{
		private String responseHeaders;
		private String dateFormatter;
		
		public Builder dateFormatter(String dateFormatter) {
			this.dateFormatter = dateFormatter;
			return this;
		}
		
		public Builder responseHeaders(String responseHeader) {
			this.responseHeaders = responseHeader;
			return this;
		}
		
		public HeaderDateUtil build () {
			return new HeaderDateUtil(this);
		}
	}
	
}
