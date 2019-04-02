/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovico;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Prueba {

    public static void main(String[] args) {

        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(new Animal("Perro", 20, LocalDate.of(2000, 1, 1)));
        lista.add(new Animal("Gato", 12, LocalDate.of(2006, 1, 1)));
        lista.add(new Animal("Cerdo", 4, LocalDate.of(2014, 1, 1)));
        lista.add(new Animal("Jabalo", 1, LocalDate.of(1999, 1, 1)));

        for (Animal animal : lista) {
            System.out.println(animal);
        }

        lista.sort(new ComparadorNombre());

        System.out.println("--------ORDENADOS POR NOMBRE----------");
        lista.forEach(System.out::println);

        lista.sort(new ComparadorEdad());

        System.out.println("--------ORDENADOS POR EDAD----------");
        lista.forEach(System.out::println);

        lista.sort(new ComparadorFechaNacimiento());

        System.out.println("--------ORDENADOS POR FECHA NACIMIENTO----------");
        lista.forEach(System.out::println);

    }

}
