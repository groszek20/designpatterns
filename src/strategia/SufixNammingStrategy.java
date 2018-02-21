package strategia;

public class SufixNammingStrategy implements NamingStrategy {

	@Override
	public String rename(String str) {
		if (str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException("String nie mo¿e byæ pusty");
		}
		return str + VALUE_TO_ADD;
	}

}
