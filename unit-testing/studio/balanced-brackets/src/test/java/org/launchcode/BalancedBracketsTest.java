package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void bracketsReturnsheck1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsReturnsheck2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }


    @Test
    public void bracketsReturnsheck3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }
    @Test
    public void bracketsReturnsheck4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[][]"));
    }

    @Test
    public void bracketsReturnsheck5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }
    @Test
    public void bracketsReturnsheck6() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][]Code"));
    }
    @Test
    public void bracketsReturnsheck7() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void bracketsReturnsheck8() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]]]"));
    }
    @Test
    public void bracketsReturnsheck9() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode"));
    }
      @Test
    public void bracketsReturnsheck10() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]]]]]"));
    }

    @Test
    public void bracketsReturnsheck11() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }
    @Test
    public void bracketsReturnsheck12() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    public void bracketsReturnsheck13() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[]"));
    }
}