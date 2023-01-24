create table if not exists costumers
(
    id         integer primary key,
    first_name varchar,
    last_name  varchar
);

create table if not exists salers
(
    id         integer primary key,
    first_name varchar,
    last_name  varchar
);

create table if not exists storages
(
    id   integer primary key,
    name varchar
);

create table if not exists products
(
    id         integer primary key,
    article    varchar,
    name       varchar,
    price      decimal,
    storage_id integer,
    constraint FK_storage_id foreign key (storage_id) references storages (id)
);