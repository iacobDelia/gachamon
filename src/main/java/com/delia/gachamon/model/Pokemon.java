package com.delia.gachamon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="POKEMON")
public class Pokemon{
        @Id
        @Column(value="POKEID")

        Integer id;
        @Column(value="NAME")
        String name;
        @Column(value="POKEDEXNUMBER")
        int pokedexNumber;

        public Pokemon(Integer id, String name, int pokedexNumber) {
                this.id = id;
                this.name = name;
                this.pokedexNumber = pokedexNumber;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public int getPokedexNumber() {
                return pokedexNumber;
        }

        public void setPokedexNumber(int pokedexNumber) {
                this.pokedexNumber = pokedexNumber;
        }

        public int getId() {
                return id;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
                return "Pokemon{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", pokedexNumber=" + pokedexNumber +
                        '}';
        }
}
