

import java.util.Scanner;

public class programa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double cambio, euros, dolares;

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el cambio euro-dolar del dia de hoy");
        cambio = entradaTeclado.nextDouble();
        System.out.println("introduce la cantidad de euros a cambiar");
        euros = entradaTeclado.nextDouble();
        dolares = euros/cambio;
        System.out.println(dolares +"Dolares de cambio, por"+ euros+ "Euros");
        entradaTeclado.close();

    }

}
