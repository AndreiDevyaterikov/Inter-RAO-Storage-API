create table if not exists costumers
(
    costumer_id         integer primary key,
    first_name varchar,
    last_name  varchar
);

create table if not exists salers
(
    saler_id         integer primary key,
    first_name varchar,
    last_name  varchar
);

create table if not exists storages
(
    storage_id   integer primary key,
    name varchar
);

create table if not exists products
(
    product_id         integer primary key,
    article    varchar,
    name       varchar,
    storage_id integer,
    constraint FK_storage_id foreign key (storage_id) references storages (storage_id)
);