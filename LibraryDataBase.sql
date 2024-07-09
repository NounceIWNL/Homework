---создание таблиц---

create table book_list (
	id bigint not null primary key,
	book_name varchar(64) not null,
	author_name varchar(64) not null,
	publishing_house_name_id varchar(120) not null,
	year_of_publishing varchar(64) not null,
	pages_number varchar(64) not null,
	pictures_number varchar(64) not null,
	price varchar(64) not null,
	library_branch_name_id varchar(64) not null,
	the_number_of_copies_of_a_particular_book_available_in_the_library varchar(120) not null,
	the_number_of_students_to_whom_a_particular_book_has_been_issued varchar(120) not null
);

CREATE TABLE `publishing_house`(
    `id` BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    `publishing_house_name` CHAR(255) NOT NULL
);
CREATE TABLE `faculties`(
    `id` BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    `fuculty_name` CHAR(255) NOT NULL
);

CREATE TABLE `library_branch`(
    `id` BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    `library_branch_name` CHAR(255) NOT NULL
);
CREATE TABLE `book_used_on_faculty`(
    `id` BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    `book_id` BIGINT NOT NULL,
    `faculty_id` BIGINT NOT NULL
);


---добавление данных---

insert into book_list (id, book_name, author_name, publishing_house_name_id,
year_of_publishing, pages_number, pictures_number, price, library_branch_name_id,
the_number_of_copies_of_a_particular_book_available_in_the_library,
the_number_of_students_to_whom_a_particular_book_has_been_issued)
values (1, 'Унесенные Ветром', 'Митчел М.', 1, 1936, 457, 13, 45, 1, 11, 3);
insert into book_list (id, book_name, author_name, publishing_house_name_id,
year_of_publishing, pages_number, pictures_number, price, library_branch_name_id,
the_number_of_copies_of_a_particular_book_available_in_the_library,
the_number_of_students_to_whom_a_particular_book_has_been_issued)
values (2, 'Ниндзя', 'Ластбадер Э.В.', 2, 1980, 512, 7, 55, 2, 7, 2);
insert into book_list (id, book_name, author_name, publishing_house_name_id,
year_of_publishing, pages_number, pictures_number, price, library_branch_name_id,
the_number_of_copies_of_a_particular_book_available_in_the_library,
the_number_of_students_to_whom_a_particular_book_has_been_issued)
values (3, 'Кошмары Аиста Марабу', 'Уэлш И.', 1, 1995, 387, 0, 50, 1, 3, 1);
insert into book_list (id, book_name, author_name, publishing_house_name_id,
year_of_publishing, pages_number, pictures_number, price, library_branch_name_id,
the_number_of_copies_of_a_particular_book_available_in_the_library,
the_number_of_students_to_whom_a_particular_book_has_been_issued)
values (4, 'Норвежский Лес', 'Мураками Х.', 2, 1987, 284, 0, 35, 1, 8, 1);
insert into book_list (id, book_name, author_name, publishing_house_name_id,
year_of_publishing, pages_number, pictures_number, price, library_branch_name_id,
the_number_of_copies_of_a_particular_book_available_in_the_library,
the_number_of_students_to_whom_a_particular_book_has_been_issued)
values (5, 'Оно', 'Кинг С.', 2, 1986, 1012, 0, 55, 2, 2, 0);

insert into publishing_house (id, publishing_house_name)
values (1, 'Кайлур');
insert into publishing_house (id, publishing_house_name)
values (2, 'Рондор');

insert into faculties (id, fuculty_name)
values (1, 'ГФ');
insert into faculties (id, fuculty_name)
values (2, 'ФФ');
insert into faculties (id, fuculty_name)
values (3, 'ИФ');

insert into library_branch (id, library_branch_name)
values (1, 'библиотека имени Л.Н.Толстого');
insert into library_branch (id, library_branch_name)
values (2, 'библиотека имени П.И.Ленина');


insert into book_used_on_faculty (id, book_id, faculty_id)
values (1, 1, 1);
insert into book_used_on_faculty (id,  book_id, faculty_id)
values (2, 2, 2);
insert into book_used_on_faculty (id,  book_id, faculty_id)
values (3, 3, 3);
insert into book_used_on_faculty (id,  book_id, faculty_id)
values (4, 2, 1);
insert into book_used_on_faculty (id,  book_id, faculty_id)
values (5, 1, 1);
insert into book_used_on_faculty (id,  book_id, faculty_id)
values (6, 2, 3);


select * from faculties
where id in (select faculty_id from book_used_on_faculty where book_id=2);

--запрос на выдачу данных по факультетам, которые используют конкретные книги в программе обучения---

select book_list.book_name AS Book_Name, GROUP_CONCAT(faculties.fuculty_name, ',') AS Faculties from book_list
join book_used_on_faculty on book_used_on_faculty.book_id=book_list.id
join faculties on faculties.id=book_used_on_faculty.faculty_id
group by book_list.book_name;







