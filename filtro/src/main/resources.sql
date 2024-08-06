


use RiwiAcademyDB;


create table course(
id_course int primary key auto_increment not null,
namecourse varchar(50) not null unique,
description text,
teacher varchar(50)not null
);


create table qualification(
id_quialification int primary key auto_increment,
qualificationONe int not null,
qualificationTwo int not null,
qualificationThree int not null
);

create table student(
id_student int primary key auto_increment not null,
name varchar(50) not null,
email varchar(50) not null unique,
id_qualification int,
foreign key (id_qualification) references qualification(id_quialification),
status enum('asset','deactive') default 'asset'
);

create table inscription(
id_inscription int primary key auto_increment,
id_student int,
foreign key (id_student) references student(id_student),
id_course int,
foreign key (id_course) references course(id_course)
);

insert into qualification(qualificationONe,qualificationTwo,qualificationThree) values(70,80,50);

select * from  qualification;

select * from student;

select * from course;

select * from inscription;


insert into student(name,email,id_qualification,status) values('jonathan','suarezpadillajonathan@gmail.com',2,'asset');




