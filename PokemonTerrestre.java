package pokemons;

// TODO Complétez la classe PokemonTerrestre
// 
public abstract class PokemonTerrestre extends Pokemon {

    private int pattes;
    private double taille;

    public PokemonTerrestre(String nom, double poids, int pattes, double taille) {
        super(nom, poids);
        this.pattes = pattes;
        this.taille = taille;
    }
    /*
    public int getPattes() {
        return pattes;
    }

    public double getTaille() {
        return taille;
    }
    */
    @Override
    public double vitesse() {
        return pattes * taille * 3;
    }

    @Override
    public String toString() {
        return super.toString() + "ma vitesse est de" + vitesse() + " km/h j'ai " + pattes
                + " pattes, ma taille est de " + taille + "m";
    }

}