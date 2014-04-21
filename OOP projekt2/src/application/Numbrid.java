package application;

import javafx.scene.image.Image;

public class Numbrid {
	// Täringute kujutised, mis seotakse väärtustega

	static Image pilt1 = new Image("/application/Täring1.jpg");
	static Image pilt2 = new Image("/application/Täring2.jpg");
	static Image pilt3 = new Image("/application/Täring3.jpg");
	static Image pilt4 = new Image("/application/Täring4.jpg");
	static Image pilt5 = new Image("/application/Täring5.jpg");
	static Image pilt6 = new Image("/application/Täring6.jpg");

	static Image Number(int number) {
		if (number == 1) {
			return pilt1;
		} else if (number == 2) {
			return pilt2;
		} else if (number == 3) {
			return pilt3;
		} else if (number == 4) {
			return pilt4;
		} else if (number == 5) {
			return pilt5;
		} else {
			return pilt6;
		}
	}

}
