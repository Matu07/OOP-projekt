
import java.util.Scanner;

public class Täringud extends Numbrid {
	
	static int Täring11;
	static int Täring22;
	static int Täring33;
	static int Täring44;
	static int Täring55;
	
	static int Vaheta1() {
		Täring11 = (int)Math.round(Math.random()*5+1);
		return Täring11;
	}
	
	static int Vaheta2() {
		Täring22 = (int)Math.round(Math.random()*5+1);
		return Täring22;
	}
	
	static int Vaheta3() {
		Täring33 = (int)Math.round(Math.random()*5+1);
		return Täring33;
	}
	
	static int Vaheta4() {
		Täring44 = (int)Math.round(Math.random()*5+1);
		return Täring44;
	}
	
	static int Vaheta5() {
		Täring55 = (int)Math.round(Math.random()*5+1);
		return Täring55;
	}
	
	
	static void Täring1(){
		if (Täring11 == 1) {
			Number1();
		}
		else if ( Täring11 == 2) {
			Number2();
		}
		else if ( Täring11 == 3) {
			Number3();
		}
		else if ( Täring11 == 4) {
			Number4();
		}
		else if ( Täring11 == 5) {
			Number5();
		}
		else if (Täring11 == 6) {
			Number6();
		}
	}
	
	static void Täring2(){
		if (Täring22 == 1) {
			Number1();
		}
		else if ( Täring22 == 2) {
			Number2();
		}
		else if ( Täring22 == 3) {
			Number3();
		}
		else if ( Täring22 == 4) {
			Number4();
		}
		else if ( Täring22 == 5) {
			Number5();
		}
		else if (Täring22 == 6) {
			Number6();
		}
	}

	static void Täring3(){
		if (Täring33 == 1) {
			Number1();
		}
		else if ( Täring33 == 2) {
			Number2();
		}
		else if ( Täring33 == 3) {
			Number3();
		}
		else if ( Täring33 == 4) {
			Number4();
		}
		else if ( Täring33 == 5) {
			Number5();
		}
		else if (Täring33 == 6) {
			Number6();
		}
	}

	static void Täring4(){
		if (Täring44 == 1) {
			Number1();
		}
		else if ( Täring44 == 2) {
			Number2();
		}
		else if ( Täring44 == 3) {
			Number3();
		}
		else if ( Täring44 == 4) {
			Number4();
		}
		else if ( Täring44 == 5) {
			Number5();
		}
		else if (Täring44 == 6) {
			Number6();
		}
	}
	
	static void Täring5(){
		if (Täring55 == 1) {
			Number1();
		}
		else if ( Täring55 == 2) {
			Number2();
		}
		else if ( Täring55 == 3) {
			Number3();
		}
		else if ( Täring55 == 4) {
			Number4();
		}
		else if ( Täring55 == 5) {
			Number5();
		}
		else if (Täring55 == 6) {
			Number6();
		}
	}
		
	static void Näitamine() {
		Täring1();
		Täring2();
		Täring3();
		Täring4();
		Täring5();
	}
	
	// Täringute testimine ja vahetamine TÖÖTAB ! ! !
	// Sisse panna veel teine vahetus ja valmis teha tsükkel
	// Esialgu võiks mängu üles ehitada Täringute summale (ühed, kahed, kolmed, neljad, viied, kuued)
	
	public static void main(String[] args) {
		int Käiguloendur = 0;
		int Lõpp = 13;
		int Vaheta = 0;
		
		Vaheta1();
		Vaheta2();
		Vaheta3();
		Vaheta4();
		Vaheta5();
		Näitamine();
		System.out.println("------------------------------------");
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Kas soovid vahetada esimest täringut? (0 = Vaheta, 1 = Jäta samaks)");
	    int Pakkumine1 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada teist täringut? (0 = Vaheta, 1 = Jäta samaks)");
	    int Pakkumine2 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada kolmandat täringut? (0 = Vaheta, 1 = Jäta samaks)");
	    int Pakkumine3 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada neljandat täringut? (0 = Vaheta, 1 = Jäta samaks)");
	    int Pakkumine4 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada viiendat täringut? (0 = Vaheta, 1 = Jäta samaks)");
	    int Pakkumine5 = scan.nextInt();
	    
	    if (Pakkumine1 == Vaheta) {
			Vaheta1();
	    }
	    
	    if (Pakkumine2 == Vaheta) {
			Vaheta2();
		}
	    
	    if (Pakkumine3 == Vaheta) {
			Vaheta3();
		}
	    
	    if (Pakkumine4 == Vaheta) {
			Vaheta4();
		}
	    
		if (Pakkumine5 == Vaheta) {
			Vaheta5();
		}
		Näitamine();
		
		
			
			
		

	}
	
	}


