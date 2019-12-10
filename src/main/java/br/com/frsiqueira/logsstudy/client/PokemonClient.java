package br.com.frsiqueira.logsstudy.client;

import br.com.frsiqueira.logsstudy.dto.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://pokeapi.co/api/v2", name = "pokemon-client", decode404 = true)
public interface PokemonClient {

    @GetMapping(value = "/pokemon/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    Pokemon findByName(@PathVariable("name") String name);
}