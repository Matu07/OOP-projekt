package application;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Täringud extends Numbrid {


	static int Täring(int arv) {
		if (arv == 1) {
			Täring1 = (int) Math.round(Math.random() * 5 + 1);
			return Täring1;
		} else if (arv == 2) {
			Täring2 = (int) Math.round(Math.random() * 5 + 1);
			return Täring2;
		} else if (arv == 3) {
			Täring3 = (int) Math.round(Math.random() * 5 + 1);
			return Täring3;
		} else if (arv == 4) {
			Täring4 = (int) Math.round(Math.random() * 5 + 1);
			return Täring4;
		} else if (arv == 5) {
			Täring5 = (int) Math.round(Math.random() * 5 + 1);
			return Täring5;
		} else {
			System.out.println("VALE VÄÄRTUS");
			return 0;
		}
	};

	static int Täring1;
	static int Täring2;
	static int Täring3;
	static int Täring4;
	static int Täring5;

	static void Näitamine() {
		Number(Täring1);
		Number(Täring2);
		Number(Täring3);
		Number(Täring4);
		Number(Täring5);
	}

	static int pakutud = 0;

	static int Pakkumine(int suvaline) {
		if (pakutud == 0) {
			return Täring(suvaline);
		}
		return suvaline;

	}

	public static void main(String[] args) {

		int Skoor = 0;

		int lõplik1 = 0;
		int lõplik2 = 0;
		int lõplik3 = 0;
		int lõplik4 = 0;
		int lõplik5 = 0;
		System.out.println("Yatzy mäng");
		System.out
				.println("Praeguste raundide eesmärk on saada võimalikult palju ettenähtud väärtusega täringuviskeid.");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Põhitsükkel
		for (int x = 1; x < 7; x++) {
			int Raundiskoor = 0;
			System.out
					.println(x
							+ ". raund. Eesmärgiks on saada võimalikult palju täringuviskeid tulemusega "
							+ x);
			System.out.println("Esimese veeretamise tulemus:");

			// Väljastab esimese visketulemuse
			for (int j = 1; j < 6; j++) {
				Täring(j);
			}
			Näitamine();

			// Täringute vahetamine
			Scanner scan = new Scanner(System.in);
			for (int a = 1; a < 6; a++) {
				System.out.println("Kas soovid vahetada " + a
						+ ". täringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(a);
			}

			System.out.println("Tulemus vahetamise järel:");
			Näitamine();
			for (int b = 1; b < 6; b++) {
				System.out.println("Kas soovid vahetada " + b
						+ ". täringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(b);
			}

			System.out.println("Tulemus teise vahetamise järel:");
			Näitamine();

			// Skoori arvutamise osa
			lõplik1 = Täring1;
			lõplik2 = Täring2;
			lõplik3 = Täring3;
			lõplik4 = Täring4;
			lõplik5 = Täring5;

			if (lõplik1 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (lõplik2 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (lõplik3 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (lõplik4 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (lõplik5 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			Skoor = Skoor + Raundiskoor;
			System.out.println("Selle raundi skoor on: " + Raundiskoor
					+ " punkti");
			System.out.println("Kogu punktiskoor on: " + Skoor + " punkti");

			// 5 sekundit viivitust raundide vahel
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
