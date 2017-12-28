package fluentbuilder;

public class Car {
	private String name;
	private int age;
	private final String color;

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	private Car(Builder build) {
		this.name = build.name;
		this.color = build.color;
		this.age = build.age;
	}
	
	public static class Builder {
		private String name;
		private final String color;
		private int age;
		
		public Builder (String color) {
			this.color = color;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return Builder.this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
}
