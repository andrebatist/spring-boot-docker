Установка и настройка docker + docker compose:
https://www.youtube.com/watch?v=V7lTLVzsK5U
ссылки:
https://docs.docker.com/engine/install/ubuntu/
https://docs.docker.com/compose/install/

Поскольку по умолчанию для запуска Docker требуются привилегии суперпользователя, необходимо вводить все команды с префиксом sudo. Ситуацию можно исправить, добавив нужного пользователя в группу docker:
sudo usermod -aG docker имяпользователя
Здесь будет создана группа docker, если она не существовала ранее, и в эту группу добавляется текущий пользователь.
Кроме того, потребуется перезапустить сервис Docker:
sudo service docker restart
Добавление какого-либо пользователя в группу docker равносильно предоставлению ему прав суперпользователя root.
Вы должны помнить о влиянии этого  действия на безопасность.

https://www.youtube.com/watch?v=e3YERpG2rMs&feature=emb_logo

In pom.xml add:

<build>
    <finalName>spring-boot-docker</finalName>
</build>

run mvn install command

sudo systemctl status docker

cd spring-boot-docker/

sudo docker build -t spring-boot-docker.jar .

sudo docker image ls

sudo docker run -p 9090:8080 spring-boot-docker.jar

http://localhost:9090/message
OR
http://ip/message
