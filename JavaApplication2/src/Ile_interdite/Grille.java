/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ile_interdite;

import Ile_interdite.Utils.Pion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author bohrerl
 */
public class Grille {
   

    private ArrayList<Tuile> touteLesTuiles = new ArrayList<Tuile>(); 
    private int position[] = new int[2];
    private HashMap<Integer,Tuile>  grille = new HashMap<>();
    // La clé est la position . Exemple : Tuile en (2,3) a pour clé 23
    
    Grille(){
        touteLesTuiles.add(new Tuile("Le Pont des Abimes"));
        touteLesTuiles.add(new Tuile("La Porte de Bronze"));
        touteLesTuiles.add(new Tuile("La Caverne des Ombres"));
        touteLesTuiles.add(new Tuile("La Porte de Fer"));
        touteLesTuiles.add(new Tuile("La Porte d’Or"));
        touteLesTuiles.add(new Tuile("Les Falaises de l’Oubli"));
        touteLesTuiles.add(new Tuile("Le Palais de Corail"));
        touteLesTuiles.add(new Tuile("La Porte d’Argent"));
        touteLesTuiles.add(new Tuile("Les Dunes de l’Illusion"));
        touteLesTuiles.add(new Tuile("Heliport"));
        touteLesTuiles.add(new Tuile("La Porte de Cuivre"));
        touteLesTuiles.add(new Tuile("Le Jardin des Hurlements"));
        touteLesTuiles.add(new Tuile("La Foret Pourpre"));
        touteLesTuiles.add(new Tuile("Le Lagon Perdu"));
        touteLesTuiles.add(new Tuile("Le Marais Brumeux"));
        touteLesTuiles.add(new Tuile("Observatoire"));
        touteLesTuiles.add(new Tuile("Le Rocher Fantome"));
        touteLesTuiles.add(new Tuile("La Caverne du Brasier"));
        touteLesTuiles.add(new Tuile("Le Temple du Soleil"));
        touteLesTuiles.add(new Tuile("Le Temple de La Lune"));
        touteLesTuiles.add(new Tuile("Le Palais des Marees"));
        touteLesTuiles.add(new Tuile("Le Val du Crepuscule"));
        touteLesTuiles.add(new Tuile("La Tour du Guet"));
        touteLesTuiles.add(new Tuile("Le Jardin des Murmures"));
        Collections.shuffle(touteLesTuiles);
        int numeroTuile = 1;
        for ( int i=1; i==6;i++ ){
            for (int j=1; j==6;i++){
                if (i==1 && j==1||
                    i==1 && j==2||
                    i==2 && j==1||
                    i==1 && j==5||
                    i==1 && j==6||
                    i==2 && j==6||
                    i==5 && j==1||
                    i==6 && j==1||
                    i==6 && j==2||
                    i==5 && j==6||
                    i==6 && j==6||
                    i==6 && j==5){
                    grille.put(10*i+j,(new Tuile("",Etat.Inexistant)));
                }
                else{
                    Tuile tuile = touteLesTuiles.get(numeroTuile);
                    tuile.setX(i);
                    tuile.setY(j);
                    tuile.setEtat(Etat.Emergé);
                    
                    grille.put(10*i+j,tuile );
                    numeroTuile++;
                }
            }
                
        }
        
    }

    public HashMap<Integer, Tuile> getGrille() {
        return grille;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
