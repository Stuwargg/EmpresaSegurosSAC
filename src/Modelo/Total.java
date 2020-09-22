package Modelo;

import java.util.Scanner;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class Total {

    public static void main(String[] args) {
        int edad = 0, asistentes, cantHombres, cantMujeres, joven, edadHombres, edadMujeres;
        double promMujeres, promHombres;
        String sexo = null;

        cantHombres = 0;
        cantMujeres = 0;
        edadHombres = 0;
        edadMujeres = 0;
        joven = 100;

        System.out.println("Bienvenidos a mi Fiesta");

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Digite su Edad: ");
        edad = input.nextInt();
        while (edad != 0) {

            if (edad != 0 && edad >= 18) {
                if (edad < joven) {
                    edad = joven;
                }
            }
            if (edad >= 18) {
                input = new Scanner(System.in);
                System.out.println("Digite su Genero (hombre) o (mujer): ");
                sexo = input.next();

                while (!"hombre".equals(sexo) && !"mujer".equals(sexo)) {

                    System.out.println("Caracter Invalido");
                    System.out.println("Digite su Genero (hombre) o (mujer): ");
                    input = new Scanner(System.in);
                    System.out.println("Digite su Genero (hombre) o (mujer): ");
                    sexo = input.next();
                }

                if ("hombre".equals(sexo)) {
                    cantHombres = cantHombres + 1;
                    edadHombres = edadHombres + edad;
                } else {
                    cantMujeres = cantMujeres + 1;
                    edadMujeres = edadMujeres + edad;
                }

            } else {
                System.out.println("No se Admiten menores de edad");
            }
        }

        System.out.println(" DATOS DE LA FIESTA ");

        promMujeres = edadMujeres / cantMujeres;
        promHombres = edadHombres / cantHombres;

        System.out.println("Cantidad de Asistentes: " + (cantHombres + cantMujeres));
        System.out.println("Cantidad de Mujeres: " + cantMujeres);

        System.out.println("Cantidad de Hombres: " + cantHombres);

        if (promMujeres > 0) {
            System.out.println("Promedio de edad Femenino: " + promMujeres);
        } else {
            System.out.println("Promedio de edad Femenino: No Aplica");
        }

        if (promHombres > 0) {
            System.out.println("Promedio de edad Masculino: " + promHombres);
        } else {
            System.out.println("Promedio de edad Masculino: No Aplica");
        }

        if (joven != 100 && joven != 0) {
            System.out.println("La Persona mas joven que asistio tenia: " + joven);
        } else {
            System.out.println("La Persona mas joven que asistio tenia: No Aplica");
        }  
    }

}
