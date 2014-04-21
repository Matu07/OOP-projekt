package application;

import java.util.ArrayList;
import java.util.List;

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
		for (int i = 0; i < 6; i++) {
			Täring(i);
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

}
