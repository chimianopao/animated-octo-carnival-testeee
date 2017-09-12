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
        int ab = s.nextInt();
        System.out.println("olar, digita outro");
        int ac = s.nextInt();
        s.close();
        double r = Sum.sum(ab, ac);
        
        System.out.println("soma = "+r);
        
    }
}
