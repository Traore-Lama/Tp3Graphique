package graphique.tp3graphique.Models;

import java.util.ArrayList;
import java.util.List;

public class Film
{
    private String titre;
    private int nbEntree;
    private int anneeSortie;
    private Realisateur realisateur;
    private List<Acteur> acteurs;

    public Film(String titre, int nbEntree, int anneeSortie, Realisateur realisateur) {
        this.titre = titre;
        this.nbEntree = nbEntree;
        this.anneeSortie = anneeSortie;
        this.realisateur = realisateur;
        this.acteurs = new ArrayList<>();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbEntree() {
        return nbEntree;
    }

    public void setNbEntree(int nbEntree) {
        this.nbEntree = nbEntree;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void ajouterActeur(Acteur acteur) {
        acteurs.add(acteur);
    }

}
