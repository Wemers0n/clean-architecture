
# Clean Architecture com Java Spring Boot

O objetivo deste projeto é aplicar meus conhecimentos em Clean Architecture e aprofundar o estudo dos princípios e práticas propostos pela arquitetura. Este projeto também visa melhorar e por em prática minhas habilidades em desenvolvimento de software, arquitetura de sistemas e uso de frameworks como Spring.

## Tecnologias

- Spring Boot 
- Spring Data Jpa
- H2 Database
- Lombok

## Utilização do projeto

Fazendo clone do repositório

```
$ git clone https://github.com/Wemers0n/clean-architecture.git
```

```
$ cd clean-architecture
```

Executando
```
$ mvn clean install
```

```
$ mvn spring-boot:run
```
## Endpoints

#### Retorna todos os usuários

```http
  GET /api/users

  	{
		"username": "Teste",
		"email": "teste@gmail.com"
	}
```
#### Faz a criação dos usuários

```http
  POST /api/users

    {
        "username" : "Teste",
        "password" : "12345678",
        "email" : "teste@gmail.com"
    }
```

