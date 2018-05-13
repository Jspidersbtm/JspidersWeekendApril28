package bottleexample;

public class Bottle {
	void store(Juice j) {
		System.out.println("Stores juice");
	}

	void store(Milk m) {
		System.out.println("Stores milk");
	}

	void store(Water w) {
		System.out.println("Stores water");
	}

	// duplicate method
	// void store(Water w1) {
	// 		System.out.println("Stores water");
	// }

	public static void main(String[] args) {
		Bottle b = new Bottle();
		Milk m = new Milk();
		b.store(m);

		Water w = new Water();
		b.store(w);

		Juice j = new Juice();
		b.store(j);

	}
}
