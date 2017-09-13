package s2btstsum;

import java.io.IOException;
import java.util.Scanner;

/**
 * soma
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
    	Scanner s = new Scanner(System.in);
    	
    	System.out.println("olar, digita um numero");
        double ab = s.nextDouble();
        System.out.println("olar, digita outro");
        double ac = s.nextDouble();
        s.close();
        double r = Sum.sum(ab, ac);
        
        System.out.println("soma = "+r);
        
    }
}
