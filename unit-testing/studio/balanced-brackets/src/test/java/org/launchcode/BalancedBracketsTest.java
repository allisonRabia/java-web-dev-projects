package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTest {
    //TODO: add tests here
    //#1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //#2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //#3
    @Test
    public void onlyBracketsReturnsIncorrect() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //#4
    @Test
    public void bracketOnlyReturnOne() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //#5
    @Test
    public void returnsOnlyEmpty() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //#6
    @Test
    public void returnsLaunchCodeInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //#7
    @Test
    public void returnsCodeInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //#8
    @Test
    public void returnsUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));
    }

    //#9

    @Test
    public void returnsBracketsBeforeLaunchCode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //#10
    @Test
    public void returnsBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    //#11
    @Test
    public void returnsDobleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }


    //#12
    @Test
    public void returnsUnbalancedBracketsBeforeLaunchCode() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode[]"));

    }

    //#13
    @Test
    public void returnsUnbalancedBracketsLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));
    }

    //#14
    @Test
    public void bracketOnlyReturnOneLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //#15
    @Test
    public void returnsUnbalancedMiddleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));

    }


}



/*
    BALANCED BRACKETS
******
        "": true
        "[]": true
        "[LaunchCode]": true
        "Launch[Code]": true
        "[]LaunchCode": true
        "[]LaunchCode[]": true
        "[[LaunchCode]]": true


    UNBALANCED BRACKETS
******
        "][": false
        "[LaunchCode": false
        "Launch]Code[": false
        "[": false
        "[LaunchCode[]": false
        "]LaunchCode[]": false  */