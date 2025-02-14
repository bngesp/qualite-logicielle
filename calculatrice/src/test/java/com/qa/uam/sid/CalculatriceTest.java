package com.qa.uam.sid;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatriceTest {

    @Test
    public void additionTest(){
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.addition(4, 5);
        assertEquals(9, som);
    }

    @Test
    public void additionValeurNegativeParTry()
    {
        Calculatrice calculatrice = new Calculatrice();
        try{
            calculatrice.addition(-1, 4);
            fail("l'addition ne marche pas");
        }catch (ArithmeticException exception){
            assertEquals("numerande negative", exception.getMessage());
        }
    }

    @Test
    public void additionValeurNegativeParAssertThrows(){
        Calculatrice calculatrice = new Calculatrice();
//        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculatrice.addition(-1, 5));
//        assertEquals("numerande negative", exception.getMessage());

        assertThrows("numerande negative", ArithmeticException.class, () -> calculatrice.addition(-1, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void additionValeurNegativeParAnnotation(){
        Calculatrice calculatrice = new Calculatrice();
        calculatrice.addition(-1, 5);
    }


    // ecrire les methodes de tests de division et gerer la division par 0

}
