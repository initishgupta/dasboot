package com.boot;

import static org.junit.Assert.assertTrue;
import static  org.junit.Assert.assertEquals;

import com.boot.controller.HomeController;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testApp() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
