package com.sabel.dome;

public class AnyD {

	protected String title;
	protected String kommentar;
	protected int spielzeit;
	protected boolean habIch;

	public AnyD(String title, int spielzeit) {
		this.title = title;
		this.spielzeit = spielzeit;
		this.habIch = false;
		this.kommentar = "<kein Kommentar>";
	}

	public String gibKommentar() {
		return kommentar;
	}

	public void setzeKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public boolean gibVorhanden() {
		return habIch;
	}

	public void setzeVorhanden(boolean habIch) {
		this.habIch = habIch;
	}

	public void ausgeben() {
		System.out.println("CD:\t\t" + title + " (" + spielzeit + " Min)");
		System.out.println("\t\t" + kommentar);
		System.out.println("");
	}

}
