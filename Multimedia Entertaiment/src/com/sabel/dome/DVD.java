package com.sabel.dome;

public class DVD extends AnyD {

	private String regisseur;

	public DVD(String title, String regisseur, int spielzeit) {
		super(title, spielzeit);
		this.regisseur = regisseur;

	}

	@ Override // Überprüfung ob Methode in Elternklasse vorhanden
	public void ausgeben() {
		System.out.println("DVD:\t" + title + " (" + spielzeit + " Min)");
		System.out.println("\t" + regisseur);
		System.out.println("\t" + kommentar);
		System.out.println("");
	}

}
