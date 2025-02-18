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
        @Column(value="APPEARPOWER")
        int appearPower;

        public Pokemon(Integer id, String name, int appearPower) {
                this.id = id;
                this.name = name;
                this.appearPower = appearPower;
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAppearPower() {
                return appearPower;
        }

        public void setAppearPower(int appearPower) {
                this.appearPower = appearPower;
        }

        @Override
        public String toString() {
                return "Pokemon{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", appearPower=" + appearPower +
                        '}';
        }
}
