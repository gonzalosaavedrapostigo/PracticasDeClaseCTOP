package UD1;

public class tiposdedatosenjava {
    public static void main(String[] args) {
        // Voy a poner mi código aquí

        /* Las variables son nombre a los cuales podemos asignar datos
          Tenemos que definir el tipo de dato que va a tener la variable
          El nombre deb dejar claro cual es el dato que va a guardar
         */

         // Tipo de datos númericos

         // a) variables de tipo de dato entero
         int edad;
         int edadInicial;
         int edadPadre;

         edad = 28;
         edad = 30;
         edad = 35;

         // Variables de tipo decimal
         double pi = 3.1416;
         float peso = 90.578678968f;

         // En una sola linea puedemos definir varias variables, separadas por comas
         //double altura, altura2;

         double altura = 1.75, altura2 = 1.80;

         
        // Tipo para cadenas de texto y caracteres
        String nombre = "Héctor18";
        char caracter = 'm';

        // Tipo de dato booleano
        // Este tipo de dato solo puede tener dos valores: true o false
        Boolean TengoCarnetDeConducir = true;
        TengoCarnetDeConducir = false;


        // Aqui se escribe el código del programa
        System.out.println("Hector Cordero tiene " + edad + " años");
    }
}
