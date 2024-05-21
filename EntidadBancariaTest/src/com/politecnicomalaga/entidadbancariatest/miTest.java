package com.politecnicomalaga.entidadbancariatest;

import com.politecnicomalaga.entidadbancaria.Cuenta;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicTextFieldUI;


public class miTest {
    //Inicializa variables y objetos
    private Cuenta c1;
    private String ccc, ccc2, fechaApertura, fechaApertura2;
    private float saldo, saldo2, ingreso, retirada;

    @BeforeEach
    public void inicializarObjetos() {
        ccc = "1234";
        saldo = 200f;
        fechaApertura = "21/04/2024";

        ccc2 = "4567";
        fechaApertura2 = "08/03/2024";
        saldo2 = 300f;
        ingreso = 100f;
        retirada = 50f;

        c1 = new Cuenta(ccc, saldo, fechaApertura);
    }

    //Test getters
    @Test
    public void testGetters() {
        assertTrue(c1.getCcc().equals(ccc));
        assertTrue(c1.getSaldo() == saldo);
        assertTrue(c1.getFechaApertura().equals(fechaApertura));
    }

    //Test setters
    @Test
    public void testSetters() {
        c1.setCcc(ccc2);
        c1.setFechaApertura(fechaApertura2);

        assertTrue(c1.getCcc().equals(ccc2));
        assertTrue(c1.getFechaApertura().equals(fechaApertura2));
    }

    //Test ingreso
    @Test
    public void testIngreso() {
        assertTrue(c1.getCcc().equals(ccc));
        assertTrue(c1.getSaldo() == saldo);
        assertTrue(c1.getFechaApertura().equals(fechaApertura));

        assertFalse(c1.ingresarEfectivo(0f));
        assertTrue(c1.getSaldo() == saldo);

        assertTrue(c1.ingresarEfectivo(ingreso));
        assertTrue(c1.getSaldo() == saldo2);

        assertFalse(c1.ingresarEfectivo(-5f));
        assertTrue(c1.getSaldo() == saldo2);
    }

    //Test retirada
    @Test
    public void testRetirada() {
        assertTrue(c1.getCcc().equals(ccc));
        assertTrue(c1.getSaldo() == saldo);
        assertTrue(c1.getFechaApertura().equals(fechaApertura));

        assertFalse(c1.retirarEfectivo(0f));
        assertTrue(c1.getSaldo() == saldo);

        assertFalse(c1.retirarEfectivo(-5f));
        assertTrue(c1.getSaldo() == saldo);

        assertFalse(c1.retirarEfectivo(c1.getSaldo() + 50f));
        assertTrue(c1.getSaldo() == saldo);

        assertTrue(c1.retirarEfectivo(retirada));
        assertTrue(c1.getSaldo() == saldo - retirada);
    }

    //Test actividad
    @Test
    public void testActiva() {
        assertTrue(c1.getCcc().equals(ccc));
        assertTrue(c1.getSaldo() == saldo);
        assertTrue(c1.getFechaApertura().equals(fechaApertura));

        assertFalse(c1.retirarEfectivo(0f));
        assertTrue(c1.isActiva());

        assertTrue(c1.retirarEfectivo(saldo));
        assertFalse(c1.isActiva());
    }
}
