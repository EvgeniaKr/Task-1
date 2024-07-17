Порядок запуска:
 - создать базу данных в PostgreSQL
 - в application.properties настроить подключение к базе данных
   - - spring.datasource.url=jdbc:postgresql://localhost:5432/{database name}
   - - spring.datasource.username={username}
   - - spring.datasource.password={password}
 - запустить приложение

Зависимости:
 - в папке entity представленны сущности представляющие объекты, которые хранятся в базе данных
 - в папке repository с помощью аннотации @Repository Spring автоматически реализует интерфейс репозитория для соответствующего класса
 - в папке DTO реализованы DTO обьектов
 - в папке DTO.Util реализуется mapping межде Entity  и DTO
 - в папке controller контроллеры работают с HTTP-запросами
 - в папке Service осуществляется взаимодействие с БД
