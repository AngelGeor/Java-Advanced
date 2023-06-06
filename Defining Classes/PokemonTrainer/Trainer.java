package DefiningClasses_Ex.PokemonTrainer;

import java.util.List;

public class Trainer {


    private String name;



    private int numberOfBadges;
    private List<Pokemon> pokemonList;



    public Trainer(String name, int numberOfBadges, List<Pokemon> pokemonList) {
        this.name = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemonList = pokemonList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfBadges() {
        return numberOfBadges;
    }
    //@Override
 //   public String toString(){
    //    return String.format("%s %d %d", name, numberOfBadges,pokemonList.size());
   // }
}
