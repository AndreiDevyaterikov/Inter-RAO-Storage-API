insert into COSTUMERS(COSTUMER_ID, FIRST_NAME, LAST_NAME)
values (1, 'Сергей', 'Петров'),
       (2, 'Василий', 'Смирнов');

insert into SALERS(SALER_ID, FIRST_NAME, LAST_NAME)
values (1, 'Владислав', 'Онегин'),
       (2, 'Петр', 'Васильев');

insert into STORAGES (STORAGE_ID, NAME)
values (1, 'Склад1'),
       (2, 'Склад2'),
       (3, 'Склад3');

insert into PRODUCTS (PRODUCT_ID, ARTICLE, NAME, STORAGE_ID)
values (1, 'art1', 'name1', 1),
       (2, 'art2', 'name2', 1),
       (3, 'art3', 'name3', 1),
       (4, 'art4', 'name4', 2),
       (5, 'art5', 'name5', 2),
       (6, 'art6', 'name6', 2)