package com.delia.gachamon.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com")
public class customProp {
    public Integer getNumPokes() {
        return numPokes;
    }

    public void setNumPokes(Integer numPokes) {
        this.numPokes = numPokes;
    }

    private Integer numPokes;
}
