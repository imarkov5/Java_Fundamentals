public class PokemonTest {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Pokemon pikachu = pokedex.createPokemon("Pikachu", 200, "Fire");
        Pokemon celebi = pokedex.createPokemon("Celebi", 300, "Water");
        Pokemon ditto = pokedex.createPokemon("Ditto", 250, "Rock");
        Pokemon charmander = pokedex.createPokemon("Charamander", 350, "Dragon");

        pokedex.listPokemon();

        pokedex.pokemonInfo(pikachu);
        celebi.attackPokemon(pikachu);
        pokedex.pokemonInfo(pikachu);

        
    }
}
