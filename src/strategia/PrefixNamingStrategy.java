package strategia;

public class PrefixNamingStrategy implements NamingStrategy {

	@Override
	public String rename(String str) {
		if(str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException("String cannot be empty");
		}
		return VALUE_TO_ADD + str;
	}

}
