package DefiningClasses_Ex.PokemonTrainer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainersMap = new LinkedHashMap<>();
        String input = scanner.nextLine();


        while (!input.equals("Tournament")) {
            //"{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}
            String[] inputArr = input.split("\\s+");
            String trainerName = inputArr[0];
            String pokemonName = inputArr[1];
            String pokemonElement = inputArr[2];
            int pokemonHealth = Integer.parseInt(inputArr[3]);

            Trainer trainer = new Trainer(trainerName, 0, new ArrayList<>());
            trainersMap.putIfAbsent(trainerName, trainer);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainersMap.get(trainerName).getPokemonList().add(pokemon);

            input = scanner.nextLine();
        }
        String elementsLine = scanner.nextLine();

        while (!elementsLine.equals("End")) {
            for (Trainer trainer : trainersMap.values()) {
                boolean isFound = false;
                for (Pokemon pokemon : trainer.getPokemonList()) {
                    if (pokemon.getElement().equals(elementsLine)) {
                        trainersMap.get(trainer.getName()).setNumberOfBadges(trainer.getNumberOfBadges() + 1);
                        isFound = true;
                        break;
                    }
                }
                if(!isFound) {
                    trainer.getPokemonList().forEach(pokemon -> pokemon.setHealth(pokemon.getHealth() - 10));
                    trainer.getPokemonList().removeIf(pokemon -> pokemon.getHealth() <= 0);
                }
            }
          elementsLine = scanner.nextLine();
        }
       // trainersMap.entrySet().stream().sorted((el1, el2) -> el2.getValue().getNumberOfBadges())
        trainersMap.entrySet().stream().sorted((el1, el2)-> {
            int result = Integer.compare(el2.getValue().getNumberOfBadges(),el1.getValue().getNumberOfBadges());

            return result;

        }).forEach(item ->{
            System.out.printf("%s %d %d%n", item.getKey(), item.getValue().getNumberOfBadges(),item.getValue().getPokemonList().size());
        });
    }
}
