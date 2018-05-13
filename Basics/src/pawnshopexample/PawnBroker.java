package pawnshopexample;

public class PawnBroker {
	Money giveLoan(Gold g) {
		System.out.println("Accept gold and return money");
		Money m = new Money();
		return m;
	}

	Money giveLoan(Vehicle v) {
		System.out.println("Accept vehicle and give money");
		Money m = new Money();
		return m;
	}

	void give(Money m) {
		System.out.println("Aceepted the money");
	}

	public static void main(String[] args) {
		PawnBroker p = new PawnBroker();
		Gold g = new Gold();
		Money m = p.giveLoan(g);
	}
}
