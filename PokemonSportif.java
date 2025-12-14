package pokemons;

// TODO Ecrivez la classe PokemonSportifif.
// 

public class PokemonSportif extends PokemonTerrestre {
    private double frequence;

    public PokemonSportif(String nom, double poids, int nbPatte, double taille, double frequence) {
        super(nom, poids, nbPatte, taille);
        this.frequence = frequence;
    }

    public double getFrequenceCardiaque() {
        return frequence;
    }

    @Override
    public String toString() {
        return super.toString() + ", ma frequence cardiaque est de " + getFrequenceCardiaque()
                + " pulsations à la minute";
    }

}
