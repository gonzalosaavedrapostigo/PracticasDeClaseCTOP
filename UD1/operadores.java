package UD1;

public class operadores {

    public static void main(String[] args) {
        /* Tipos de operadores ARITMÉTICOS */

        // Operadores de asignación
        int edadPadre = 9;
        int edadHijo = 10;

        int sumaEdades = 0;

        // operador: suma +
        // edadPdre + edadHijo  // necesita el operador de asignación
        sumaEdades = edadPadre + edadHijo;
        System.out.println("La suma de las edades es: " + sumaEdades);

        // Dentro de java están disponibles todas las operaciones básicas
        // Suma +
        // Resta -
        // Multiplicación *
        // División /
        // Módulo %
        int restaEdades = edadPadre - edadHijo;
        System.out.println("La resta de las edades es: " + restaEdades);

        // Operador división
        int media = edadHijo + edadPadre / 2;  
        // Esto está mal pq hay precedencia de operadores, 
        // la división siempre se hace antes que la suma

        media = (edadHijo + edadPadre) / 2; // Así ya está bien
        media = sumaEdades / 2; // esto es mas eficiente, me ahorro una suma
        

        // Producto de edades
        int dobleHijo = edadHijo * 2;

        // operador módulo
        // el operador %  es el resto de la división entera
        int resto = 35 % 2;

        System.out.println("El resto de 35 entre 2 es: " + resto);


        edadHijo = edadHijo + 10;
        edadHijo += 10;
        edadHijo -= 10;
        edadHijo *= 2;
        edadHijo /= 2;
        System.out.println("La edad del hijo es: " + edadHijo);

        edadHijo = edadHijo + 1;
        edadHijo += 1;
        
 
        edadHijo = 10;
        edadHijo++; // Operador de incremento
        System.out.println("1. La edad del hijo es: " + edadHijo);

        edadHijo = 10;
        ++edadHijo;
        System.out.println("1. La edad del hijo es: " + edadHijo);

        System.out.println("2. La edad del hijo es: " + ++edadHijo); // primero usa el valor y luego incrementa

        System.out.println("3. Despues de la asignación la edad del hijo es: " + edadHijo); // ya está incrementada
    }
}
