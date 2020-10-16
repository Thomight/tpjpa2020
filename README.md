# Template de projet pour le TP JPA 2020

## Auteur

- Le Floch Thomas

### Installer mysql et phpmyadmin à l’aide de docker

- sudo service mysql stop

- docker run --name some-mysql  -p 3306:3306 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest

- docker run --name myadmin -d --link some-mysql:db -p 8082:80 phpmyadmin

Php myadmin est accessible alors sur <http://localhost:8082>

Votre base de données est configurable sur localhost sur le port 3306, utilisateur root, password my-secret-pw

- docker start some-mysql myadmin

Pour supprimer les containers

- docker stop myadmin some-mysql
- docker rm myadmin some-mysql

### Lancer le TP

- exectuer le fichier /src/main/java/jpa/JpaTest.java
