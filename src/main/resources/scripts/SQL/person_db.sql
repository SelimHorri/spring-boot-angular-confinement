
    create table person (
       id integer not null auto_increment,
        email varchar(255),
        fname varchar(255),
        lname varchar(255),
        password varchar(255),
        primary key (id)
    ) engine=InnoDB
