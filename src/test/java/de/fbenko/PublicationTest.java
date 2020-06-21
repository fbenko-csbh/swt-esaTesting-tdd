package de.fbenko;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Arrays;

public class PublicationTest {

    @org.junit.Before
    public void setup() {
        System.out.println("test läuft...");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void textHonorarBerechnen_keinText() throws Exception {
        Publikation beitrag = new Publikation("", "Peter Lustig"); ;
        beitrag.textHonorarBerechnen();
        fail("Hier sollte eine IllegalArgumentException geworfen werden");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void textHonorarBerechnen_zuLang() throws Exception {
        int len = 101;
        char[] array = new char[len];
        for(int i=0; i<len; i++){
            Arrays.fill(array, 'x');
        }
        String langerText = new String(array);

        Publikation beitrag = new Publikation(langerText, "Peter Lustig"); ;
        beitrag.textHonorarBerechnen();
        fail("Hier sollte eine IllegalArgumentException geworfen werden");
    }

    @org.junit.Test
    public void textHonorarBerechnen() throws Exception {
        Publikation beitrag = new Publikation("Hallo Welt", "Peter Lustig"); ;
        double honorar = beitrag.textHonorarBerechnen();
        assertEquals(0.45, honorar, 0.01);
    }

    @org.junit.Test
    public void bilderZaehlen() throws Exception {
        String text = "Picture Lorem dolor amet Picture elitr, Picture ut labore";
        Publikation beitrag = new Publikation(text, "Peter Lustig"); ;
        int anzahl = beitrag.bilderZaehlen();
        assertEquals(3, anzahl);
    }        
}