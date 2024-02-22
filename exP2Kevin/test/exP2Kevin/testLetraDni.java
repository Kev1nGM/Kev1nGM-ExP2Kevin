package exP2Kevin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class testLetraDni

{

    @ParameterizedTest
    @CsvSource({"74123698, B", "56321478, K", "74369815, M", "73654796, X", "67412358"})
    public void testObtenerLetraDNI(int dni, char expectedLetter) {
        LetraDni letraDni = new LetraDni();
        char actualLetter = letraDni.obtenerLetraDNI(dni);
        assertEquals(expectedLetter, actualLetter);
    }
}