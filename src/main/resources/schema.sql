CREATE TABLE IF NOT EXISTS Pokemon (
    POKEID BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    NAME varchar(255)
);

CREATE TABLE IF NOT EXISTS PokemonCaught (
    POKEID BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    NAME varchar(255)
);