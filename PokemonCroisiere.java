package pokemons;

// TODO Ecrire la classe PokemonCroisiere
// 
public class PokemonCroisiere extends PokemonAquatique {
    public PokemonCroisiere(String nom, double poids, int nbNageoire) {
        super(nom, poids, nbNageoire);
    }
    @Override
    public double vitesse(){
        return super.vitesse()/2.0;
    }

}