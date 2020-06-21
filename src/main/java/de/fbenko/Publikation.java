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
		for(int i = 0; i < this.text.length(); i++) {    
            if(text.charAt(i) != ' ')    
                this.textlaenge++;    
		}
		if(this.textlaenge > 100) {
			throw new IllegalArgumentException();
		}
		this.honorar = this.textlaenge * 0.05;
		return this.honorar;
	}

	public int bilderZaehlen() {
		String word = "Picture";
		String temp[] = this.text.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		   if (word.equals(temp[i])) 
			  ++count;
		}  
		return count;
	}
    
}