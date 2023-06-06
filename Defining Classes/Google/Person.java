package DefiningClasses_Ex.Google;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Person {

    //1. Kompaniq v koqto raboti
    //2. Kola koqto kara
    //3. Spisak s roditeli
    //4. Spisak s deca
    //5 Spisak s pokomeni

    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;

    public Person() {
        // celta na tozi konstruktor e da suzdade prazen obekt
        // company = null; car = null; car = nul; parents = prazen spisuk, children = prazen spisuk, pokemoni = prazen spisuk
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();

    }

    public Person(Company company, Car car, List<Parent> parents, List<Child> children, List<Pokemon> pokemons) {

        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemons = pokemons;
    }

    //setter
    public void setCompany(Company company) {
        this.company = company;
    }

    //getter
    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //Company:
        //Car:
        //Trabant 30
        //Pokemon:
        //Electrode Electricity
        //Parents:
        //Children

        sb.append("Company:").append("\n");
        if (company != null) {
            sb.append(company).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null) {
            sb.append(car).append("\n");
        }
        sb.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemons) {
            sb.append(pokemon).append("\n");
        }
        sb.append("Parents:").append("\n");
        for (Parent parent : parents) {
            sb.append(parent).append("\n");
        }
        sb.append("Children:").append("\n");
        for (Child child : children) {
            sb.append(child).append("\n");
        }
        return sb.toString();
    }
}