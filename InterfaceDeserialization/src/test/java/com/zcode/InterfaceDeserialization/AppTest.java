package com.zcode.InterfaceDeserialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        //Let's initialize our sample array of cars
        Car cars[] = new Car[]{new Lexus("Lexus Is", 260, "Sedan", 3), new Acura("Acura Mdx", 193, "Suv")};
         
         //Create our gson instance
         GsonBuilder builder = new GsonBuilder();
         builder.registerTypeAdapter(Car.class, new InterfaceAdapter());
         Gson gson = builder.create();               

        //Let's serialize our array
         String carsJsonFormat = gson.toJson(cars, Car[].class);
        //Let's Print our serialized arrya
         System.out.println("Cars in Json Format: " + carsJsonFormat);
         
         Car [] carJsonArray = gson.fromJson(carsJsonFormat, Car[].class);
         //Let's print our car objects to verify
         System.out.println("\n**********************************************************************");
         System.out.println("My favorite Cars of 2015");
         for(Car aCar : carJsonArray){
             System.out.println(aCar);
         }
           System.out.println("**********************************************************************");
                                 
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
