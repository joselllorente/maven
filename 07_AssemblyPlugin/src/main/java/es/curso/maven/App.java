package es.curso.maven;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.debug("Mensaje");
        System.out.println( "Hello World!" );
        
    }
}
