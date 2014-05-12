package application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
	static File file2 = new File("tulemused.txt");
	static int boonusloendur = 50;

	static void Veeretamine() {
		ArrayList<Boolean> lühem = new ArrayList<Boolean>();
		lühem.addAll(Arrays.asList(vaheta1, vaheta2, vaheta3, vaheta4, vaheta5));
		for (int i = 0; i<lühem.size(); i++) {
			if (lühem.get(i) == true) {
				Täring(i+1);
			}
		}
		
	}

	static void KirjutaFaili() {
		String andmed = String.valueOf(Yatzy.mängijanimi) + ";"
				+ String.valueOf(koguskoor);
		try {
			FileOutputStream fop = new FileOutputStream(file2, true);

			if (!file2.exists()) {
				file2.createNewFile();
			}
			byte[] contentInBytes = andmed.getBytes();
			fop.write(contentInBytes);
			fop.write(System.getProperty("line.separator").getBytes());
			fop.flush();
			fop.close();
		} catch (IOException e) {
			e.printStackTrace();
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
		ArrayList<Integer> täringud = new ArrayList<Integer>();
		täringud.addAll(Arrays.asList(täring1, täring2, täring3, täring4,
				täring5));
		for (int i = 0; i < täringud.size(); i++) {
			if (arv == täringud.get(i)) {
				skoor += täringud.get(i);
			}
		}
	}
}
