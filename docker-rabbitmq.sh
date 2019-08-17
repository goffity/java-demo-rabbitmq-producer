docker run -d --rm -p 15672:15672 -p 5672:5672 -v rabbit-data:/data --hostname rabbit-service --name awesome-rabbit rabbitmq:3-management
