package excercises_classicBuilder2;

public class Director {
private Builder budowniczy;

public Director(Builder budowniczy) {
	this.budowniczy = budowniczy;
}

public void makeZestaw() {
	budowniczy.buildInstrukcja();
	budowniczy.buildPude³ko();
}

}
