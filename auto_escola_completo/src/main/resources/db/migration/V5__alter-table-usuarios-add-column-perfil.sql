alter table usuarios add perfil varchar(10) not null;
update usuarios set perfil = "USER";