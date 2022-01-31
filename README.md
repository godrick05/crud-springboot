Primeiro crud com springboot

Startei criando o banco de dados utilizando 
create table pessoa (
	cd_pessoa int primary key auto_increment not null,
	nome varchar(200),
	sobrenome(200),
);

em seguida inserir um usuario utilizando

select * from pessoa;

insert into pessoa values (null, 'Henrique', 'Cunha');

Na criação no spring eu utilizei quatro dependencias que são elas: Spring web, jersey, My sql driver e spring data JPA

