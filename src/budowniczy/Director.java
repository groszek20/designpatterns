package budowniczy;

public class Director {
private Builder builder;

public void setBuilder(Builder builder) {
	this.builder = builder;
}

public ZestawKomputerowy getZestaw() {
	return builder.getZestaw();
}

public void sk³adaj() {
	builder.newZestaw();
	builder.buildDrukarka();
	builder.buildGrafika();
	builder.buildHdd();
	builder.buildMonitor();
	builder.buildRam();
}

}
