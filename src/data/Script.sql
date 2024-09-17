create database bdJava

create table tbstatus(
id int not null primary key auto_increment,
descricao varchar(100) not null
)

select * from tbstatus
where descricao like '%a%'

create table tbprodutos(
id int not null primary key auto_increment,
descricao varchar(200) not null,
estoque decimal(10,2) not null default 0,
precoCusto decimal(10,2) not null,
precoVenda decimal(10,2) not null,
idStatus int not null references tbstatus(id)
)