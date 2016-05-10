import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class RomanNumeralTest {
    @Test
    public void assert_I_plus_I_returnsII() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
       assertThat(romanNumeral.add("I","I"),is ("II"));
    }

    @Test
    public void assert_I_plus_II_returnsIII() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("I","II"),is ("III"));
    }

    @Test
    public void assert_II_plus_II_returnsIV() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("II","II"),is ("IV"));
    }

    @Test
    public void assert_I_plus_III_returnsIV() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("I","III"),is ("IV"));
    }

    @Test
    public void assert_I_plus_IV_returnsV() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("I", "IV"), is("V"));
    }

    @Test
    public void assert_IV_plus_I_returnsV() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("IV", "I"), is("V"));
    }

    @Test
    public void assert_I_plus_VI_returnsVII() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("I", "VI"), is("VII"));
    }

    @Test
    public void assert_IV_plus_VI_returnsX() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.add("IV", "VI"), is("X"));
    }


    //Map to tests
    @Test
    public void assert_I_mapsTo_I() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.mapToI("I"), is("I"));
    }
    @Test
    public void assert_II_mapsTo_II() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.mapToI("II"), is("II"));
    }
    @Test
    public void assert_III_mapsTo_III() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.mapToI("III"), is("III"));
    }

    @Test
    public void assert_IV_mapsTo_IIII() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.mapToI("IV"), is("IIII"));
    }

    @Test
    public void assert_V_mapsTo_IIIII() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.mapToI("V"), is("IIIII"));
    }

    @Test
    public void assert_VI_mapsTo_IIIIII() throws Exception {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat(romanNumeral.mapToI("VI"), is("IIIIII"));
    }


}
