create table article (
    id serial not null,
    title varchar(255) not null,
    content text not null,
    primary key (id)
);