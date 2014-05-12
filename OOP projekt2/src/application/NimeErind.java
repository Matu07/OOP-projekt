package application;

public class NimeErind extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NimeErind() {
		super();
	}

	NimeErind(String s) {
		super(s);
	}
	
	static boolean MängijaNimeKontroll(String nimi) throws NimeErind {
		if (nimi.equals("Sisesta oma nimi")) {
			throw new NimeErind("NIME EI SISESTATUD");
		}
		else {
			return false;
		}
	}

}
