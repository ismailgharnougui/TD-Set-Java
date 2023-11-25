/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdsett3a5;

import java.util.TreeSet;

/**
 *
 * @author sanabenfadhel
 */
public class TDSett3A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Gestion gest=new Gestion();
        
        Enseignant ens1=new Enseignant(1, "ben fadhel", "sana");
        Enseignant ens2=new Enseignant(2, "tekya", "dorra");
        Enseignant ens3=new Enseignant(3, "hjiri", "wiem");
    Enseignant ens4=new Enseignant(3, "hjiri", "wiem");
    
    
    gest.ajouterEnseignant(ens1);
    gest.ajouterEnseignant(ens2);
    gest.ajouterEnseignant(ens3);
    gest.ajouterEnseignant(ens1);
    gest.ajouterEnseignant(ens4);
    
    
    gest.displayEnseignants();
    
        System.out.println(ens3.hashCode());
        System.out.println(ens4.hashCode());
        
        System.out.println(gest.rechercherEnseignant(ens4));
    
    TreeSet<Enseignant> tr=gest.triparNom();
        System.out.println(tr);
    }
    
}
