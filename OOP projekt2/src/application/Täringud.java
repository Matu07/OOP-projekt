package application;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Täringud extends Numbrid {

	static int punktide_lisamine;
	static int veeretus;
	static ImageView iv1 = new ImageView();
	static ImageView iv2 = new ImageView();
	static ImageView iv3 = new ImageView();
	static ImageView iv4 = new ImageView();
	static ImageView iv5 = new ImageView();
	static int skoor;
	static int korraloendur=0;
	static int koguskoor;

	static int Täring(int arv) {
		if (arv == 1) {
			täring1 = (int) Math.round(Math.random() * 5 + 1);
			return täring1;
		} else if (arv == 2) {
			täring2 = (int) Math.round(Math.random() * 5 + 1);
			iv2.setImage(Numbrid.Number(täring2));
			iv2.setFitWidth(75);
			iv2.setPreserveRatio(true);
			return täring2;
		} else if (arv == 3) {
			täring3 = (int) Math.round(Math.random() * 5 + 1);
			iv3.setImage(Numbrid.Number(täring3));
			iv3.setFitWidth(75);
			iv3.setPreserveRatio(true);
			return täring3;
		} else if (arv == 4) {
			täring4 = (int) Math.round(Math.random() * 5 + 1);
			iv4.setImage(Numbrid.Number(täring4));
			iv4.setFitWidth(75);
			iv4.setPreserveRatio(true);
			return täring4;
		} else {
			täring5 = (int) Math.round(Math.random() * 5 + 1);
			iv5.setImage(Numbrid.Number(täring5));
			iv5.setFitWidth(75);
			iv5.setPreserveRatio(true);
			return täring5;
		}
	};

	static int täring1;
	static int täring2;
	static int täring3;
	static int täring4;
	static int täring5;

	static void Veeretamine() {
		for (int i = 0; i < 6; i++) {
			Täring(i);
		}
	}

	static void Näitamine(HBox o) {
		iv1.setImage(Numbrid.Number(täring1));
		iv1.setFitWidth(75);
		iv1.setPreserveRatio(true);
		iv2.setImage(Numbrid.Number(täring2));
		iv2.setFitWidth(75);
		iv2.setPreserveRatio(true);
		iv3.setImage(Numbrid.Number(täring3));
		iv3.setFitWidth(75);
		iv3.setPreserveRatio(true);
		iv4.setImage(Numbrid.Number(täring4));
		iv4.setFitWidth(75);
		iv4.setPreserveRatio(true);
		iv5.setImage(Numbrid.Number(täring5));
		iv5.setFitWidth(75);
		iv5.setPreserveRatio(true);
		o.getChildren().addAll(iv1, iv2, iv3, iv4, iv5);
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

			// Täringute vahetamine
			Scanner scan = new Scanner(System.in);
			for (int a = 1; a < 6; a++) {
				System.out.println("Kas soovid vahetada " + a
						+ ". täringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(a);
			}

			System.out.println("Tulemus vahetamise järel:");

			for (int b = 1; b < 6; b++) {
				System.out.println("Kas soovid vahetada " + b
						+ ". täringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(b);
			}

			System.out.println("Tulemus teise vahetamise järel:");

			// Skoori arvutamise osa
			lõplik1 = täring1;
			lõplik2 = täring2;
			lõplik3 = täring3;
			lõplik4 = täring4;
			lõplik5 = täring5;

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
