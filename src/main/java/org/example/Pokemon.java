package org.example;

public abstract class Pokemon {
    //num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece y tipo
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;

    //atacarPlacaje(), atacarArañazo() y atacarMordisco()

    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();

}
