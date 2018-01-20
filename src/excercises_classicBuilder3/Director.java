package excercises_classicBuilder3;

import budowniczy.ZestawKomputerowy;

public class Director {
private Builder builder;

public void setBuilder(Builder budowniczy) {
	this.builder = budowniczy;
}

public Gra getGra() {
	return builder.getGra();
}

public void sk�adajGre() {
	builder.newGra();
	builder.buildInstrukcja();
	builder.buildPude�ko();
}

}
