insert into USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
values ('user@gmail.com', 'Имя User', 'Фамилия User', 'password'),
       ('admin@javaops.ru', 'Имя Admin', 'Фамилия Admin', 'admin');

insert into USER_ROLE (USER_ID, ROLE)
values (1, 'ROLE_USER'),
       (2, 'ROLE_ADMIN'),
       (2, 'ROLE_USER');
