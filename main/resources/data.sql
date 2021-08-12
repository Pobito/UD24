DROP table IF EXISTS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	dni integer,
	fecha date
);

insert into cliente (nombre, apellido,direccion,dni,fecha)values('Pepe','Sanchez','la mia',15873461, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Miguel','Canals','la tuya',46794312, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Maria','Antonia','la suya',19458372, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Aina','Gracia','la nuestra',59484342, NOW());
insert into cliente (nombre, apellido,direccion,dni,fecha)values('Pablo','Insa','la vuestra',73794842, NOW());