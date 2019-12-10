package br.com.frsiqueira.logsstudy.service;

import br.com.frsiqueira.logsstudy.client.PokemonClient;
import br.com.frsiqueira.logsstudy.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    private PokemonClient pokemonClient;

    public Pokemon findByName(String name) {
        return this.pokemonClient.findByName(name);
    }
}
