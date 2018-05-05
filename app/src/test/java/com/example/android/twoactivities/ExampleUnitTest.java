package com.example.android.twoactivities;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() throws Exception {
        int actual=2;
        actual++;//3
        actual++;//4
        assertEquals(4,actual);//positive or negative
        //5


        return;

    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        int actual=2;
        assertEquals("Testing the values",2, actual);



    }

    @Test
    public void getDivision(){
        double d1=21;
        double d2=7;
        assertEquals(3,d1/d2,.01);
    }

}