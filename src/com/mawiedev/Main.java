package com.mawiedev;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
	String path = System.getProperty( "user.dir" );
	String line ="";
    try
    {
        BufferedReader reader = new BufferedReader( new FileReader( path + "/cities.csv" ) );
        
        while((line= reader.readLine()) != null)
        {
            String[] values = line.split( "," );
            System.out.println("LatD:" + values[0]);
        }
    } catch( IOException e ){
        e.printStackTrace();
    }
    
    }
}
