package application;

import javafx.scene.image.Image;



public class Numbrid{
	//Täringute kujutised, mis seotakse väärtustega

	static Image täring1 = new Image("Täring1.jpg");
	static Image täring2 = new Image("Täring2.jpg");
	static Image täring3 = new Image("Täring3.jpg");
	static Image täring4 = new Image("Täring4.jpg");
	static Image täring5 = new Image("Täring5.jpg");
	static Image täring6 = new Image("Täring6.jpg");
	 static void Number(int number){
		 if (number == 1) {
			System.out.println(" ___");
			System.out.println("|   |");
			System.out.println("| . |");
			System.out.println("|   |");
			System.out.println(" ¯¯¯"); 
		 }
		 else if (number == 2) {
			System.out.println(" ___");
			System.out.println("|.  |");
			System.out.println("|   |");
			System.out.println("|  .|");
			System.out.println(" ¯¯¯");
		 }
		 else if (number == 3) {
			System.out.println(" ___");
			System.out.println("|.  |");
			System.out.println("| . |");
			System.out.println("|  .|");
			System.out.println(" ¯¯¯");
		 }
		 else if (number == 4) {
			System.out.println(" ___");
			System.out.println("|. .|");
			System.out.println("|   |");
			System.out.println("|. .|");
			System.out.println(" ¯¯¯");
		 }
		 else if (number == 5) {
			System.out.println(" ___");
			System.out.println("|. .|");
			System.out.println("| . |");
			System.out.println("|. .|");
			System.out.println(" ¯¯¯");
		 }
		 else if (number ==6) {
			System.out.println(" ___");
			System.out.println("|. .|");
			System.out.println("|. .|");
			System.out.println("|. .|");
			System.out.println(" ¯¯¯");
		 }
		 else {
			 System.out.println("Vale väärtus!!!");
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
