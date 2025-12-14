package pokemons;

import java.util.ArrayList;

public class CollectionPokemons {

    private ArrayList<Pokemon> pokemons;

    public CollectionPokemons() {
        pokemons = new ArrayList<>();
    }

    public void ajouter(Pokemon p) {
        pokemons.add(p);
    }

    public double vitesseMoyenne() {
        if (pokemons.isEmpty())
            return 0;

        double total = 0;
        for (Pokemon p : pokemons) {
            total += p.vitesse();
        }
        return total / pokemons.size();
    }

    public double vitesseMoyenneSportifs() {
        double total = 0;
        int nb = 0;

        for (Pokemon p : pokemons) {
            if (p instanceof Sportif) {
                total += p.vitesse();
                nb++;
            }
        }

        return (nb == 0) ? 0 : total / nb;
        /*
         * if (nb == 0) {
         * return 0;
         * } else {
         * return total / nb;
         * }
         */
    }
}
