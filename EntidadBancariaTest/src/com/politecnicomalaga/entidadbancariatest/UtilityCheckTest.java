package com.politecnicomalaga.entidadbancariatest;

import com.politecnicomalaga.entidadbancaria.UtilidadCheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityCheckTest {
    private String dni, dni2, dniMal,  dniMal2,
            ruta, ruta2, rutaMal, rutaMal2;


    @BeforeEach
    public void iniciarVariables() {
        dni = "26838689";
        dni2 = "23345567";
        dniMal = "26838689N";
        dniMal2 = "aaa";

        ruta = "./desktop/daw/";
        ruta2 = "./entornos/examenJUnit/";
        rutaMal = ".//etc/passwd";
        rutaMal2 = "./home//adrian/";
    }

    @Test
    public void testCalculaLetraDNI() {
        //Le paso los DNI y compruebo que dan la letra correcta
        assertEquals(UtilidadCheck.calculaLetraDNI(dni), 'N');
        assertEquals(UtilidadCheck.calculaLetraDNI(dni2), 'S');

        //Compruebo que devuelven false con una letra incorrecta
        assertNotEquals(UtilidadCheck.calculaLetraDNI(dni), 'A');
        assertNotEquals(UtilidadCheck.calculaLetraDNI(dni2), 'M');

        //Le paso un DNI con un mal formato
        assertNotEquals(UtilidadCheck.calculaLetraDNI(dniMal), 'N');
        assertNotEquals(UtilidadCheck.calculaLetraDNI(dniMal2), 'H');
        assertEquals(UtilidadCheck.calculaLetraDNI(dniMal), '-');
    }

    @Test
    public void testGetLetraDNI() {
        //Le paso los DNI y compruebo que dan la letra correcta
        assertEquals(UtilidadCheck.getLetraDNI(dni), 'N');
        assertEquals(UtilidadCheck.getLetraDNI(dni2), 'S');

        //Compruebo que devuelve false con una letra incorrecta
        assertNotEquals(UtilidadCheck.getLetraDNI(dni), 'A');
        assertNotEquals(UtilidadCheck.getLetraDNI(dni2), 'M');

        //Le paso un DNI con un mal formato
        assertNotEquals(UtilidadCheck.getLetraDNI(dniMal), 'N');
        assertEquals(UtilidadCheck.getLetraDNI(dniMal), '-');
    }

    @Test
    public void testIsRelativePath() {
        //Compruebo que devuelve true con rutas correctas
        assertTrue(UtilidadCheck.isRelativePath(ruta));
        assertTrue(UtilidadCheck.isRelativePath(ruta2));
        assertTrue(UtilidadCheck.isRelativePath("./"));

        //Compruebo que devuelve false con una rutas incorrectas
        assertFalse(UtilidadCheck.isRelativePath(rutaMal));
        assertFalse(UtilidadCheck.isRelativePath(rutaMal2));
        assertFalse(UtilidadCheck.isRelativePath("C://noeque/noecuanto/"));
    }

    @Test
    public void testIsSubPath() {
        //Compruebo que devuelve true con rutas correctas
        assertTrue(UtilidadCheck.isSubPath(ruta));
        assertTrue(UtilidadCheck.isSubPath(ruta2));
        assertTrue(UtilidadCheck.isSubPath("./"));

        //Compruebo que devuelve false con una rutas incorrectas
        assertFalse(UtilidadCheck.isSubPath(rutaMal));
        assertFalse(UtilidadCheck.isSubPath(rutaMal2));
        assertFalse(UtilidadCheck.isSubPath("C://noeque/noecuanto/"));
    }
}
