# Workshop MongoDB

API REST desenvolvida com **Java, Spring Boot e MongoDB**.

## Tecnologias

* Java
* Spring Boot
* Spring Data MongoDB
* MongoDB
* Maven

## Funcionalidades

* CRUD de usuários
* CRUD de posts
* Relacionamento entre usuários e posts
* Comentários
* DTOs
* Consultas com Spring Data MongoDB
* Consultas com `@Query`
* Filtros por texto e data
* Tratamento de exceções

## Endpoints

```text
GET    /users
GET    /users/{id}
GET    /users/{id}/posts
POST   /users
PUT    /users/{id}
DELETE /users/{id}

GET    /posts/{id}
GET    /posts?text={text}
GET    /posts/fullsearch
```

Projeto desenvolvido para prática de **Spring Boot, APIs REST e MongoDB**.
