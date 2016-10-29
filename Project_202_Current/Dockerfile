FROM openjdk

EXPOSE 8080

ADD ./dist/app.jar /c/shared/srv/
ADD ./dist/restlet.jar /c/shared/srv/restlet.jar
ADD ./dist/restlet-json.jar /c/shared/srv/restlet-json.jar
ADD ./dist/json.jar /c/shared/srv/json.jar
ADD ./dist/restlet-jackson.jar /c/shared/srv/restlet-jackson.jar
ADD ./dist/jackson-core-2.8.3.jar /c/shared/srv/jackson-core-2.8.3.jar
ADD ./dist/jackson-annotations-2.8.3.jar /c/shared/srv/jackson-annotations-2.8.3.jar
ADD ./dist/jackson-dataformat-smile-2.8.3.jar /c/shared/srv/jackson-dataformat-smile-2.8.3.jar
ADD ./dist/jackson-databind-2.8.3.jar /c/shared/srv/jackson-databind-2.8.3.jar
ADD ./dist/jackson-dataformat-xml-2.8.3.jar /c/shared/srv/jackson-dataformat-xml-2.8.3.jar
ADD ./dist/jackson-dataformat-yaml-2.8.3.jar /c/shared/srv/jackson-dataformat-yaml-2.8.3.jar
ADD ./dist/jackson-dataformat-csv-2.8.3.jar /c/shared/srv/jackson-dataformat-csv-2.8.3.jar

CMD java -cp /c/shared/srv/app.jar;/c/shared/srv/restlet.jar;/c/shared/srv/restlet-json.jar;/c/shared/srv/json.jar;/c/shared/srv/restlet-jackson.jar;/c/shared/srv/jackson-core-2.8.3.jar;/c/shared/srv/jackson-annotations-2.8.3.jar;/c/shared/srv/jackson-dataformat-smile-2.8.3.jar;/c/shared/srv/jackson-databind-2.8.3.jar;/c/shared/srv/jackson-dataformat-xml-2.8.3.jar;/c/shared/srv/jackson-dataformat-yaml-2.8.3.jar;/c/shared/srv/jackson-dataformat-csv-2.8.3.jar multiplayerGameServer.MultiplayerGame