public class Main {
    public static void main(String[] args) {
        Connection1 connection1 = new Connection1();
        Staff staff = new Staff();
        Football_Club football_club= new Football_Club();
        football_club.setName("sdad");
        football_club.setRate(500);
        staff.setFio("sdasda");


        // Скрипты с консоли

//        create table extra_project.football_club(
//                id int unique  not null ,
//                name varchar unique primary key not null ,
//                rate int unique not null
//);
//
//        create type extra_project.position as enum ('TRAINER','FOOTBALLER');
//        create table extra_project.staff (
//                id int unique not null ,
//                fio varchar unique not null ,
//                club_name varchar not null references "extra_project".football_club (name),
//                staff_position extra_project.position ,
//                salary int not null
//);
//
//        insert into"extra_project".football_club (id,name,rate)
//        values
//                (1,'Барселона',1),
//                (2,'Реал мадрид',2),
//        (3,'Манчестер Юнайтед',3),
//        (4,'Ювентус',4);
//
//        insert into"extra_project".staff (fio,staff_position,club_name,salary)
//        values
//                ('Марк-Андре','FOOTBALLER','Барселона',10000),
//                ('Нето Мурара','FOOTBALLER','Барселона',15000),
//        ('Жерар Пике','FOOTBALLER','Барселона',25000),
//        ('Ральф Кирби','TRAINER','Барселона',350000),
//        ('Франц Платко','TRAINER','Барселона',420000),
//        ('Рома Форнс','TRAINER','Барселона',295000),
//        ('Лука Модрич','FOOTBALLER','Реал мадрид',10000),
//        ('Тони Кроос','FOOTBALLER','Реал мадрид',16800),
//        ('Лукас Васкес','FOOTBALLER','Реал мадрид',25000),
//        ('карло Анчелотти','TRAINER','Реал мадрид',650000),
//        ('Зинедин Зидан','TRAINER','Реал мадрид',760000),
//        ('Де Хея','FOOTBALLER','Манчестер Юнайтед',36000),
//        ('Т.Хитон','FOOTBALLER','Манчестер Юнайтед',18000),
//        ('Л.Мартинес','FOOTBALLER','Манчестер Юнайтед',29000),
//        ('Т.Менги','FOOTBALLER','Манчестер Юнайтед',23000),
//        ('К.Роналду','FOOTBALLER','Манчестер Юнайтед',65000),
//        ('Дж.Санчо','FOOTBALLER','Манчестер Юнайтед',19000),
//        ('Алекс Фергюссон','TRAINER','Манчестер Юнайтед',750000),
//        ('Жозе Моуринью','TRAINER','Манчестер Юнайтед',700000),
//        ('Антонио Конте','TRAINER','Ювентус',190000),
//        ('Фабио Капелло','TRAINER','Ювентус',200000);
//
//        select * from"extra_project".football_club f inner join "extra_project".staff s on f.name = s.club_name

    }
}
