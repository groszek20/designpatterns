package classicBuilder2_z_podpowiedziami_cos_dziala;

public class Monior {

	private String name;
	private String size;

	public void setSize(String size) {
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Monior [name=" + name + ", size=" + size + "]";
	}
		
}
