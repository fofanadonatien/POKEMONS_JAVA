package pokemons;

// TODO Ecrire la classe PokemonTerrestre.
// 
public class PokemonCasanier extends PokemonTerrestre {
    private double nbHTele;

    public PokemonCasanier(
            String nom,
            double poids,
            int nbPatte,
            double nbHTele,
            double taille) {
        super(nom, poids, nbPatte, taille);
        this.nbHTele = nbHTele;
    }

    public double getNbHTele() {
        return nbHTele;
    }

    @Override
    public String toString() {
        return super.toString() + ", je regarde la télé " + getNbHTele() + "h par jour";
    }
}
