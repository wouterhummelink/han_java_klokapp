package klokapp;

import processing.core.PApplet;

public class KlokApp extends PApplet {
	public Klok deKlok;
	protected static KlokApp klokapp;
	
	public static void main(String [] args) {
		  PApplet.main("klokapp.KlokApp");
	  }
	
	
	public void settings() {
		 size(400,400);
	}

	public void setup() {
	  klokapp = this;
	 
	  deKlok = new Klok(150, 100, 200, 23, 15);
	  deKlok.tekenKlok();
	}

	public void draw() {
	  deKlok.tik();
	  deKlok.tekenKlok();
	}
}
