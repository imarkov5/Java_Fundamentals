import java.util.ArrayList;
public class Pokedex extends AbstractPokemon{
    
    private static ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();


    public void listPokemon(){
        System.out.println("************List of Pokemons*************");
        for(Pokemon p : myPokemons){
            System.out.printf("Name: %s; Health: %d; Type: %s %n", p.getName(), p.getHealth(), p.getType());
            
        }
        System.out.println("********************************************");
    }
    @Override
    public Pokemon createPokemon(String name, int health, String type){
        Pokemon pokemon = super.createPokemon(name, health, type);
        myPokemons.add(pokemon);
        return pokemon;
    }
    @Override
    public void pokemonInfo(Pokemon pokemon){
        super.pokemonInfo(pokemon);
    }
}
