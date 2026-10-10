package ejecutar;

import motoo.Moto;

public class Lavadero {


    static void main() {

        Moto m1 = new Moto("HAC12D", "Wilson Pena", 125, false);

        System.out.println(m1.descripcion() + " paga " + m1.valorLavado());

        Moto m2 = new Moto("KLM34E", "Marcela Ortiz", 150, true);
        Moto m3 = new Moto("TRB78F", "Jorge Camargo", 250, true);

        System.out.println(m2.descripcion() + " paga " + m2.valorLavado());
        System.out.println(m3.descripcion() + " paga " + m3.valorLavado());

        int total = m1.valorLavado() + m2.valorLavado() + m3.valorLavado();
        System.out.println ( "Total del dia:" + total);

        m2.cilindraje = 250;

        int totalCorregido = m1.valorLavado() + m2.valorLavado() + m3.valorLavado();
        System.out.println ( "Total corregido: " + totalCorregido);
    }

}







