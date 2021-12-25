insert into USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
values ('user@gmail.com', 'Имя User', 'Фамилия User', '{noop}password'),
       ('admin@javaops.ru', 'Имя Admin', 'Фамилия Admin', '{noop}admin');

insert into USER_ROLE (ROLE, USER_ID)
values ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);
