package gunexample;

public class Car {
	int gear;

	void gearUp() {
		if (gear < 5)
			gear++;
		System.out.println("Car is moving on " + gear + " gear");
	}

	void gearDown() {
		if (gear > 0)
			gear--;
		System.out.println("Car is moving on " + gear + " gear");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.gearDown();
		c.gearUp();
		c.gearUp();
		c.gearUp();
		c.gearUp();
		c.gearUp();
		c.gearUp();
		c.gearUp();
		c.gearDown();
		c.gearUp();
		c.gearDown();
		c.gearDown();
		System.out.println(c.gear);
	}

}
