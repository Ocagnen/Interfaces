/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovico;

import java.util.Comparator;

/**
 *
 * @author javier
 */
public class ComparadorNombre implements Comparator<Animal>{
    
    public int compare(Animal a1, Animal a2){
        
        return a1.getNombre().compareTo(a2.getNombre());
    }
}
