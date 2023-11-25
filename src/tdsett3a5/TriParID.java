/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdsett3a5;

import java.util.Comparator;

/**
 *
 * @author sanabenfadhel
 */
public class TriParID implements Comparator<Enseignant>{

    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        
        return o2.getId()-o1.getId();
    }
    
}
