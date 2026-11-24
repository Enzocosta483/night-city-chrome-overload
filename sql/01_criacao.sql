CREATE DATABASE IF NOT EXISTS night_city_chrome_overload;


USE night_city_chrome_overload;


CREATE TABLE jogador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    vida INT NOT NULL,
    dinheiro INT NOT NULL,
    maxdocs INT NOT NULL,
    capitulo INT NOT NULL,
    capri_sincronizada BOOLEAN NOT NULL,
    status VARCHAR(30) NOT NULL
);


CREATE TABLE jogador_implante (
    jogador_id INT NOT NULL,
    codigo_implante VARCHAR(30) NOT NULL,
    equipado BOOLEAN NOT NULL,


    PRIMARY KEY (jogador_id, codigo_implante),


    FOREIGN KEY (jogador_id)
        REFERENCES jogador(id)
);