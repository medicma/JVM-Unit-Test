package com.wolfenterprisesllc.jvmunittest;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Created by Leslye on 12/28/2017.
 */

public class PackageName {

    @Test
    public void isTheNameCorrect() throws Exception {
        String string1="Sasha";
        String string2="Jakie";
        String string3="Kahn";
        String string4="Valkyrie";
        String string5="Sasha";
        String string6="Jakie";
        String string7="Kahn";
        String string8="Valkyrie";
        String notHere=null;
        int variable1=14;
        int	variable2=28;
        int variable3=42;
        int variable4=16464;
        int variable5=392;
        Boolean bool=true;
        String[] Array1 = {"the", "brown", "fox"};
        String[] Array2 = { "jumped", "the", "dog" };


        assertEquals(string1,string5);
        assertEquals(variable5,variable1*variable2);
        assertEquals(variable3,variable1+variable2);
        assertEquals(variable4,variable1*variable2*variable3);
        assertSame(string5, string1);
        assertNotSame(string1, string7);
        assertNotNull(string8);
        assertNull(notHere);
        assertTrue(bool);
        assertFalse(Array1==Array2);
        assertArrayEquals(Array1, Array2);  //THIS SHOULD BE THE ONLY FAIL POINT

    }
}
