package pokemons;

// TODO Ecrire la classe PokemonAquatique
// 
public abstract class PokemonAquatique extends Pokemon {
    private int nbNageoires;

    public PokemonAquatique(String nom, double poids, int nbNageoires) {
        super(nom, poids);
        this.nbNageoires = nbNageoires;
    }
    @Override
    public double vitesse(){
        return (super.getPoids()/25.0)*nbNageoires;
    }
    
    @Override
    public String toString() {
        return super.toString() + "ma vitesse est de " + vitesse() + "km/h, et j'ai " + nbNageoires + " nageaoires.";
    }
}