package gunexample;

public class Sample {
	void show(byte b) {
		System.out.println("Byte method");
		System.out.println(b);
	}

	void show(int f) {
		System.out.println("int method");
		System.out.println(f);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show(0);
	}
}
