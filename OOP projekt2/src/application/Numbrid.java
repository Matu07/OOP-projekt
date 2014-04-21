package application;

import javafx.scene.image.Image;



public class Numbrid{
	//Täringute kujutised, mis seotakse väärtustega

	static Image täring1 = new Image("/application/Täring1.jpg");
	static Image täring2 = new Image("/application/Täring2.jpg");
	static Image täring3 = new Image("/application/Täring3.jpg");
	static Image täring4 = new Image("/application/Täring4.jpg");
	static Image täring5 = new Image("/application/Täring5.jpg");
	static Image täring6 = new Image("/application/Täring6.jpg");
	 static Image Number(int number){
		 if (number == 1) {
			return täring1;
		 }
		 else if (number == 2) {
			return täring2;
		 }
		 else if (number == 3) {
			return täring3;
		 }
		 else if (number == 4) {
			return täring4;
		 }
		 else if (number == 5) {
			return täring5;
		 }
		 else {
			return täring6;
		 }
	}
	 
	
	 public static void main(String[] args) {
		Number(1);
		Number(2);
		Number(3);
		Number(4);
		Number(5);
		Number(6);
		Number(7);
	}
	

}
