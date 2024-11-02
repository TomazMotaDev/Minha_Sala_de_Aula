CREATE DATABASE minha_sala_de_aula;

USE minha_sala_de_aula;

-- TABELA APRESENTAÇÃO
CREATE TABLE Apresentacao (
	id INT NOT NULL AUTO_INCREMENT,
    bio VARCHAR(255),
    metodologia TEXT(2000),
    logotipo BLOB,
    PRIMARY KEY(id)
);

-- TABELA PROFESSOR
CREATE TABLE Professor (
	id INT NOT NULL AUTO_INCREMENT,
    id_apresentacao INT NOT NULL,
    nome VARCHAR(60) NOT NULL,
    email VARCHAR(60),
    contato VARCHAR(15),
	PRIMARY KEY(id),
    FOREIGN KEY (id_apresentacao) REFERENCES Apresentacao (id)
);

-- TABELA FORMAÇÃO
CREATE TABLE Formacao (
	id INT NOT NULL AUTO_INCREMENT,
    id_professor INT NOT NULL,
    instituicao VARCHAR(60),
    curso VARCHAR(60),
    escolaridade VARCHAR(40),
    inicio VARCHAR(4),
    termino VARCHAR(4),
	PRIMARY KEY(id),
    FOREIGN KEY (id_professor) REFERENCES Professor (id)
);

-- TABELA INFO PACOTE
CREATE TABLE InfoPacote (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50),
    descricao TEXT (2000),
    tipo VARCHAR(15),
    perfil VARCHAR(15),
    duracaoAula TINYINT (3),
    PRIMARY KEY(id)
    
);

-- TABELA PACOTE DE AULA
CREATE TABLE PacoteDeAula (
	id INT NOT NULL AUTO_INCREMENT,
    id_professor INT NOT NULL,
    id_info_pacote INT,
    recorrenciaSemanal TINYINT (2),
    duracaoPacote TINYINT (2),
    valor VARCHAR(15) NOT NULL,
    atividade VARCHAR(10),
	PRIMARY KEY(id),
    FOREIGN KEY (id_professor) REFERENCES Professor (id),
    FOREIGN KEY (id_info_pacote) REFERENCES InfoPacote(id)
);

-- TABELA TURMA
CREATE TABLE Turma (
	id INT NOT NULL AUTO_INCREMENT,
    id_pacoteAula INT,
    atividade VARCHAR(10),
	PRIMARY KEY (id),
	FOREIGN KEY (id_pacoteAula) REFERENCES PacoteDeAula (id)
);

CREATE TABLE InfoTurma (
	id INT NOT NULL AUTO_INCREMENT,
	id_turma INT,
	nome VARCHAR(60) NOT NULL,
    observacaoTurma VARCHAR(255),
    dataPrevistaPag TINYINT(2),    
    PRIMARY KEY(id),
    FOREIGN KEY (id_turma) REFERENCES Turma (id)
);

-- TABELA ENDEREÇO
CREATE TABLE Endereco (
	id INT NOT NULL AUTO_INCREMENT,
	id_turma INT NOT NULL,
    rua VARCHAR(60),
    numero SMALLINT(5),
    complemento VARCHAR(100),
    bairro VARCHAR(45),
    cidade VARCHAR(45),
	PRIMARY KEY(id),
	FOREIGN KEY (id_turma) REFERENCES Turma (id)
);

-- TABELA ALUNO
CREATE TABLE Aluno (
	id INT NOT NULL AUTO_INCREMENT,
    id_turma INT NOT NULL,
    nome VARCHAR(60) NOT NULL,
    idade TINYINT(2),
    observacao VARCHAR(255),
    atividade VARCHAR(10),
	PRIMARY KEY (id),
    FOREIGN KEY (id_turma) REFERENCES Turma (id)
);

-- TABELA AULA
CREATE TABLE Aula (
	id INT NOT NULL AUTO_INCREMENT,
    id_turma INT NOT NULL,
    nome VARCHAR(60) NOT NULL,
    data DATE NOT NULL,
    horario TIME NOT NULL,
    link VARCHAR(255),
    atividade VARCHAR(10),
	PRIMARY KEY (id),
    FOREIGN KEY (id_turma) REFERENCES Turma (id)
);

-- TABELA PLANEJAMENTO DE AULA
CREATE TABLE PlanejamentoDeAula (
	id INT NOT NULL AUTO_INCREMENT,
    id_aula INT NOT NULL,
    objetivo VARCHAR(255),
    conteudo VARCHAR(255),
    metodologia TEXT(2000),
    recursosDidaticos VARCHAR(255),
    atividade VARCHAR(10),
	PRIMARY KEY (id),
    FOREIGN KEY (id_aula) REFERENCES Aula (id)
);

-- TABELA PAGAMENTO
CREATE TABLE Pagamento (
	id INT NOT NULL AUTO_INCREMENT,
    id_turma INT NOT NULL,
    valor VARCHAR(15) NOT NULL,
    dataPagamento DATE NOT NULL,
    situacaoPagamento VARCHAR(10),
	PRIMARY KEY (id),
    FOREIGN KEY (id_turma) REFERENCES Turma (id)
);

/* INSERT INTO () VALUES 
	(
	); */