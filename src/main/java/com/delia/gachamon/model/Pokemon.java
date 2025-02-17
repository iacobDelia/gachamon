package com.delia.gachamon.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Pokemon(
        @Id
        @Column(value = "pokeId")
        Integer pokeId,
        @NotBlank
        @Column(value = "name")
        String name,
        @Column(value = "appearPower")
        Integer appearPower
) {
}
