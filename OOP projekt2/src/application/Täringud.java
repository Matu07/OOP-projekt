package application;

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
	static int korraloendur = 0;
	static int koguskoor;
	static boolean vaheta1 = true;
	static boolean vaheta2 = true;
	static boolean vaheta3 = true;
	static boolean vaheta4 = true;
	static boolean vaheta5 = true;

	static int T�ring(int arv) {
		if (arv == 1) {
			t�ring1 = (int) Math.round(Math.random() * 5 + 1);
			return t�ring1;
		} else if (arv == 2) {
			t�ring2 = (int) Math.round(Math.random() * 5 + 1);
			return t�ring2;
		} else if (arv == 3) {
			t�ring3 = (int) Math.round(Math.random() * 5 + 1);
			return t�ring3;
		} else if (arv == 4) {
			t�ring4 = (int) Math.round(Math.random() * 5 + 1);
			return t�ring4;
		} else {
			t�ring5 = (int) Math.round(Math.random() * 5 + 1);
			return t�ring5;
		}
	};

	static int t�ring1;
	static int t�ring2;
	static int t�ring3;
	static int t�ring4;
	static int t�ring5;

	static void Veeretamine() {
		if (vaheta1 == true) {
			T�ring(1);
		}
		if (vaheta2 == true) {
			T�ring(2);
		}
		if (vaheta3 == true) {
			T�ring(3);
		}
		if (vaheta4 == true) {
			T�ring(4);
		}
		if (vaheta5 == true) {
			T�ring(5);
		}
	}

	static void Abits�kkel(ImageView o) {
		o.setFitWidth(75);
		o.setPreserveRatio(true);
	}

	static void N�itamine(HBox o) {
		iv1.setImage(Numbrid.Number(t�ring1));
		Abits�kkel(iv1);
		iv2.setImage(Numbrid.Number(t�ring2));
		Abits�kkel(iv2);
		iv3.setImage(Numbrid.Number(t�ring3));
		Abits�kkel(iv3);
		iv4.setImage(Numbrid.Number(t�ring4));
		Abits�kkel(iv4);
		iv5.setImage(Numbrid.Number(t�ring5));
		Abits�kkel(iv5);
		o.getChildren().addAll(iv1, iv2, iv3, iv4, iv5);
	}

	static void LeiaArv(int arv) {
		if (T�ringud.t�ring1 == arv) {
			T�ringud.skoor += T�ringud.t�ring1;
		}
		if (T�ringud.t�ring2 == arv) {
			T�ringud.skoor += T�ringud.t�ring2;
		}
		if (T�ringud.t�ring3 == arv) {
			T�ringud.skoor += T�ringud.t�ring3;
		}
		if (T�ringud.t�ring4 == arv) {
			T�ringud.skoor += T�ringud.t�ring4;
		}
		if (T�ringud.t�ring5 == arv) {
			T�ringud.skoor += T�ringud.t�ring5;
		}

	}
}
