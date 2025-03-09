Para rodar a aplicação deverá criar o banco de dados no MySQL, segue os comandos para criar o banco:

create DATABASE desafioJava;

USE desafioJava;

CREATE TABLE produto (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(50) NOT NULL,
    dataValidade DATE,
    dataCadastro DATE,
    preco DECIMAL(13, 2) NOT NULL,
    ativo BOOLEAN NOT NULL
);
