package application;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class T�ringud extends Numbrid {

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

	static int T�ring(int arv) {
		if (arv == 1) {
			t�ring1 = (int) Math.round(Math.random() * 5 + 1);
			return t�ring1;
		} else if (arv == 2) {
			t�ring2 = (int) Math.round(Math.random() * 5 + 1);
			iv2.setImage(Numbrid.Number(t�ring2));
			iv2.setFitWidth(75);
			iv2.setPreserveRatio(true);
			return t�ring2;
		} else if (arv == 3) {
			t�ring3 = (int) Math.round(Math.random() * 5 + 1);
			iv3.setImage(Numbrid.Number(t�ring3));
			iv3.setFitWidth(75);
			iv3.setPreserveRatio(true);
			return t�ring3;
		} else if (arv == 4) {
			t�ring4 = (int) Math.round(Math.random() * 5 + 1);
			iv4.setImage(Numbrid.Number(t�ring4));
			iv4.setFitWidth(75);
			iv4.setPreserveRatio(true);
			return t�ring4;
		} else {
			t�ring5 = (int) Math.round(Math.random() * 5 + 1);
			iv5.setImage(Numbrid.Number(t�ring5));
			iv5.setFitWidth(75);
			iv5.setPreserveRatio(true);
			return t�ring5;
		}
	};

	static int t�ring1;
	static int t�ring2;
	static int t�ring3;
	static int t�ring4;
	static int t�ring5;

	static void Veeretamine() {
		for (int i = 0; i < 6; i++) {
			T�ring(i);
		}
	}

	static void N�itamine(HBox o) {
		iv1.setImage(Numbrid.Number(t�ring1));
		iv1.setFitWidth(75);
		iv1.setPreserveRatio(true);
		iv2.setImage(Numbrid.Number(t�ring2));
		iv2.setFitWidth(75);
		iv2.setPreserveRatio(true);
		iv3.setImage(Numbrid.Number(t�ring3));
		iv3.setFitWidth(75);
		iv3.setPreserveRatio(true);
		iv4.setImage(Numbrid.Number(t�ring4));
		iv4.setFitWidth(75);
		iv4.setPreserveRatio(true);
		iv5.setImage(Numbrid.Number(t�ring5));
		iv5.setFitWidth(75);
		iv5.setPreserveRatio(true);
		o.getChildren().addAll(iv1, iv2, iv3, iv4, iv5);
	}

	static int pakutud = 0;

	static int Pakkumine(int suvaline) {
		if (pakutud == 0) {
			return T�ring(suvaline);
		}
		return suvaline;

	}

	public static void main(String[] args) {

		int Skoor = 0;

		int l�plik1 = 0;
		int l�plik2 = 0;
		int l�plik3 = 0;
		int l�plik4 = 0;
		int l�plik5 = 0;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// P�hits�kkel
		for (int x = 1; x < 7; x++) {
			int Raundiskoor = 0;
			System.out
					.println(x
							+ ". raund. Eesm�rgiks on saada v�imalikult palju t�ringuviskeid tulemusega "
							+ x);
			System.out.println("Esimese veeretamise tulemus:");

			// V�ljastab esimese visketulemuse

			// T�ringute vahetamine
			Scanner scan = new Scanner(System.in);
			for (int a = 1; a < 6; a++) {
				System.out.println("Kas soovid vahetada " + a
						+ ". t�ringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(a);
			}

			System.out.println("Tulemus vahetamise j�rel:");

			for (int b = 1; b < 6; b++) {
				System.out.println("Kas soovid vahetada " + b
						+ ". t�ringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(b);
			}

			System.out.println("Tulemus teise vahetamise j�rel:");

			// Skoori arvutamise osa
			l�plik1 = t�ring1;
			l�plik2 = t�ring2;
			l�plik3 = t�ring3;
			l�plik4 = t�ring4;
			l�plik5 = t�ring5;

			if (l�plik1 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (l�plik2 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (l�plik3 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (l�plik4 == x) {
				Raundiskoor = Raundiskoor + x;
			}
			if (l�plik5 == x) {
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
