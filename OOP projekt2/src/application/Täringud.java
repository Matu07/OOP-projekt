package application;

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
	static int korraloendur = 0;
	static int koguskoor;
	static boolean vaheta1 = true;
	static boolean vaheta2 = true;
	static boolean vaheta3 = true;
	static boolean vaheta4 = true;
	static boolean vaheta5 = true;

	static int Täring(int arv) {
		if (arv == 1) {
			täring1 = (int) Math.round(Math.random() * 5 + 1);
			return täring1;
		} else if (arv == 2) {
			täring2 = (int) Math.round(Math.random() * 5 + 1);
			return täring2;
		} else if (arv == 3) {
			täring3 = (int) Math.round(Math.random() * 5 + 1);
			return täring3;
		} else if (arv == 4) {
			täring4 = (int) Math.round(Math.random() * 5 + 1);
			return täring4;
		} else {
			täring5 = (int) Math.round(Math.random() * 5 + 1);
			return täring5;
		}
	};

	static int täring1;
	static int täring2;
	static int täring3;
	static int täring4;
	static int täring5;

	static void Veeretamine() {
		if (vaheta1 == true) {
			Täring(1);
		}
		if (vaheta2 == true) {
			Täring(2);
		}
		if (vaheta3 == true) {
			Täring(3);
		}
		if (vaheta4 == true) {
			Täring(4);
		}
		if (vaheta5 == true) {
			Täring(5);
		}
	}

	static void Abitsükkel(ImageView o) {
		o.setFitWidth(75);
		o.setPreserveRatio(true);
	}

	static void Näitamine(HBox o) {
		iv1.setImage(Numbrid.Number(täring1));
		Abitsükkel(iv1);
		iv2.setImage(Numbrid.Number(täring2));
		Abitsükkel(iv2);
		iv3.setImage(Numbrid.Number(täring3));
		Abitsükkel(iv3);
		iv4.setImage(Numbrid.Number(täring4));
		Abitsükkel(iv4);
		iv5.setImage(Numbrid.Number(täring5));
		Abitsükkel(iv5);
		o.getChildren().addAll(iv1, iv2, iv3, iv4, iv5);
	}

	static void LeiaArv(int arv) {
		if (Täringud.täring1 == arv) {
			Täringud.skoor += Täringud.täring1;
		}
		if (Täringud.täring2 == arv) {
			Täringud.skoor += Täringud.täring2;
		}
		if (Täringud.täring3 == arv) {
			Täringud.skoor += Täringud.täring3;
		}
		if (Täringud.täring4 == arv) {
			Täringud.skoor += Täringud.täring4;
		}
		if (Täringud.täring5 == arv) {
			Täringud.skoor += Täringud.täring5;
		}

	}
}
