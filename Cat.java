public class Cat {
	//create instance variables (fields)
	String name;
	String color;
	private int age;
	double weight;
	boolean claws; 
	double length;
	double volume;
	
	public Cat() {
		name = "Bob";
		color = "orange";
		weight = 5;
		age = 0;
		claws = true;
		length = 10;
		volume = 0;
	}
	
	public Cat(String name, String color, boolean claws, double length, double weight) {
		this.name = name;
		this.color = color; 
		this.claws = claws;
		this.length = length; 
		this.weight = weight; 
		this.age = 2;
		this.volume = 10;
	}
	
	public void meow() {
		//not a static method!! every object has it's own "meow"
		volume=100;
		System.out.println("RRRRRRmeow");
	}
	
	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}

}
