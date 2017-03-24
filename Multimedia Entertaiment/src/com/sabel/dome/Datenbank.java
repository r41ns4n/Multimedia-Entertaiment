package com.sabel.dome;

import java.util.ArrayList;

public class Datenbank {

	private ArrayList<AnyD> anyds;

	public Datenbank() {
		anyds = new ArrayList<>();
	}

	public void erfasseMedium(AnyD anyd) {
		this.anyds.add(anyd);
	}


	public void auflisten() {
		for (AnyD anyd : anyds) {
			anyd.ausgeben();
		}

	}

}
