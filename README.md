# extrato-lancamentos


## Extrato de Lançamentos
Dados de lançamentos em contas bancárias importados de um sistema legado, com a função de ser disponibilizados em uma api e webapp.

## Técnologias

Java 8
Spring Boot
Spring Data Rest
h2 database
AngularJS
Twitter bootstrap

## Como executar

Usando o mavem utilize os comandos abaixo:   
mvn spring-boot:run  
ou  
mvn clean package  
java -jar target/extrato-lancamentos-0.0.1-SNAPSHOT.jar

## HTTP states
Os códigos de status <a href="https://github.com/for-GET/know-your-http-well/blob/master/status-codes.md">comum de resposta HTTP </a> será usado nesta API.

## Media Types
application/json

## Endpoints

### Listar Lançamentos 
GET /api/lancamentos HTTP/1.1  
Host: localhost:8080  
Content-Type: application/json
