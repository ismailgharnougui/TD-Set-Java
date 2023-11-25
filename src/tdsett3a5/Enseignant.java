/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdsett3a5;

/**
 *
 * @author sanabenfadhel
 */
public class Enseignant implements Comparable<Enseignant>{

    private int id;
    private String nom, prenom;

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        return id + nom.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Enseignant en = (Enseignant) obj;
        if (en.id == this.id && nom.equals(en.nom)) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Enseignant o) {
        return this.prenom.compareTo(o.prenom);
    }
}
