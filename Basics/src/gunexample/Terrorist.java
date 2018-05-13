package gunexample;

public class Terrorist {
	Gun getKilled() {
		Gun g = new Gun();
		return g;
	}

	public static void main(String[] args) {
		Terrorist t = new Terrorist();
		Gun newGun = t.getKilled();
	}
}
