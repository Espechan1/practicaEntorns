package registro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidarCamposTest {

    @Test
    void validarEmail() {
        assertTrue(ValidarCampos.validarEmail("kauyhsvgdf@yahoo.cat"));
        assertFalse(ValidarCampos.validarEmail("asfg"));
        assertFalse(ValidarCampos.validarEmail("jhvsf@paucasesnoves.org"));
    }

    @Test
    void validarPass() {
        assertFalse(ValidarCampos.validarPass("yt<vsdf__"));
        assertTrue(ValidarCampos.validarPass("Abc-de56"));
        assertTrue(ValidarCampos.validarPass("Prova_99"));
    }

    @Test
    void validarNombres() {
        assertTrue(ValidarCampos.validarNombre(new String[]{}, "Carles_345"));
        assertTrue(ValidarCampos.validarNombre(new String[]{}, "Carlescanals-345"));
        assertFalse(ValidarCampos.validarNombre(new String[]{}, "goriofrancopeo"));
    }
}