/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdsett3a5;
import java.util.*;
/**
 *
 * @author sanabenfadhel
 */
public class Gestion implements GestionEnseignant{
    HashSet<Enseignant> hash=new HashSet<>();
    @Override
    public void ajouterEnseignant(Enseignant e) {
        hash.add(e);
    }
    @Override
    public boolean rechercherEnseignant(Enseignant e) {
    return hash.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        
        for(Enseignant en:hash)
        {
            if(en.getId()==id)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hash.remove(e);
    }

    @Override
    public void displayEnseignants() {
        
        for(Enseignant en:hash)
        {
            System.out.println(en);
        }
    }
    
    
    public TreeSet<Enseignant> triparNom()
    {
    TreeSet<Enseignant> tre=new TreeSet<>();//comparable
    tre.addAll(hash);
    return tre;
    }
    
    public TreeSet<Enseignant> triparId()
    {
    TreeSet<Enseignant> tre=new TreeSet<>(new TriParID());//comparable
    tre.addAll(hash);
    return tre;
    }
}
