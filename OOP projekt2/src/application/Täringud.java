package application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
	static File file2 = new File("tulemused.txt");
	static int boonusloendur = 50;

	static void Veeretamine() {
		ArrayList<Boolean> l�hem = new ArrayList<Boolean>();
		l�hem.addAll(Arrays.asList(vaheta1, vaheta2, vaheta3, vaheta4, vaheta5));
		for (int i = 0; i<l�hem.size(); i++) {
			if (l�hem.get(i) == true) {
				T�ring(i+1);
			}
		}
		
	}

	static void KirjutaFaili() {
		String andmed = String.valueOf(Yatzy.m�ngijanimi) + ";"
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
		ArrayList<Integer> t�ringud = new ArrayList<Integer>();
		t�ringud.addAll(Arrays.asList(t�ring1, t�ring2, t�ring3, t�ring4,
				t�ring5));
		for (int i = 0; i < t�ringud.size(); i++) {
			if (arv == t�ringud.get(i)) {
				skoor += t�ringud.get(i);
			}
		}
	}
}
