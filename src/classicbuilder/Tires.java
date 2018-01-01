package classicbuilder;

public class Tires {
	
	private String type;
	private int Durability;
	
	@Override
	public String toString() {
		return "Tires [type=" + type + ", Durability=" + Durability + "]";
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDurability(int durability) {
		Durability = durability;
	}
}
