package pokemons;

// TODO Ecrire la classe Pokemon
// 

public abstract class Pokemon {
    private String nom;
    private double poids;

    public Pokemon(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    protected String getNom() {
        return nom;
    }

    protected double getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "je suis un pokemon " + getNom() + " mon poids est de " + getPoids() + " kg, ";
    }

    public abstract double vitesse();

}