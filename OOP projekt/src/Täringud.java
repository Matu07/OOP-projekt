
import java.util.Scanner;

public class T�ringud extends Numbrid {
	
	static int T�ring11;
	static int T�ring22;
	static int T�ring33;
	static int T�ring44;
	static int T�ring55;
	
	static int Vaheta1() {
		T�ring11 = (int)Math.round(Math.random()*5+1);
		return T�ring11;
	}
	
	static int Vaheta2() {
		T�ring22 = (int)Math.round(Math.random()*5+1);
		return T�ring22;
	}
	
	static int Vaheta3() {
		T�ring33 = (int)Math.round(Math.random()*5+1);
		return T�ring33;
	}
	
	static int Vaheta4() {
		T�ring44 = (int)Math.round(Math.random()*5+1);
		return T�ring44;
	}
	
	static int Vaheta5() {
		T�ring55 = (int)Math.round(Math.random()*5+1);
		return T�ring55;
	}
	
	
	static void T�ring1(){
		if (T�ring11 == 1) {
			Number1();
		}
		else if ( T�ring11 == 2) {
			Number2();
		}
		else if ( T�ring11 == 3) {
			Number3();
		}
		else if ( T�ring11 == 4) {
			Number4();
		}
		else if ( T�ring11 == 5) {
			Number5();
		}
		else if (T�ring11 == 6) {
			Number6();
		}
	}
	
	static void T�ring2(){
		if (T�ring22 == 1) {
			Number1();
		}
		else if ( T�ring22 == 2) {
			Number2();
		}
		else if ( T�ring22 == 3) {
			Number3();
		}
		else if ( T�ring22 == 4) {
			Number4();
		}
		else if ( T�ring22 == 5) {
			Number5();
		}
		else if (T�ring22 == 6) {
			Number6();
		}
	}

	static void T�ring3(){
		if (T�ring33 == 1) {
			Number1();
		}
		else if ( T�ring33 == 2) {
			Number2();
		}
		else if ( T�ring33 == 3) {
			Number3();
		}
		else if ( T�ring33 == 4) {
			Number4();
		}
		else if ( T�ring33 == 5) {
			Number5();
		}
		else if (T�ring33 == 6) {
			Number6();
		}
	}

	static void T�ring4(){
		if (T�ring44 == 1) {
			Number1();
		}
		else if ( T�ring44 == 2) {
			Number2();
		}
		else if ( T�ring44 == 3) {
			Number3();
		}
		else if ( T�ring44 == 4) {
			Number4();
		}
		else if ( T�ring44 == 5) {
			Number5();
		}
		else if (T�ring44 == 6) {
			Number6();
		}
	}
	
	static void T�ring5(){
		if (T�ring55 == 1) {
			Number1();
		}
		else if ( T�ring55 == 2) {
			Number2();
		}
		else if ( T�ring55 == 3) {
			Number3();
		}
		else if ( T�ring55 == 4) {
			Number4();
		}
		else if ( T�ring55 == 5) {
			Number5();
		}
		else if (T�ring55 == 6) {
			Number6();
		}
	}
		
	static void N�itamine() {
		T�ring1();
		T�ring2();
		T�ring3();
		T�ring4();
		T�ring5();
	}
	
	// T�ringute testimine ja vahetamine T��TAB ! ! !
	// Sisse panna veel teine vahetus ja valmis teha ts�kkel
	// Esialgu v�iks m�ngu �les ehitada T�ringute summale (�hed, kahed, kolmed, neljad, viied, kuued)
	
	public static void main(String[] args) {
		int K�iguloendur = 0;
		int L�pp = 13;
		int Vaheta = 0;
		
		Vaheta1();
		Vaheta2();
		Vaheta3();
		Vaheta4();
		Vaheta5();
		N�itamine();
		System.out.println("------------------------------------");
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Kas soovid vahetada esimest t�ringut? (0 = Vaheta, 1 = J�ta samaks)");
	    int Pakkumine1 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada teist t�ringut? (0 = Vaheta, 1 = J�ta samaks)");
	    int Pakkumine2 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada kolmandat t�ringut? (0 = Vaheta, 1 = J�ta samaks)");
	    int Pakkumine3 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada neljandat t�ringut? (0 = Vaheta, 1 = J�ta samaks)");
	    int Pakkumine4 = scan.nextInt();
	    
	    System.out.println("Kas soovid vahetada viiendat t�ringut? (0 = Vaheta, 1 = J�ta samaks)");
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
		N�itamine();
		
		
			
			
		

	}
	
	}


