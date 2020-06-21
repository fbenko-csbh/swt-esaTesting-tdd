package de.fbenko;

public class Publikation {

	private String text;
	private String autor;
	private int textlaenge;
	private double honorar;

	public Publikation(String text, String autor) {
		this.text = text;
		this.autor = autor;
	}

	public double textHonorarBerechnen() {

		if(this.text.length() == 0) {
			throw new IllegalArgumentException();
		}
		return 1;
	}

	public int bilderZaehlen() {
		return 0;
	}
    
}