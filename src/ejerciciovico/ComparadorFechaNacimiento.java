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
public class ComparadorFechaNacimiento implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        
        return o1.getFechaNac().compareTo(o2.getFechaNac());
        
    }
    
    
    
}
