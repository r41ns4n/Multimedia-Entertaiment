package com.sabel.dome;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datenbank db = new Datenbank();
		db.erfasseMedium(new CD("Help!", "The Beatles", 80, 14));
		db.erfasseMedium(new CD("Dire Straits", "Dire Straits", 42, 9));
		db.erfasseMedium(new DVD("Das Leben des Brian", "Terry Jones", 90));
		db.erfasseMedium(new DVD("Rocky", "John G. Avildsen", 114));
		db.auflisten();

	}

}
