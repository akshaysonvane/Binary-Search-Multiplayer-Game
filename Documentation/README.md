[![Stories in Ready](https://badge.waffle.io/Akshay2005/cmpe202-project.png?label=ready&title=Ready)](https://waffle.io/Akshay2005/cmpe202-project)
# cmpe202-project 

# Team Synergy's CMPE 202 Team Project

The contents of this GitHub Repository are licenced under the MIT License of which details can be found in LICENSE.txt file.
Google Sheet link : https://docs.google.com/spreadsheets/d/15NzJQWwixC-1mEwja2uZei3djryljsjT9jFzBL2GSU4/edit?usp=sharing

Design and Build Process:

For API Information: Look at file cmpe202-project\Project_202_Current\Server\API.docx
For Information on how to join the game: Look at file cmpe202-project\Project_202_Current\Server\To join the game.docx




Cloud Deployment Steps:

Step 1:
cd "cmpe202-project\Project_202_Current\Server"

Step 2:
javac -cp dist/restlet.jar;dist/restlet-json.jar;dist/json.jar -d build src/*.java

Step 3:
cd build
jar -cvfe ../dist/app.jar Mobilecloud .

Step 4: To run local machine
start java -cp dist/app.jar;dist/restlet.jar;dist/restlet-json.jar;dist/json.jar multiplayergameServer.MultiplayerGame

Step 5: To run on docker
docker build -t multiplayergame .
docker run --name multiplayergame -td --net=host multiplayergame

Step 6: To push image in docker hub
Create sgarg110325/multiplayergame on hub.
Tag the image as "docker tag c3c1c8ce078c sgarg110325/multiplayergame"
push the tag "docker push sgarg110325/multiplayergame"