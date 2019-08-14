package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

// Scans our project for spring components and autowires most of the libraries you want to use by enabling autoconfiguration
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

      //Below lines fires up spring boot when our public static main method is run
      SpringApplication.run(App.class, args);
    }
}
