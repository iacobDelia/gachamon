package com.delia.gachamon.repository;

import com.delia.gachamon.model.Pokemon;
import com.delia.gachamon.model.PokemonCaught;
import org.springframework.data.repository.ListCrudRepository;

public interface CaughtRepository extends ListCrudRepository<PokemonCaught, Integer> {
}
