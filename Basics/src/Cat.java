
public class Cat {
	String color;
	int noOfLegs;
	boolean hasTail;
	String breed;
	double height;
	double weight;

	void eat(Fish f) {
		System.out.println("Eats fish");
	}

	void sleep() {
		System.out.println("Cat sleeps");
	}

	void steal() {
		System.out.println("Cat steals");
	}

	void walk() {
		System.out.println("Cat walks");
	}

	void jump() {
		System.out.println("Cat jumps");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.jump();
		c.walk();
		Fish f = new Fish();
		c.eat(f);
		System.out.println(c.color); // null
		c.color = "brown";
		System.out.println(c.color); // brown
		c.noOfLegs = 4;
		c.breed = "Persian";
		c.hasTail = true;
		c.weight = 68.645;
		c.height = 2.5;
	}
}
