package org.fastrackit;
public class App 
{
    public static void main( String[] args )
    {
        Adunare adunare = new Adunare();

        adunare.mathsum(12,13 );
        adunare.mathsum(11.5,13 );
        adunare.mathsum(12,12.9 );
        adunare.mathsum(17.3,18.4 );


        Inmultire produs = new Inmultire();

        produs.mathprod(14,7);
        produs.mathprod(9.3,5);
        produs.mathprod(4,4.6);
        produs.mathprod(5.4,6.3);


        Diferenta dif = new Diferenta();
        dif.mathdif(54,18 );
        dif.mathdif(51.4,18 );
        dif.mathdif(54,24.5 );
        dif.mathdif(58.1,21.9 );


        Fractie fract = new Fractie();
        fract.mathfract(55,3);
        fract.mathfract(54.3,5);
        fract.mathfract(55,4.3);
        fract.mathfract(55.5,6.8);

    }
}
