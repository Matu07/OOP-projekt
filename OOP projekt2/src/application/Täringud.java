package application;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class T�ringud extends Numbrid {


	static int T�ring(int arv) {
		if (arv == 1) {
			T�ring1 = (int) Math.round(Math.random() * 5 + 1);
			return T�ring1;
		} else if (arv == 2) {
			T�ring2 = (int) Math.round(Math.random() * 5 + 1);
			return T�ring2;
		} else if (arv == 3) {
			T�ring3 = (int) Math.round(Math.random() * 5 + 1);
			return T�ring3;
		} else if (arv == 4) {
			T�ring4 = (int) Math.round(Math.random() * 5 + 1);
			return T�ring4;
		} else if (arv == 5) {
			T�ring5 = (int) Math.round(Math.random() * 5 + 1);
			return T�ring5;
		} else {
			System.out.println("VALE V��RTUS");
			return 0;
		}
	};

	static int T�ring1;
	static int T�ring2;
	static int T�ring3;
	static int T�ring4;
	static int T�ring5;

	static void N�itamine() {
		Number(T�ring1);
		Number(T�ring2);
		Number(T�ring3);
		Number(T�ring4);
		Number(T�ring5);
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
		System.out.println("Yatzy m�ng");
		System.out
				.println("Praeguste raundide eesm�rk on saada v�imalikult palju etten�htud v��rtusega t�ringuviskeid.");
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
			for (int j = 1; j < 6; j++) {
				T�ring(j);
			}
			N�itamine();

			// T�ringute vahetamine
			Scanner scan = new Scanner(System.in);
			for (int a = 1; a < 6; a++) {
				System.out.println("Kas soovid vahetada " + a
						+ ". t�ringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(a);
			}

			System.out.println("Tulemus vahetamise j�rel:");
			N�itamine();
			for (int b = 1; b < 6; b++) {
				System.out.println("Kas soovid vahetada " + b
						+ ". t�ringut? (0 = Vaheta)");
				pakutud = scan.nextInt();
				Pakkumine(b);
			}

			System.out.println("Tulemus teise vahetamise j�rel:");
			N�itamine();

			// Skoori arvutamise osa
			l�plik1 = T�ring1;
			l�plik2 = T�ring2;
			l�plik3 = T�ring3;
			l�plik4 = T�ring4;
			l�plik5 = T�ring5;

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
