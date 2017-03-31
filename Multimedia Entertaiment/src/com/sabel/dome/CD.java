package com.sabel.dome;

public class CD extends AnyD {

	private String kuenstler;
	private int titleanzahl;

	public CD(String title, String kuenstler, int spielzeit, int titleanzahl) {
		super(title, spielzeit);
		this.kuenstler = kuenstler;
		this.titleanzahl = titleanzahl;
	}

	@ Override // Überprüfung ob Methode in Elternklasse vorhanden
	
	public void ausgeben() {
		System.out.println("CD:\t\t" + title + " (" + spielzeit + " Min)");
		System.out.println("\t\t" + kuenstler);
		System.out.println("Titelanzahl:\t" + titleanzahl);
		System.out.println("\t\t" + kommentar);
		System.out.println("");
	}

}
