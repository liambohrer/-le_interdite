/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ile_interdite;

/**
 *
 * @author bohrerl
 */
public class Tuile {
    
    private String nom;
    private Etat etat;
    private int x;
    private int y;

    public Tuile(String nom) {
        this.setNom(nom);
    }
    
    public Tuile(String nom, Etat etat){
        
        this.setNom(nom);
        this.setEtat(etat);
        
    }
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
}
