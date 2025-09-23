CREATE TABLE pessoa(
	idpessoa serial not null primary key,
	nome varchar(100) not null,
	email varchar(100) not null
);

CREATE TABLE evento(
	idevento serial not null primary key,
	titulo varchar(50) not null,
	data_evento date not null,
	local_evento varchar(100) not null
);

CREATE TABLE pessoa_evento(
	idpessoa integer not null,
	idevento integer not null,
	foreign key (idpessoa) references pessoa(idpessoa),
	foreign key (idevento) references evento(idevento)
);
