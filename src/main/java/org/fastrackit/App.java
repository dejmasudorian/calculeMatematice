package org.fastrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Adunare adunare = new Adunare();
        int suma = adunare.mathsum(12,13 );
        Inmultire produs = new Inmultire();
        int prod = produs.mathprod(14,15);
        Diferenta dif = new Diferenta();
        int diferenta = dif.mathdif(54,18 );
        Fractie fract = new Fractie();
        int fractie = fract.mathfract(55,3);

    }
}
