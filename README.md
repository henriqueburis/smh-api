# smh-api
api Spring boot with dockerfile

build
sudo docker build -T smh-api:latest .

run
sudo docker container run --name smh-api -d -p 8686:8080 <image id or name>

